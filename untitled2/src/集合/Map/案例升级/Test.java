package 集合.Map.案例升级;

import java.util.*;

public class Test {
    public static void main(String[] args) {


        //用Map来存储投票
        Map<Integer,List<String>> map = new HashMap<>();
        for (int i = 1; i <= 80; i++) {
            List<String> s = randomint();
            map.put(i,s);
        }

//        存储投票结果
        Map<String, Integer> map1 = new HashMap<>();

//        循环Map统计票数
        Collection<List<String>> values = map.values();
        for (List<String> value : values) {
            for (String key : value) {
                System.out.println(key);
                if (map1.containsKey(key)){
                    map1.put(key,map1.get(key)+1);
                }
                else {
                    map1.put(key,1);
                }
            }
        }
        System.out.println(map1);
    }

    private static List<String> randomint() {
        Random r = new Random();
        List<String> option = new ArrayList<>();
        Collections.addAll(option,"A","B","C","D");
        while (true){
            int indexQ = r.nextInt(4);
            int indexH = r.nextInt(4)+1;
            if (indexH>indexQ){
                return option.subList(indexQ,indexH);
            }}
    }
}
