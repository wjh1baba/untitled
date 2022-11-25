package 第19次作业;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Demo5 {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        Random r = new Random();
        for (int i = 1; i <= 10 ; i++) {
            int num = r.nextInt(11)+10;
            System.out.println("第"+i+"次生成的随机数是:"+num);
            collection.add(num);
        }
        System.out.println(collection);
        collection.stream().filter(s ->s>15).forEach(System.out::println);
    }
}
