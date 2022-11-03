package file_.遍历;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\26481\\Desktop\\学习截图");
//        String[] list1 = f.list();
//        assert list1 != null;
//        for (String s : list1) {
//            System.out.println(s);
//        }
        File[] fs = f.listFiles();
        for (File file : fs) {
            System.out.println(file);
        }
    }
}
