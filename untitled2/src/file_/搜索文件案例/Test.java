package file_.搜索文件案例;


import java.io.File;
import java.io.IOException;

//查询 JDK的安装与配置.docx的位置
public class Test {
    public static void main(String[] args) {
        File dir = new File("D:\\");
        String name = "Typora.exe";
        searchfile(dir,name);
    }

    private static void searchfile(File dir,String name) {
        if (dir != null && dir.isDirectory() ) {   //判断文件是文件夹且是有效地址
            File[] f = dir.listFiles();     //或取当前目录的所有的一级文件对象
            if (f != null && f.length > 0) {      //当f为文件返回null，如果没有一级文件返回为0的空数组
                for (File file : f) {      //如果满足条件循环
                    if (file.isFile()) {      //判断是否是文件
                        if (file.getName().contains(name))   {  //判断文件名称是否相似
                            System.out.println(file.getAbsoluteFile());
                            try {
                                Runtime r = Runtime.getRuntime();    //虚拟机运行环境1
                                r.exec(file.getAbsolutePath());      //启动软件
                            } catch (IOException e) {
                                e.printStackTrace();
                                System.out.println("只能启动exe文件");
                            }
                        }
                    }   //返回文件的绝对路径
                    else
                        searchfile(file,name);         //若不是文件，递归,
                }
            }
        }
        else
            System.out.println("dir不是文件夹");
    }
}

