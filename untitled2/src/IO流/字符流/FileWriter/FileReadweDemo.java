package IO流.字符流.FileWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileReadweDemo {
    public static void main(String[] args) throws Exception {
        Reader r = new FileReader("untitled2\\src\\IO流\\字符流\\FileReader\\test.txt");
        char[] buffer = new char[1024];
        System.out.println(r.read(buffer));
        int len;
        while ((len = r.read(buffer))!=-1)
            System.out.println(len);
    }
}