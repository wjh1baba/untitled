package 第19次作业;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo6 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Collections.addAll(set,"王佳乐","张三丰","王思聪","张飞","刘晓敏","张靓颖","王敏");
        System.out.println(set);
        Stream<String> s1 = set.stream().filter(s -> s.startsWith("张"));
        Stream<String> s2  =set.stream().filter(s -> s.startsWith("王"));
        Stream<String> s3 =Stream.concat(s1,s2);

        Set<String> set1= s3.filter(s -> s.length()==3).collect(Collectors.toSet());
        System.out.println(set1.size());
    }
}
