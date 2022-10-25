package 集合.Map.HashMap;

import java.util.*;

public class test_API {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();  //无序，不重复
//        Map<String,Integer> lh = new LinkedHashMap_<>();  //有序，不重复
        maps.put("maps1",1);
        maps.put("maps2",2);
        maps.put("maps1",3);
        maps.put("maps3",4);
//
        System.out.println(maps);  //{maps3=4, maps2=2, maps1=3}
//

//        取值
//        System.out.println(maps.get("maps1"));


        //常用API

//        maps.clear();
//        System.out.println(maps);   //{}

//        System.out.println(maps.isEmpty());   //判断集合是否为空

//        maps.remove("maps1");
//        System.out.println(maps);  //{maps3=4, maps2=2}

//        System.out.println(maps.containsKey("maps3"));   //判断集合是否有次键

//        System.out.println(maps.containsValue(1));   //判断集合是否有次值

//        System.out.println(maps.size());   //判断集合有多少元素

//        Set<String> keys = maps.keySet();  //集合中全部的键
//        System.out.println(keys);

//        Collection<Integer> values = maps.values();   //集合中全部的值
//        System.out.println(values);

//        Map<String,Integer> maps1 = new HashMap<>();
//        maps1.put("java1",1);
//        maps1.put("java2",2);
//        Map<String,Integer> maps2 = new HashMap<>();
//        maps2.put("java2",1);
//        maps2.put("java3",2);
//        maps1.putAll(maps2);    //把maps2的所有元素cope到maps1中,maps2中的元素不变
//        System.out.println(maps1);
    }
}
