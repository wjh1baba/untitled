package duotai;

public class Test {
    public static void main(String[] args) {

        //父类类型 对象名称 = new 子类构造器;
        //接口 对象名称 = new 实现类构造器;

        Animal a1 = new Dog();
        Animal a2 = new Tortoise();
        System.out.println("a1,");

        System.out.println(a1.name);  //打印的是父类的变量
        a1.run();   //打印的是子类的方法

        //方法调用:编译看左边，运行看右边
        //变量调用：编译看左边，运行看左边

        System.out.println("a2,");
        a2.run();


    }
}
