package Stream流.常用API练习;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","张三","李小龙","李冲","张国荣");

        //forEach是终止,filter会对元素进行过滤
        list.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);
        System.out.println("---------------------------------");

        //limit(n)  获取n个元素
        list.stream().filter(s -> s.length() == 2).limit(1).forEach(System.out::println);
        System.out.println("---------------------------------");

        //skip(n)  跳过前n个元素
        list.stream().filter(s -> s.startsWith("张")).skip(1).forEach(System.out::println);
        System.out.println("---------------------------------");

        //map加工方法 map(加工原材料 -> 加工后的产物)
        //给每一个元素前面添加帅气的
        list.stream().map(s -> "帅气的"+s).forEach(System.out::println);
        System.out.println("---------------------------------");
        //给每一个元素加工成一个学生对象
        list.stream().map(Student::new).forEach(System.out::println);
        System.out.println("---------------------------------");
        //concat 合并俩个流
        String[] arr = { "666","999"};
        Stream<String> s2 = Arrays.stream(arr);

        Stream<String> s1 = list.stream();
        Stream<String> s3 = Stream.concat(s1,s2);
        s3.forEach(System.out::println);
    }
}
