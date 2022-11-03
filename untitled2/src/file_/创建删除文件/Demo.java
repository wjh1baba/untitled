package file_.创建删除文件;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        File f = new File("untitled2/src/text1");
        System.out.println(f.createNewFile());
        File f1 = new File("untitled2/src/text2");
        System.out.println(f1.createNewFile());
        //mkdirs 创建多级目录
        File f2 = new File("D:\\Develop\\untitled\\untitled2\\src\\aaa\\ccc");
//        System.out.println(f2.mkdirs());
        //delete只能删除文件或者空文件
        System.out.println(f2.delete());
    }
}
