package 内部类.匿名内部类;

//匿名内部类
//  new 类|抽象1类名|或者接口名(){
//  重新方法;
//  };

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            void run() {
                System.out.println("跑的快");
            }
        };
        a.run();
    }
}


//
//class Tiger extends Animal{
//    @Override
//    void run() {
//        System.out.println("跑的快");
//    }
//}

abstract class Animal{
    abstract void run();
}
