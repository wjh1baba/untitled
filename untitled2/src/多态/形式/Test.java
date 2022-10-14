package 多态.形式;
//多态的前提:继承，方法重写，父类引用子类对象
public class Test {
    public static void main(String[] args) {
        //多态的形式: 父类类型 对象名称 = new 子类构造器;
        Animal a1 = new Dod();
        Animal a2 = new Tortoise();

        a1.run();
        System.out.println(a1.name);      //打印的是父类的变量(多态侧重行为多态)

        a2.run();
        System.out.println(a2.name);
    }
}
