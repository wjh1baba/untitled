package StringBuilder_;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append(11);
        s.append("a");
        System.out.println(s);


        StringBuilder s2 = new StringBuilder();
        //支持链式编程
        s2.append(11).append("BB");
        System.out.println(s2);
        //恢复成String   toString已重写返回的是String类型的字符串
        String rs = s2.toString();
        check(rs);
    }

    private static void check(String rs) {
        System.out.println(rs);
    }


}
