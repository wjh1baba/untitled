package API_;

public class toString_XL {
    public static void main(String[] args) {
        test ts1 = new test("jj",'男',16);
        test ts2 = new test("jj",'男',16);
        System.out.println(ts1);  //打印原先Object.toSring API_.test@4eec7777
        System.out.println(ts2);
//        System.out.println(ts);   //在test重写toSring后打印    test{name='jj', sex=男, age=16}
        System.out.println(ts1.equals(ts2));   //equals
        System.out.println(ts1.getClass());

    }
}
