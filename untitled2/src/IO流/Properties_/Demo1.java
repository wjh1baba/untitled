package IO流.Properties_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

//读取属性文件
public class Demo1 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader("untitled2/src/IO流/Properties_/test.txt"));
        System.out.println(properties);
        System.out.println(properties.getProperty("李冲"));
    }
}
