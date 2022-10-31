package Stream流.案例2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    static double listmoney;
    public static void main(String[] args) {
        List<Eeployee> list = new ArrayList<>();

        list.add(new Eeployee("李四",'男',5000.0,1000.0,null));
        list.add(new Eeployee("张三",'男',6000.0,500.0,null));
        list.add(new Eeployee("王五",'女',4000.0,2000.0,null));
        list.add(new Eeployee("老六",'男',6000.0,600.0,"吃粑粑"));
        System.out.println(list);

        List<Eeployee> list2 = new ArrayList<>();
        list2.add(new Eeployee("猪八戒",'男',10000.0,0.0,"吃的多"));
        list2.add(new Eeployee("孙悟空",'男',2000.0,500.0,null));
        list2.add(new Eeployee("沙悟净",'男',5000.0,2000.0,null));
        list2.add(new Eeployee("唐三藏",'男',2500.0,2500.0,null));
        list2.add(new Eeployee("李冲",'中',5,1,"没叫爸爸"));
        System.out.println(list2);

        //分别筛选俩个部门薪资最高的
        Topperformer e1 = list.stream().max((o1, o2) -> (int) ((o1.getSalary() + o1.getBonus()) - (o2.getSalary() + o2.getBonus())))
                .map(eeployee -> new Topperformer(eeployee.getName(),eeployee.getSalary()+ eeployee.getBonus())).get();
        System.out.println(e1);

        //分别筛选俩个部门薪资最高的
        Topperformer e2 = list2.stream().max((o1, o2) -> (int) ((o1.getSalary() + o1.getBonus()) - (o2.getSalary() + o2.getBonus())))
                .map(eeployee -> new Topperformer(eeployee.getName(),eeployee.getSalary()+ eeployee.getBonus())).get();
        System.out.println(e2);
//        //list的平均工资 去掉最高和最低
//        list.stream().sorted((o1, o2) -> (int) ((o1.getSalary() + o1.getBonus()) - (o2.getSalary() + o2.getBonus()))).skip(1).limit(list.size()-2).
//                forEach(eeployee -> listmoney+=eeployee.getBonus()+eeployee.getSalary());
//
//        System.out.println(listmoney/2);

        //求list和list2的工资平均值

        Stream<Eeployee> s1 = list.stream();
        Stream<Eeployee> s2 = list2.stream();

        Stream<Eeployee> s= Stream.concat(s1, s2);      //合并俩个流
//        s.sorted((o1, o2) -> (int) ((o1.getSalary() + o1.getBonus()) - (o2.getSalary() + o2.getBonus()))).skip(1).forEach(System.out::println);
        s.sorted((o1, o2) -> (int) ((o1.getSalary() + o1.getBonus()) - (o2.getSalary() + o2.getBonus()))).skip(1).limit(list.size()+list2.size()-2).
                forEach(e -> listmoney+=e.getBonus()+e.getSalary());
        System.out.println(listmoney);

    }
}
