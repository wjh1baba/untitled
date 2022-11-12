package IO流.字节流.InputStream.FileInputStream;

import java.io.*;
import java.util.Arrays;

public class demo {
    public static void main(String[] args) throws IOException {
        //创建一个文件字节输入流管道与源文件接通
        InputStream I = new FileInputStream("D:\\Develop\\untitled\\untitled2\\src\\IO流\\字节流\\InputStream\\FileInputStream\\text.txt");

//方式一
//        System.out.println((char)I.read());  // a
//        System.out.println((char)I.read());   //b
//        System.out.println((char)I.read()); //1
//        System.out.println(I.read());  //-1    没有可读的返回-1



//方式二   定义自己数组，用于读取字节数组
//        byte[] buffer1 = new byte[3];
//        System.out.println(I.read(buffer1));   //返回的是读取字节数  //3
//        String rs1 = new String(buffer1);
//        System.out.println(rs1);   //ab1
//
//        System.out.println(I.read(buffer1));   //返回的是读取字节数   //3
//        String rs2= new String(buffer1);
//        System.out.println(rs2);  //,11
//
//        int len3 = I.read(buffer1);
//        System.out.println(len3);  //返回的是读取字节数   //2
//        //改进
//        String rs3= new String(buffer1,0,len3);
//        System.out.println(rs3);  //2a1


//方式三   循环读取字节数组
//        byte[] buffer = new byte[3];
//        int len;
//        while ((len = I.read(buffer)) != -1){
//
//            String rs = new String(buffer,0,len);
//            System.out.println(rs);
//        }

//方式四  只接定义一个字节数组与文件的大小刚刚一样大
        //读取全部字节数组
        File f = new File("D:\\Develop\\untitled\\untitled2\\src\\IO流\\字节流\\InputStream\\FileInputStream\\text1.txt");
        InputStream Is = new FileInputStream(f);
//        byte[] buffer = Is.readAllBytes();    //JDK1.9
//        System.out.println(new String(buffer));

        byte[] buffer = new byte[(int) f.length()];
        int len = Is.read(buffer);
        System.out.println(len);
        System.out.println(f.length());
        System.out.println(new String(buffer));
    }
}
