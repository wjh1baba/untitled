package String.Equals;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        String okName = "CXK";
        String okPassword = "666";

        Scanner sc = new Scanner(System.in);
        System.out.println("登录用户");
        String name = sc.next();
        System.out.println("登录密码");
        String password = sc.next();

//        if (name == okName && password == okPassword)
//            System.out.println("登录成功");
//        else
//            System.out.println("登录失败");

//        使用 == 进行判断字符内容相等是不对的, ==只能判断他们地址是否相等
//        new对象的位置直接存储在堆内存中,而" "是保存在字符串常量池的

        if (okName.equals(name) && okPassword.equals(password))
            System.out.println("登录成功");
        else
            System.out.println("登录失败");

        String oksyscode = "23Adfd";
        String syscode = "23adfd";
        System.out.println(oksyscode.equals(syscode));
        System.out.println(oksyscode.equalsIgnoreCase(syscode));
    }
}
