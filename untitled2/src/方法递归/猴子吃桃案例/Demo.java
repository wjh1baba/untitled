package 方法递归.猴子吃桃案例;

import java.io.File;

public class Demo {
    static int sum=1;
    public static void main(String[] args) {
        System.out.println(cj(10));
    }

    public static int cj(int n) {
//        n/2 -1,n,
        if (n==1){
            System.out.println(sum);
            return 1;}
        else
            return 2*cj(n-1)+2;
    }
}
