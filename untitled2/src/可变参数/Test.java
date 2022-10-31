package 可变参数;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        sum();
        sum(10);
        sum(10,20);
        sum(10,20,30);

    }


    //可变参数只能放在传参列表最后面
    public static void sum(int...nums) {
        //可变参数在方法内部其实就是一个数组
        System.out.println("元素个数:"+nums.length+" "+ Arrays.toString(nums));

    }
}
