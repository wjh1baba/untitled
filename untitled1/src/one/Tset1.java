package one;
import java.util.Arrays;
import java.util.Scanner;

public class Tset1 {
    public static void main(String[] args) {
        System.out.println("请输入机票原价");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();

        System.out.println("请输入机票月份(1-12)");
        int mouth = sc.nextInt();

        System.out.println("请选择仓类型");
        String type = sc.next();

        System.out.println("money" + calc(money,mouth,type));
    }

    public static double calc(double money,int mouth,String type) {
        if (mouth >= 5 && mouth <= 12) {
            switch (type) {
                case "头等舱" -> money *= 0.9;
                case "商务舱" -> money *= 0.85;
                default -> {
                    System.out.println("舱室输入有误，请重新输入");
                    return -1;
                }


            }
        } else if (mouth >= 1 && mouth <= 4) {
            switch (type) {
                case "头等舱" -> money *= 0.7;
                case "商务舱" -> money *= 0.65;
                default -> {
                    System.out.println("舱室输入有误，请重新输入");
                    return -1;
                }
            }
        } else {
            System.out.println("月份输入有误");
            return -1;
        }
        return money;

    }}
