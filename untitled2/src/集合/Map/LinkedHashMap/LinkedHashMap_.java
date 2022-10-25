package 集合.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_ {
    public static void main(String[] args) {
        Map<String,Integer> lh = new LinkedHashMap<>();  //有序，不重复
        lh.put("maps1",1);
        lh.put("maps2",2);
        lh.put("maps1",3);
        lh.put("maps3",4);
        System.out.println(lh);  //{maps1=3, maps2=2, maps3=4}
    }
}
