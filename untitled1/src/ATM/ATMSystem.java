package ATM;

import javax.net.ssl.SSLContext;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        ArrayList<Account> ac = new ArrayList<>();
        while (true) {
            System.out.println("""
                    =========ATM系统=========
                    1.账户登录
                    2.账户开户"""
            );
            Scanner sc = new Scanner(System.in);

            System.out.println("请选择你的操作:");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    login(ac, sc);
                    break;
                case 2:
                    register(ac, sc);
                    break;
                default:
                    System.out.println("请输入0或1");
            }
        }
    }

    //登录
    private static void login(ArrayList<Account> ac, Scanner sc) {
        System.out.println("===========欢迎你来到登录页==========");
        System.out.println("已有" + ac.size() + "人");
        if (ac.size() == 0) {
            System.out.println("当前没有任何用户,请你先去开户");
            return;
        }
        while (true) {
            System.out.println("请输入你的银行卡号:");
            String CardId = sc.next();
            Account acc = querycardId(ac, CardId);
            if (acc != null) {
                while (true) {
                    System.out.println("账号输入正确,请输入你的密码:");
                    String password = sc.next();
                    if (acc.getPassWord().equals(password)) {
                        System.out.println("密码正确,");
                        System.out.println("恭喜你" + acc.getUserName() + "登录成功");
                        shouUserCommand(ac, sc, acc);
                        return;
                    } else
                        System.out.println("密码错误，请重新输入密码");
                }
            } else
                System.out.println("没有此账户,请重新输入你的银行卡号");
        }

    }


    //    private String cardId;
