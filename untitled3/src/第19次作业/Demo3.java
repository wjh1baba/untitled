package 第19次作业;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Demo3 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(103,"阿三面馆");
        hashMap.put(104,"阿四面馆");
        hashMap.put(105,"阿五面馆");
        hashMap.put(106,"阿六面馆");


        System.out.println(hashMap.entrySet());
//        第一种
        for (Map.Entry<Integer, String> key : hashMap.entrySet()) {
            System.out.println(key.getKey()+"--"+key.getValue());
        }
        System.out.println("==========================");
//        第二种
        for (Integer key : hashMap.keySet()) {
            System.out.println(key+"--"+hashMap.get(key));
        }
        System.out.println("==========================");
//        第三种
        hashMap.forEach((key, value) -> System.out.println(key+"--"+value) );
    }
}

