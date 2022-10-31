package Stream流.案例;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"张三","李四","王五","老六","张三丰");
        System.out.println(names);

        List<String> zhanglist = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("张"))
                zhanglist.add(name);
        }
        System.out.println(zhanglist);

        List<String> therelist = new ArrayList<>();
        for (String name : names) {
            if (name.length() == 3)
                therelist.add(name);
        }
        System.out.println(therelist);

        //使用Stream流
       names.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
    }
}
