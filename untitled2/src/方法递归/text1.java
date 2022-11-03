package 方法递归;

public class text1 {
    private static int sum = 1;
    public static void main(String[] args) {
        cj(5);
    }

    public static int cj(int n) {
//        1*2*3*4*5...*(n-1)*n
        if (n==1) {
            System.out.println(sum);
            return sum;
        }
        text1.sum = text1.sum * n;
        return cj(n - 1);
    }
}
