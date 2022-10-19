package 集合.Collection_.list_.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class listDemo01 {
    public static void main(String[] args) {
        //栈
        LinkedList<String> stack = new LinkedList<>();
        //入栈
        stack.addFirst("第一颗");
        stack.addFirst("第二颗");
        stack.addFirst("第三颗");
        stack.addFirst("第四颗");
        System.out.println(stack);
        //出栈
        System.out.println(stack.removeFirst());
        System.out.println(stack);


        //队列
        LinkedList<String> queue = new LinkedList<>();
        queue.addLast("1");
        queue.addLast("2");
        queue.addLast("3");
        queue.addLast("4");
        System.out.println(queue);

        System.out.println(queue.removeFirst());
        System.out.println(queue);
    }
}
