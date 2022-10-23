package 集合.Collection_.Set_.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> sets = new HashSet<>();   //[二货, 蠢, 狗, 李冲, 东西]  //无序 不重复 无索引
//        Set<String> sets = new LinkedHashSet<>(); // [李冲, 狗, 东西, 二货, 蠢]   //有序 不重复 无索引
        sets.add("李冲");
        sets.add("狗");
        sets.add("东西");
        sets.add("二货");
        sets.add("李冲");
        sets.add("蠢");
        System.out.println(sets);
    }
}
