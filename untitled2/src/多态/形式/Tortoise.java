package 多态.形式;

public class Tortoise extends Animal{
    String name = "我是乌龟";
    @Override
    void run() {
        System.out.println("乌龟跑不动");
    }
}
