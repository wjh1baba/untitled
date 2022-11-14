package IO流.缓冲流.字节缓冲;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) throws Exception {


        try(
                InputStream I = new FileInputStream("D:\\QQ\\2648157217\\ScreenRecorder\\1615899993984.mp4");
                InputStream IB = new BufferedInputStream(I);
                OutputStream O = new FileOutputStream("untitled2/src/IO流/缓冲流\\sp.mp4");
                OutputStream OB = new BufferedOutputStream(O);
                )
        {   int len;
            byte[] butter = new byte[1024];
            while ((len = IB.read(butter)) != -1){
                OB.write(butter,0,len);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
