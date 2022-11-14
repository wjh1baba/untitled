package IO流.转换流;

import java.io.*;

//字符输入流转换 GBK
public class Demo {
    public static void main(String[] args) {
        try {
            InputStream I = new FileInputStream("untitled2/src/IO流/转换流/Test.txt");
            Reader Ir = new InputStreamReader(I,"GBK");
            BufferedReader IrB = new BufferedReader(Ir);
            String line;
            while ((line = IrB.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
