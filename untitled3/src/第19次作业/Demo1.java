package 第19次作业;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        Student h1 = new Student("赵丽颖",18);
        Student h2 = new Student("范冰冰",20);
        Student h3 = new Student("杨幂",19);
        Student h4 = new Student("杨幂",19);

        Collections.addAll(hashSet,h1,h2,h3,h4);
        System.out.println(hashSet);
        System.out.println(h3.hashCode());
        System.out.println(h4.hashCode());

    }
}


