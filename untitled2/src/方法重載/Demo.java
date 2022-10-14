package 方法重載;

public class Demo {
    public static int add(int a) {
        return a;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(int a, double b) {
        return a + b;
    }

    public static double add(double b, int a) {
        return a + b;
    }

    public static int add(int... a) {  //不定长参数方式
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(add(1));
        System.out.println(add(1, 2));
        System.out.println(add(1, 2.2));
        System.out.println(add(1.1, 2));
        System.out.println(add(1,2,3,4));
    }


}
