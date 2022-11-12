package IO流.字符流.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class demo {
    public static void main(String[] args) throws Exception {
        Reader R = new FileReader("untitled2\\src\\IO流\\字符流\\FileReader\\test.txt");
        System.out.println((char)R.read());
    }
}
