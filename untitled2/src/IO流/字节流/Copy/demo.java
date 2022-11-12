package IO流.字节流.Copy;

import java.io.*;
import java.util.Arrays;

public class demo {
    public static void main(String[] args) throws Exception {
        try {
            InputStream i = new FileInputStream("D:\\QQ\\2648157217\\ScreenRecorder\\1615899993984.mp4");
            OutputStream o = new FileOutputStream("D:\\QQ\\1615899993984.mp4");
            byte[] buffer = new byte[1024];
            int len;
            while ((len = i.read(buffer)) != -1){
                o.write(buffer,0,len);
                o.flush();
            }
            System.out.println("复制完成");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
