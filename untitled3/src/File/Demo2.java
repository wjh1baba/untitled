package File;

import java.io.File;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        File file = new File("E:/a");
        file.mkdir();
        File file1 = new File(file,"a.txt");
        file1.createNewFile();
    }
}
