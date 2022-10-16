package 内部类.匿名内部类;

public class lnterface_ {
    public static void main(String[] args) {

//        Swimming s = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("游泳");
//            }
//        };
        Swimming s = () -> System.out.println("游泳");   //lambda表达式
        s.swim();

        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("游泳");
            }
        });
    }

    public static void go(Swimming s) {
        s.swim();
    }

}

interface Swimming{
    void swim();
}


//class yundongyuan implements Swimming{
//
//    @Override
//    public void swim() {
//        System.out.println("游泳");
//    }
//}