package 购物车案例;

import java.util.Scanner;

public class ShopCarTest {
    public static void main(String[] args) {
        Goods[] shopCar = new Goods[100];

        while (true) {
            System.out.println("请输入你选择的操作");
            System.out.println("add 增加 | query 查询 | update 修改 | pay 结算");
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            switch(command){
                case "add":
                    addGoogs(shopCar,sc);
                    break;
                case "query":
                    queryGoogs(shopCar,sc);
                    break;
                case "update":
                    upGoods(shopCar,sc);
                    break;
                case "pay":
                    payGoods(shopCar);
                    break;
                default:
                    System.out.println("没有此操作");
            }
        }
    }

    private static void addGoogs(Goods[] shopCar, Scanner sc) {
        System.out.println(" 请输入购物商品的编号" );
        int id = sc.nextInt();
        System.out.println(" 请输入购物商品的名字" );
        String name = sc.next();
        System.out.println(" 请输入购物商品的价格" );
        double price = sc.nextDouble();
        System.out.println(" 请输入购物商品的数量" );
        int buynumber = sc.nextInt();

        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.price = price;
        g.buynumber = buynumber;

        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null){
                shopCar[i] = g;
                break;
            }
        }
        System.out.println("你选择的"+g.name+"已加入购物车");

    }

    private static void queryGoogs(Goods[] shopCar, Scanner sc) {
        System.out.println("============商品信息如下===========");
        System.out.println("id——name——价格——数量");

        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null){
                System.out.println(g.id + "\t\t"+g.name+"\t\t\t"+g.price+"\t\t\t"+g.buynumber );
            }
            else{
                System.out.println("商品展示完毕");
                break;
            }
        }
    }

    private static void upGoods(Goods[] shopCar, Scanner sc) {
        while (true) {
            System.out.println("请输入你需要修改的商品id");
            int id = sc.nextInt();
            Goods g = getGoodsbyId(shopCar,id);
            if (g != null) {
                System.out.println("原本数量是" + g.buynumber);
                System.out.println("请输入你需要修改的数量");
                g.buynumber = sc.nextInt();
                break;
            }
            else{
                System.out.println("不好意思没有找到");
            }
        }
    }

    private static Goods getGoodsbyId(Goods[] shopCar, int id) {
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (shopCar[i].id == id) {
                return g;

            } else {
                return null;
            }
        }
        return null;
    }

    private static void payGoods(Goods[] shopCar) {
        double sum = 0;
        for (int i = 0; i < shopCar.length; i++) {

            Goods g = shopCar[i];
            if (g != null) {
                double Price = g.buynumber * g.price;
                sum += Price;
            }
            else {
                break;
            }
        }
        System.out.println("总金额为"+sum);
    }


}
