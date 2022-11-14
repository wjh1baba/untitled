package IO流.缓冲流.字符缓冲;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Demo {
    public static void main(String[] args) {
        try(
              Reader I = new FileReader("untitled2/src/IO流/缓冲流/字符缓冲/1.txt");
              BufferedReader IB = new BufferedReader(I);
              ) {
            String line;
            while ((line = IB.readLine()) != null)
                System.out.println(line);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
