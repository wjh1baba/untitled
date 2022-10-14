//package 第三章基础;
//
//import java.util.Scanner;
//
//public class ceshi {
//    public static void main(String[] args) {
//
//    Str();
//        for (int i = 1; i < 10; i++) {
//            System.out.println();
//            for (int j = 1; j < i+1; j++) {
//                System.out.print(i+"*"+j+"="+i*j+",");
//
////            }
//        }
//        int sum = 0;
//        for (int i = 0; i <= 100; i++) {
//            if (i%2==0){
//                sum+=i;
//            }
//        }
//        System.out.println(sum);
//}
//
//private static void Str() {
//        Scanner sc = new Scanner(System.in);
//        int zimu = 0;
//        int shuzi = 0;
//        int qita = 0;
//        System.out.println("输入字符串");
//        String a = sc.next();
//        for (int i = 0; i < a.length(); i++) {
//            if (a.equals("\n"))
//                break;
//            if ((a.charAt(i)>= 'a' && a.charAt(i)<= 'z') || ( a.charAt(i)>= 'A' && a.charAt(i) <= 'Z')){
//                zimu++;
//            }
//            else if(a.charAt(i) > 48&&  a.charAt(i)<= 57)
//                shuzi++;
//            else
//                qita++;
//        }
//        System.out.println("zimu,"+zimu);
//        System.out.println("shuzi,"+shuzi);
//        System.out.println("qita,"+qita);
//    }
//}
//
