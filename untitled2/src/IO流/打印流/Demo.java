package IO流.打印流;

import IO流.对象序列化.Student;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Demo {
    public static void main(String[] args) throws Exception {
//        PrintStream ps = new PrintStream("untitled2/src/IO流/打印流/test.txt","GBK");
        PrintStream ps = new PrintStream("untitled2/src/IO流/打印流/test.txt");   //高效，底层调用了buffer缓冲流
        PrintWriter pw = new PrintWriter("untitled2/src/IO流/打印流/test1.txt");
        Student st = new Student("李冲",17,'女');
        ps.println(st);
        ps.println(1);
        ps.println(5.2);
        ps.println("李冲裸奔");
        ps.println('女');
        ps.println(true);
        ps.close();

//        ps.write("李冲没鸡鸡");     ps只能写字节
        pw.write("李冲没鸡鸡");
    }
}
