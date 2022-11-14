package 集合.Map.HashMap.遍历方法;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class demo1 {
    public static void main(String[] args) {

        Map<String,Integer> maps = new HashMap<>();
        maps.put("maps1",1);
        maps.put("maps2",2);
        maps.put("maps3",3);
        maps.put("maps4",4);


        //第一种方式遍历取值    键找值
        System.out.println(maps.keySet());
        System.out.println(maps.entrySet());
        for (Map.Entry<String, Integer> stringIntegerEntry : maps.entrySet()) {
            System.out.println(stringIntegerEntry.getKey());
        }
        for (String key : maps.keySet()) {
            System.out.println(key+"="+maps.get(key));
        }
        System.out.println("-------------------------------");
        // 第二种方式遍历取值    键值对
        for (Map.Entry<String, Integer> key : maps.entrySet()) {
            System.out.println(key.getKey()+"="+key.getValue());
        }

        System.out.println("-------------------------------");
        // 第三种方式遍历取值    lamdab
        maps.forEach((key, value) -> {System.out.println(key+"="+value);});

    }
}
