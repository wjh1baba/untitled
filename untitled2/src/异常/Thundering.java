package 异常;

import java.util.Scanner;

public class Thundering {
    public static void main(String[] args) {
        try {
            String name = "lichong";
            int age = Integer.parseInt("20L");
            System.out.println(age);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("66");
        }

    }
}
