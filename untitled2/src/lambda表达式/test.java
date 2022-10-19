package lambda表达式;

public class test{
    public static void main(String[] args) {
//        new hello(){
//            @Override
//            public void say() {
//                System.out.println("这是lambda表达式");
//            }
//        };
        hello h = ()-> "这是lambda表达式";
        System.out.println(h.say());
    }

}



interface hello{
    String say();
}