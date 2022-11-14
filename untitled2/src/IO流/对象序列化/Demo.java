package IO流.对象序列化;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


//记得让对象实现 实现Serialzable
public class Demo {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("untitled2/src/IO流/对象序列化/test.txt"));)
        {
            Student st = new Student("李冲",17,'女');
            //记得让对象实现 实现Serialzable
            oos.writeObject(st);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
