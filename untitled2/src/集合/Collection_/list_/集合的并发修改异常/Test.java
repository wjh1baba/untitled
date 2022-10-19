package 集合.Collection_.list_.集合的并发修改异常;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("Java");
        list1.add("牛皮");
        list1.add("牛皮");
        list1.add("jj");

        //Iterator
//        Iterator<String> it = list1.iterator();
//        while (it.hasNext()){
//            if ("Java".equals(it.next()))
//                it.remove();    //如果写list.remove("Java") 会出现问题
//        }


//        //foreach
//        for (String s : list1) {
//            if ("Java".equals(s)){
//                list1.remove("Java");   //foreach没办法遍历删除
//            }
//        }


         //lambda底层也是foreach 所以没法用

        //for
        for (int i = 0; i < list1.size(); i++) {
            String ele = list1.get(i);
            if (ele.equals("Java")){
                list1.remove("Java");
                i--;
            }
        }
        System.out.println(list1);
    }
//

}
