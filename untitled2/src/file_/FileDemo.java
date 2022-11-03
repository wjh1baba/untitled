package file_;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo {
    public static void main(String[] args) {
        File f = new File("untitled2/src/text1");

        //获取绝对路径
        System.out.println(f.getAbsoluteFile());
        //获取定义时路径
        System.out.println(f.getPath());
        //获取文件名
        System.out.println(f.getName());
        //获取文件大小(字节个数)
        System.out.println(f.length());
        //获取最后修改时间
        long time = f.lastModified();
        System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));
        //判断此文件是文件
        System.out.println(f.isFile());
        //判断此文件是文件夹
        System.out.println(f.isDirectory());
        //判断此路径是否存在
        System.out.println(f.exists());
    }
}
