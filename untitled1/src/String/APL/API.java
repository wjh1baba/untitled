package String.APL;

import java.util.Random;
import java.util.Scanner;

public class API {
public static void main(String[] args) {
    Exec();
    Exec1();
}

//手机号屏蔽
    private static void Exec1() {
        Scanner sc = new Scanner(System.in);
        String numbur = sc.next();
        String c1 = numbur.substring(0,3);
        String c2 = numbur.substring(7);
        String numburmax = c1+"****"+c2;
        System.out.println(numburmax);
    }


    //    验证码
private static void Exec() {
    String date = "abcdefghijklmnopqrstuvwsyzABCDEFGHIJKLMNOPQRSTUVWSYZ";
    Random rd = new Random();
    StringBuilder code = new StringBuilder();
    for (int i = 0; i < 5; i++) {
        int index = rd.nextInt(date.length());
        code.append(date.charAt(index));
    }
    System.out.println(code);
    }

}
