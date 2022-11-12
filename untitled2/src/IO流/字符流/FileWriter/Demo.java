package IO流.字符流.FileWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Demo {
    public static void main(String[] args) throws IOException {
        Writer w = new FileWriter("untitled2\\src\\IO流\\字符流\\FileWriter\\w.txt");
        w.write(1);
        w.write("\r\n");
        w.write(98);
        w.write("\r\n");
        w.write("lc我冲");
        w.write("\r\n");
        w.write("李冲:我是傻逼",0,5);
        w.write("\r\n");
        char[] chars = "牛皮的".toCharArray();
        w.write(chars);
        w.close();
    }
}
