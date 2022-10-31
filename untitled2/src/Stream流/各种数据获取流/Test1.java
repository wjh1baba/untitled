package Stream流.各种数据获取流;

import java.util.*;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
//        ---------Collection集合获取流----------
        Collection<String> lists = new ArrayList<>();
        Stream<String> s = lists.stream();

        //        ---------Map集合获取流----------
        Map<String,Integer> map = new HashMap();
        //键流
        Stream<String> keystream = map.keySet().stream();
        //值流
        Stream<Integer> valuesstream = map.values().stream();
        //键值对流
        Stream<Map.Entry<String, Integer>> stream = map.entrySet().stream();

        //        ---------数组获取流----------
        String[] arr = {"sss","AAAA"};
        //第一种方式
        Stream<String> stream1 = Arrays.stream(arr);
        //第二种方式
        Stream<String> arr1 = Stream.of(arr);
    }

}
