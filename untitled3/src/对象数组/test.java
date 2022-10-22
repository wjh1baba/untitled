package 对象数组;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Student st1 = new Student("李一",17);
        Student st2= new Student("李二",13);
        Student st3 = new Student("李三",11);
        Student st4 = new Student();
        st4.setName("李四");
        st4.setAge(17);
        ArrayList<Student> sd = new ArrayList<>();
        sd.add(st1);
        sd.add(st2);
        sd.add(st3);
        sd.add(st4);
        System.out.println(sd);
        Student[] arr = {st1,st2,st3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
