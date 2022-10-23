package 集合.Collection_.Set_.TreeSet_;

import java.awt.geom.QuadCurve2D;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_  {
    public static void main(String[] args) {
        Set<Integer> sets = new TreeSet<>();
        sets.add(23);
        sets.add(10);
        sets.add(25);
        sets.add(1);
        sets.add(30);
        System.out.println(sets);  //[1, 10, 23, 25, 30]

        Set<String> sets1 = new TreeSet<>();
        sets1.add("BA");
        sets1.add("CA");
        sets1.add("aC");
        sets1.add("牛皮");
        sets1.add("EH");
        sets1.add("AD");
        System.out.println(sets1);  //[AD, BA, CA, EH, aC, 牛皮]   按照首字母

//        Set<Apple> apples = new TreeSet<>();


        Set<Apple> apples = new TreeSet<>((o2,  o1) ->   Double.compare(o1.getPrice() , o2.getPrice()));
        apples.add(new Apple("青苹果","绿色",17.2,500));
        apples.add(new Apple("红苹果","红色",9.8,400));
        apples.add(new Apple("黄苹果","黄色",88,200));
        apples.add(new Apple("绿苹果","绿色",17.2,500));
        System.out.println(apples);
    }

}
