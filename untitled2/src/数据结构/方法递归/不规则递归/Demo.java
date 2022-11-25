package 数据结构.方法递归.不规则递归;

public class Demo {
    static int sum;
    static double money;
    static int pz;
    static int gz;
    static int pj;
    public static void main(String[] args) {
        System.out.println(buy(10.0));
    }

    private static float buy(double money) {
        pj = (int) (money/2);
        sum += pj;
        pz += pj;
        gz +=pj;
        pj = pz/2 +gz/4;
        pz = pz%2;
        gz = gz%4;
        money = pj*2;
        pj = 0;
        if (money<2){
            System.out.println(pz);
            System.out.println(gz);
            return sum;}
        return buy(money);

    }
}
