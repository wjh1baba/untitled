package 类.多态.类型强转;

public class Tortoise extends Animal {

    @Override
    void run() {
        System.out.println("乌龟跑不动");
    }

    void np(){
        System.out.println("乌龟交配");
    }
}
