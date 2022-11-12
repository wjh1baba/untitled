package IO流.字节流.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class demo {
    public static void main(String[] args) throws IOException {
//        OutputStream O = new FileOutputStream("D:\\Develop\\untitled\\untitled2\\src\\IO流\\字节流\\OutputStream\\text.txt");
        // 追加管道 ，可以在原文件下追加
        OutputStream O = new FileOutputStream("D:\\Develop\\untitled\\untitled2\\src\\IO流\\字节流\\OutputStream\\text.txt",true);
//单个字节写出
// O.write('1');
//        O.write('A');

        //
        byte[] buffer = {'a','1','2'};
        O.write(buffer);
        O.write("\r\n".getBytes());  //以Utf-8进行编译
        byte[] buffer1 = "我是中国人".getBytes(StandardCharsets.UTF_8);
        O.write(buffer1);
        O.flush();
        O.close();
    }
}
