package 类.多态.类型强转;

public class Test {
    public static void main(String[] args) {
        //多态的形式: 父类类型 对象名称 = new 子类构造器;
        Animal a1 = new Dod();
        Animal a2 = new Tortoise();
        a1.run();
        a2.run();
//        dog.np();    //父类无法调用子类私有的
        go(a1);
    }

    public static void go(Animal a) {
        if (a instanceof Dod) {
            Dod d = (Dod) a; //强类型转换
            d.np();
        }
    }
}
