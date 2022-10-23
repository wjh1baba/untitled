package 集合.Collection_.Set_.HashSet;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        Set<Student> sds = new HashSet<>();
        //Set 去重原理:先判断哈希值，再判断equals
        Student sd1 = new Student("二货", 520, '男');
        Student sd2 = new Student("二蛋", 250, '女');
        Student sd3 = new Student("二货", 520, '男');
        sds.add(sd1);
        sds.add(sd2);
        sds.add(sd3);
        //没重写之前
//        System.out.println(sd1.hashCode());  //460141958
//        System.out.println(sd3.hashCode());  //1956725890
//        System.out.println(sds);  //[Student{name='二货', age=520, sex=男}, Student{name='二蛋', age=250, sex=女}, Student{name='二货', age=520, sex=男}]
        //重写hashCode之后
        System.out.println(sd1.hashCode());  //633839081
        System.out.println(sd3.hashCode());  //633839081
        System.out.println(sds);  //[Student{name='二蛋', age=250, sex=女}, Student{name='二货', age=520, sex=男}]
    }
}
