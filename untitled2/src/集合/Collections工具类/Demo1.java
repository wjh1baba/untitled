package 集合.Collections工具类;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"EDJ","NP","加油");
        System.out.println(names);

        Collections.shuffle(names);   //随机排序
        System.out.println(names);

        List<Integer> list = new ArrayList<>();
        Integer[] arg = {111,333,222,444};
        Collections.addAll(list,arg);
        Collections.sort(list);    //按升序排序
        System.out.println(list);
    }
}

