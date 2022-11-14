package IO流.对象序列化.反序列化;

import IO流.对象序列化.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

//反序列化
public class Demo1 {
    public static void main(String[] args) {
        try(ObjectInputStream I = new ObjectInputStream(new FileInputStream("untitled2/src/IO流/对象序列化/test.txt"));) {
            Student s = (Student) I.readObject();
            System.out.println(s);
            //如果出现 InvalidClassException 错误,说明要先重新序列化一下，使Serializable的值一样，才能反序列化
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
