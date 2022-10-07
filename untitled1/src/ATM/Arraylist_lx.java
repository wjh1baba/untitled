package ATM;

import java.util.ArrayList;


public class Arraylist_lx {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(99);
        al.add(66);
        al.add(77);
        al.add(88);
        al.add(79);
//        al.remove(99);  //这里remove只有当元素是str 才能使用remove指定删除

        for (int i = 0; i < al.size(); i++) {
            int score = al.get(i);
            if (score<80){
//                al.remove(score);
                al.remove(i);
                i--;
            }
        }
        System.out.println(al);
    }
}
