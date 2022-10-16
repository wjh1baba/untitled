package 飞机票案例;

import java.util.Scanner;

public class pingweidafen {
    public static void main(String[] args) {
        System.out.println("输入有多少个评委");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        socoresnum(n);
    }

    public static void socoresnum(int n) {
        int[] socores = new int[n];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < socores.length; i++) {

            System.out.println("这是第" + (i+1)+"评委打分");
            int socore = sc.nextInt();

            socores[i] = socore;
        }
        int max = socores[0];
        int min = socores[0];
        int sum=0;
        for (int i = 0; i < socores.length; i++) {
            if(socores[i]>max){
                max = socores[i];

            }
            if(socores[i]<min){
                min = socores[i];

            }
            sum += socores[i];

        }

        double avg = (sum-max-min)*1.0/ (socores.length-2);
        System.out.println("max=" + max+",min="+min+",avg="+avg);
    }

}
