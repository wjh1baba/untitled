package IO流.Properties_;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.setProperty("李冲","笑嘻嘻");
        properties.setProperty("李冲1","笑掉牙");
        properties.setProperty("李冲2","笑掉牙2");

        properties.store(new FileWriter("untitled2/src/IO流/Properties_/test.txt"),"不支持中文");
    }
}
