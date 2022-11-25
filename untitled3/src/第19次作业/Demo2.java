package 第19次作业;

import java.util.Objects;
import java.util.TreeMap;

public class Demo2 {
    public static void main(String[] args) {
        TreeMap<Student1,String> treeMap = new TreeMap<>();
        treeMap.put(new Student1("黑马",16),"北京");
        treeMap.put(new Student1("传智",16),"西安");
        System.out.println(treeMap);
        treeMap.forEach((student, address) -> System.out.println(student+"----"+address));
    }
}


class Student1 implements Comparable<Student1>{
    private String name;  //学生的姓名
    private int age;

    public Student1() {
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Student1 o) {
        int result1 = this.age - o.age ;                                        // 先比较年龄
        int result2 = result1 == 0 ? this.name.compareTo(o.name) : result1 ;    // 年龄相同比较姓名
        return result2;
    }
}