//    private String userName;
//    private String passWord;
//    private double morey;
//    private double quotaMorey;
    //开户
    private static void register(ArrayList<Account> ac, Scanner sc) {
        Account account = new Account();
        System.out.println("======欢迎进入开户界面=======");

        //姓名
        System.out.println("请输入你的姓名");
        String userName = sc.next();
        account.setUserName(userName);

        //密码
        while (true) {
            System.out.println("请输入你的密码");
            String password = sc.next();
            System.out.println("请再次确认你的密码");
            String okpassword = sc.next();
            if (okpassword.equals(password)) {
                account.setPassWord(okpassword);
                break;
            } else
                System.out.println("俩次密码不同请重新输入");
        }


        //取款
        System.out.println("请输入一次性最多取款多少");
        double quotaMorey = sc.nextDouble();
        account.setQuotaMorey(quotaMorey);

        //银行卡号

        String cardId = getRandomcardID(ac);
        System.out.println(cardId);
        account.setCardId(cardId);


        account.setMorey(0);

        System.out.println("恭喜你" + userName + "卡户成功，你的卡号为" + cardId);
        ac.add(account);
        System.out.println(ac.size());

    }

    private static void shouUserCommand(ArrayList<Account> ac, Scanner sc, Account acc) {
        while (true) {
            System.out.println("==========欢迎进入操作页面============");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销账户");
            System.out.println("请选择:");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    // 查询账户
                    queryacc(acc);
                    break;
                case 2:
                    //存款
                    depositMoney(acc, sc);
                    break;
                case 3:
                    //取款
                    drawMoney(acc, sc);
                    break;
                case 4:
                    //转账
                    transferMoney(ac, acc, sc);
                    break;
                case 5:
                    //修改密码
                    uppassword(acc, sc);
                    break;
                case 6:
                    System.out.println("成功退出");
                    return;
                //退出

                case 7:
                    //注册账户
                    System.out.println("是否确定销户 y是确定");
                    String rs = sc.next();
                    switch (rs) {
                        case "y": {
                            ac.remove(acc);
                            System.out.println("取消销户成功");
                            return;
                        }
                        default:
                            System.out.println("取消销户成功");
                    }
                    break;
            }
        }
    }

    private static void uppassword(Account acc, Scanner sc) {
        System.out.println("=================修改密码操作==================");

        while (true) {
            System.out.println("请输入你原先的密码");
            String oldpassword = sc.next();
            if (oldpassword.equals(acc.getPassWord())) {
                System.out.println("请输入你的新密码");
                String password = sc.next();
                System.out.println("请再次确认你的密码");
                String okpassword = sc.next();
                if (okpassword.equals(password)) {
                    acc.setPassWord(okpassword);
                    System.out.println("密码修改成功");
                    break;
                } else
                    System.out.println("俩次密码不同请重新输入");
            } else
                System.out.println("输入密码有误,请重新输入");
        }


    }

    //转账
    private static void transferMoney(ArrayList<Account> ac, Account acc, Scanner sc) {
        System.out.println("=============欢迎来到转账界面==============");
        System.out.println("你的限额是" + acc.getQuotaMorey() + ",你的余额是" + acc.getMorey());
        if (ac.size() < 2) {
            System.out.println("用户只有你一个，无法转账");
            return;
        }
        if (acc.getMorey() < 100) {
            System.out.println("余额小于100,请先去存款");
            return;
        }
        while (true) {
            System.out.println("输入你要转账卡号:");
            String cardId = sc.next();

            Account zhuanzhangduixiang = querycardId(ac, cardId);
            if (cardId.equals(acc.getCardId())) {
                System.out.println("请勿对自己转账");
                continue;
            }

            if (zhuanzhangduixiang == null)
                System.out.println("你输入的卡号不存在");
            else {
                System.out.println("找到账户" + zhuanzhangduixiang.getUserName() + "输入你要转入的金额:");
                double money = sc.nextDouble();
                if (acc.getQuotaMorey() < money)
                    System.out.println("超出取款上限,取款限额是" + acc.getQuotaMorey());
                else if (acc.getMorey() < money) {
                    System.out.println("你的余额不够,你的余额为" + acc.getMorey());
                } else {
                    acc.setMorey(acc.getMorey() - money);
                    zhuanzhangduixiang.setMorey(zhuanzhangduixiang.getMorey() + money);
                    System.out.println("转账成功");
                    queryacc(acc);
                    return;
                }
            }
        }

    }


    //取款
    private static void drawMoney(Account acc, Scanner sc) {
        System.out.println("=============欢迎来到取款界面==============");
        System.out.println("你的限额是" + acc.getQuotaMorey() + ",你的余额是" + acc.getMorey());
        if (acc.getMorey() < 100) {
            System.out.println("余额小于100,请先去存款");
            return;
        }
        while (true) {
            System.out.println("请您输入取款的金额:");
            double drawmoney = sc.nextDouble();
            if (acc.getQuotaMorey() < drawmoney)
                System.out.println("超出取款上限,取款限额是" + acc.getQuotaMorey());
            else if (acc.getMorey() < drawmoney) {
                System.out.println("你的余额不够,你的余额为" + acc.getMorey());

            } else {
                acc.setMorey(acc.getMorey() - drawmoney);
                System.out.println("取钱成功");
                queryacc(acc);
                return;
            }
        }
    }

    //存款
    private static void depositMoney(Account acc, Scanner sc) {
        System.out.println("=============欢迎来到存款界面==============");
        System.out.println("请您输入存款的金额:");
        double money = sc.nextDouble();
        acc.setMorey(money + acc.getMorey());
        System.out.println("恭喜你，存钱成功，当前账号信息如下:");
        queryacc(acc);
    }

    //展示账户信息
    private static void queryacc(Account acc) {
        System.out.println("==========展示账户信息============");
        System.out.println("姓名" + acc.getUserName());
        System.out.println("卡号" + acc.getCardId());
        System.out.println("账户余额" + acc.getMorey());
        System.out.println("限额" + acc.getQuotaMorey());
    }

    //生成8位数的银行卡号
    private static String getRandomcardID(ArrayList<Account> ac) {
        Random rm = new Random();
        while (true) {
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                cardId += rm.nextInt(10);
            }

            Account acc = querycardId(ac, cardId);
            if (acc == null)
                return cardId;
        }

    }

    //查找卡号是否重复
    private static Account querycardId(ArrayList<Account> ac, String cardId) {
        for (int i = 0; i < ac.size(); i++) {
            if (cardId.equals(ac.get(i).getCardId())) {
                System.out.println();
                return ac.get(i);
            }
        }
        return null;
    }
}
