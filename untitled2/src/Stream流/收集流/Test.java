package Stream流.收集流;

import Stream流.案例2.Eeployee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"666","999","777");

        //List
        Stream<String> s = list.stream().skip(1);
        List<String> list1 = s.collect(Collectors.toList());
        System.out.println(list1);
        //Array
        Stream<String> s1 = list.stream().skip(1);
        Object[] arr = s1.toArray();
        System.out.println(Arrays.toString(arr));

        List<Eeployee> eeployees = new ArrayList<>();
        eeployees.add(new Eeployee("李四",'男',5000.0,1000.0,null));
        eeployees.add(new Eeployee("张三",'男',6000.0,500.0,null));
        eeployees.add(new Eeployee("王五",'女',4000.0,2000.0,null));
        eeployees.add(new Eeployee("老六",'男',6000.0,600.0,"吃粑粑"));
        System.out.println(eeployees);
        Map<String,Double> map1 = eeployees.stream().collect(Collectors.toMap(Eeployee::getName,Eeployee::getSalary));
        System.out.println(map1);

    }
}
