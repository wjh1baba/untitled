package 第19次作业;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Demo4 {
    public static void main(String[] args) {
        TreeMap<laomo,String> treeMap = new TreeMap<>();
        treeMap.put(new laomo("张三",18),"北京");
        treeMap.put(new laomo("李四",20),"上海");
        treeMap.put(new laomo("王五",35),"天津");
        treeMap.put(new laomo("赵六",21),"北京");
        treeMap.put(new laomo("田七",19),"上海");
        System.out.println(treeMap);
        Iterator<laomo> iterator = treeMap.keySet().iterator();
        while (iterator.hasNext()){
            laomo laomo = iterator.next();
            if (laomo.getName().equals("张三"))
                iterator.remove();
            else if (laomo.getName().equals("李四"))
                treeMap.put(laomo,"郑州");
        }

//        第一种
        treeMap.forEach((laomo, s) -> System.out.println(laomo+"--"+s));
//        第二种
        for (laomo laomo : treeMap.keySet()) {
            System.out.println(laomo+"--"+treeMap.get(laomo));
        }
//        第三种
        for (Map.Entry<laomo, String> laomoStringEntry : treeMap.entrySet()) {
            System.out.println(laomoStringEntry.getKey()+"--"+laomoStringEntry.getValue());
        }
        System.out.println(treeMap);
    }
}


class laomo implements Comparable<laomo>{
    private String name;
    private int age;

    public laomo() {
    }

    public laomo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return age+"岁的"+name;
    }

    @Override
    public int compareTo(laomo o) {
        return o.age - this.age;
    }
}