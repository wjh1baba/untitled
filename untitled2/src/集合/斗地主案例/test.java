package 集合.斗地主案例;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test {
    static List<card> lists = new ArrayList<>();

    static{

        String[] size = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] color = {"♠","♥","◇","♣"};
        int index = 0;
        for (String s : size) {
            index++;
            for (String s1 : color) {
                lists.add(new card(s,s1,index));
            }
        }

        Collections.addAll(lists,new card("","小王",++index),new card("","大王",++index));
        System.out.println(lists);
    }

    public static void main(String[] args) {
        //洗牌
        Collections.shuffle(lists);
        System.out.println(lists);
        //发牌
        List<card> wanjia1 = new ArrayList<>();
        List<card> wanjia2 = new ArrayList<>();
        List<card> wanjia3 = new ArrayList<>();

        for (int i = 0; i < lists.size()-3; i++) {
            switch (i%3){
                case 0:{
                    wanjia1.add(lists.get(i));
                    break;
                }
                case 1:{
                    wanjia2.add(lists.get(i));
                    break;
                }
                case 2:{
                    wanjia3.add(lists.get(i));
                    break;
                }
            }
        }
        List<card> lastTherecards = lists.subList(lists.size()-3,lists.size());

        SortCark(wanjia1);
        SortCark(wanjia2);
        SortCark(wanjia3);
        
        System.out.println(wanjia1);
        System.out.println(wanjia2);
        System.out.println(wanjia3);
        System.out.println(lastTherecards);
    }

    private static void SortCark(List<card> cards) {
        Collections.sort(cards, Comparator.comparingInt(card::getIndex));
    }

}
