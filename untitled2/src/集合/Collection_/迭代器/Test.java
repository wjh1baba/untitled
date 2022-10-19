package 集合.Collection_.迭代器;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("李冲");
        c.add("猪");
        c.add("狗");
        System.out.println(c);

        //使用iterator
        Iterator<String> it = c.iterator();
        while (it.hasNext()){
            String name = it.next();
            System.out.println(name);
        }

        //增强for
        for (String name : c) {
            System.out.println(name);
        }


        //Lambda
//        c.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        c.forEach((s) -> {System.out.println(s);});

        c.forEach(System.out::println);

    }
}
