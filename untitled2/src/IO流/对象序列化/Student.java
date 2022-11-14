package IO流.对象序列化;

import javax.swing.*;
import java.io.Serializable;

//实现Serialzable 给对象一个规范存储
public class Student implements Serializable {
    // 申明序列化的版本号
    // 序列化的版本号要和反序列化的版本号一致才不对出错
    private static final long serialVersionUID =2;
    private String name;
    //transient 不进行序列化
    private transient int age;
    private char sex;

    public Student() {
    }

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
