package 存储学生对象并遍历;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Student<String,Integer> sd = new Student<>("李冲",18);
        Student<String,Integer> sd1 = new Student<>("李冲2号",18);
        Student<String,Integer> sd2 = new Student<>("李冲3号",18);
        ArrayList<Student> Accoun= new ArrayList<>();
        Accoun.add(sd);
        Accoun.add(sd1);
        Accoun.add(sd2);
        System.out.println(Accoun);
    }
}
