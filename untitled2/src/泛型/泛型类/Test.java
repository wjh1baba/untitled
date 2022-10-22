package 泛型.泛型类;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> lists = new MyArrayList<>();
        lists.add("牛皮");
        System.out.println(lists);
    }
}


class MyArrayList<E>{
    ArrayList<E> list = new ArrayList<>();
    public void add(E e){
        list.add(e);
    }
    public void remove(E e){
        list.remove(e);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}