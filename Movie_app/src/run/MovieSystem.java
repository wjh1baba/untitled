package run;

import beam.Business;
import beam.Customer;
import beam.Movie;
import beam.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MovieSystem {
    public static final List<User> ALL_User = new ArrayList<>();
    public static final Map<Business, List<Movie>> ALL_Movie = new HashMap<>();
    public static final Scanner sc = new Scanner(System.in);
    public static User loginuser;
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    public static final Logger LOGGER = LoggerFactory.getLogger("MovieSystem.class");

    static {
//        String username, String password, String name, char sex, int phone, double money
        Customer c1 = new Customer("登录名1", "123", "李冲", '女', "13343568244", 11.1);
        Customer c2 = new Customer("登录名2", "1234", "李冲2", '男', "110", 500);
        ALL_User.add(c1);
        ALL_User.add(c2);
        Business b1 = new Business("登录名3", "12345", "李冲33", '男', "119", 50000, "春天国际影城", "拉美步行街");
        Business b2 = new Business("登录名4", "12346", "李冲4", '男', "120", 100000, "春天国际影城二楼", "拉美步行街3");
        ALL_User.add(b1);
        ALL_User.add(b2);
//        String name, String actor, double score, double time, double price, int number, Date startTime

        List<Movie> movies1 = new ArrayList<>();
        List<Movie> movies2 = new ArrayList<>();
        ALL_Movie.put(b1, movies1);
        ALL_Movie.put(b2, movies2);
    }


    public static void main(String[] args) {
        sysshow();
    }

    private static void sysshow() {
        while (true) {
            System.out.println("=============欢迎来到天猫影城===============");
            System.out.println("1,用户/商家 登录");
            System.out.println("2,用户注册");
            System.out.println("3.商家注册");
            System.out.println("4.退出");
            System.out.println("请输入你的操作:");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    login();
            }
        }
    }

    private static void login() {
        System.out.println("===========欢迎进入登录界面===========");
        while (true) {
            System.out.println("在用户名栏请输入exc可以退出");
            System.out.println(ALL_User);
            System.out.println("请输入你的用户名:");
            String name = sc.next();
            if (name.equals("exc"))
                return;
            for (User user : ALL_User) {
                if (user.getUsername().equals(name)) {
                    System.out.println("请输入你的密码:");
                    String password = sc.next();
                    if (user.getPassword().equals(password)) {
                        System.out.println("登陆成功");
                        loginuser = user;
                        LOGGER.info(loginuser.getUsername() + "已登录");
                        if (user instanceof Customer)
                            showC();
                        else
                            showB();
                        return;
                    } else
                        System.out.println("密码错误,请重新输入");
                }
            }
            System.out.println("没有此用户");
        }
    }

    private static void showC() {
        System.out.println("============天猫影城用户界面===========");
        while (true) {
            System.out.println("欢迎" + loginuser.getUsername() + "登陆成功");
            System.out.println("1.展示全部影片信息:");
            System.out.println("2.查询电影:");
            System.out.println("3.评分功能:");
            System.out.println("4.购票功能:");
            System.out.println("5.退出系统:");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    showMovies();
                case 2:
                    seleMovies();
                case 3:
                    pfMovies();
                case 4:
                    buyMovies();
                case 5:
                    return;
                default:
                    System.out.println("请输入1-5");
            }
        }
    }

    private static void showMovies() {
    }

    private static void buyMovies() {
        System.out.println("=============欢迎来到购票界面=============");
        System.out.println("请输入你要观看的商家:");
        String bname = sc.next();
        for (Business business : ALL_Movie.keySet()) {
            if (business.getUsername().equals(bname)) {
                showMovies1(business);
            }
        }

    }

    private static void pfMovies() {
    }

    private static void seleMovies() {
    }

    private static void showMovies1(Business business) {
        List<Movie> movies = ALL_Movie.get(business);
        System.out.println("===========电影有========");
        if (movies.size() > 0) {
            System.out.println("\t片名\t\t\t主演\t\t时长\t\t评分\t\t票价\t\t\t剩余票数\t\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println(movie.getName() + "\t\t\t" + movie.getActor() + "\t\t" + movie.getTime() + "\t\t" +
                        movie.getScore() + "\t\t" +
                        movie.getPrice() + "\t\t" +
                        movie.getNumber() + "\t\t" + sdf.format(movie.getStartTime()));
            }
        } else
            System.out.println("当时前没有电影播放");
    }

    private static void AddMovies() {
        Business bs = (Business) loginuser;
        List<Movie> movies = ALL_Movie.get(bs);
//        String name, String actor, double score, double time, double price, int number, Date startTime
        System.out.println("请输入电影名");
        String name = sc.next();
        System.out.println("请输入电影主演");
        String actor = sc.next();
        System.out.println("请输入电影时长");
        double time = sc.nextDouble();
        System.out.println("请输入电影票价");
        double price = sc.nextDouble();
        System.out.println("请输入电影余票");
        int number = sc.nextInt();
        while (true) {
            try {
                System.out.println("请输入电影放映时间 yyyy/MM/dd HH:mm:ss");
                sc.nextLine();
                String startTime = sc.nextLine();
                movies.add(new Movie(name, actor, time, price, number, sdf.parse(startTime)));
                System.out.println("恭喜你" + "《" + name + "》" + "上架成功");
                return;
            } catch (ParseException e) {
                e.printStackTrace();
                System.out.println("放映时间格式不正确");
            }
        }
    }

    private static void showB() {
        System.out.println("==========黑马电影商家界面============");
        while (true) {
            System.out.println("1.展示全部影片信息:");
            System.out.println("2.上架电影:");
            System.out.println("3.下架电影功能:");
            System.out.println("5.退出:");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    showBMovies();
                    break;
                case 2:
                    AddMovies();
                    break;
                case 3:
                    delMovies();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("请输入1-5");
            }
        }

    }


    private static void delMovies() {
        System.out.println("输入你要下架的电影:");
        String name = sc.next();
        Business bs = (Business) loginuser;
        List<Movie> movies = ALL_Movie.get(bs);
        if (movies.size() > 0) {
            for (int i = 0; i < movies.size(); i++) {
                if (movies.get(i).getName().equals(name)) {
                    movies.remove(i);
                    System.out.println("你已经成功下架" + name);
                    i--;
                }
            }
        }
    }

    private static void showBMovies() {
        System.out.println("=============商家详情界面===========");
        LOGGER.info(loginuser.getUsername() + "在查看详情");
        Business bs = (Business) loginuser;
        System.out.println(bs.getUsername() + "\t\t电话:" + bs.getPhone() + "\t\t地址:" + bs.getAddress());
        List<Movie> movies = ALL_Movie.get(bs);
        if (movies.size() > 0) {
            System.out.println("\t片名\t\t\t主演\t\t时长\t\t评分\t\t票价\t\t\t剩余票数\t\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println(movie.getName() + "\t\t\t" + movie.getActor() + "\t\t" + movie.getTime() + "\t\t" +
                        movie.getScore() + "\t\t" +
                        movie.getPrice() + "\t\t" +
                        movie.getNumber() + "\t\t" + sdf.format(movie.getStartTime()));
            }
        } else
            System.out.println("当时前没有电影播放");
    }
}
