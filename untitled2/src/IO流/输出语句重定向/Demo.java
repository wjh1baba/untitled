package IO流.输出语句重定向;

import java.io.FileNotFoundException;
import java.io.PrintStream;

//输出语句重定向
public class Demo {
    public static void main(String[] args) throws Exception {
        System.out.println("李冲");
        System.out.println("跳钢管舞");


        //改变输出语句的位置(重定向)
        PrintStream ps = new PrintStream("untitled2/src/IO流/输出语句重定向/test.txt");
        System.setOut(ps);   //把系统打印流改成自己写的流

        System.out.println("穿水手服");
        System.out.println("和黑丝");
    }
}
