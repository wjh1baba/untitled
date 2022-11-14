package IO流.转换流;

import java.io.*;

//字符输入流转换 GBK
public class Demo2 {
    public static void main(String[] args) {
        try ( OutputStream O = new FileOutputStream("untitled2/src/IO流/转换流/Test1.txt");
              Writer Wr = new OutputStreamWriter(O,"GBK");
              Writer WrB = new BufferedWriter(Wr);)
              {
                  WrB.write("李冲裸奔");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
