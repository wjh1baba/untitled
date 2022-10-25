package 集合.Map.案列;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        String[] option = {"A","B","C","D"};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 80; i++) {
            sb.append(option[random.nextInt(option.length)]);
        }
        System.out.println(sb);

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < sb.length(); i++) {
            char str1 = sb.charAt(i);
            if (map.containsKey(str1)){
                map.put(str1,map.get(str1) +1);
            }
            else{
                map.put(str1,1);
            }
        }
        System.out.println(map);
    }
}
