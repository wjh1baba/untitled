package IO流.缓冲流.出师表案例;

import java.io.*;
import java.util.*;

public class Demo {
    public static void main(String[] args) throws Exception {
        try(
            Reader I = new FileReader("untitled2/src/IO流/缓冲流/出师表案例/出师表案例模拟.txt");
            BufferedReader IB = new BufferedReader(I);
            Writer w = new FileWriter("untitled2/src/IO流/缓冲流/出师表案例/出师表案例模拟2.txt");
            BufferedWriter wb = new BufferedWriter(w))
        {



            String line;
            ArrayList<String> lines = new ArrayList<>();
            while ((line = IB.readLine()) != null){
                lines.add(line);
            }
            System.out.println(lines);
            List<String> size = new ArrayList<>();
            Collections.addAll(size,"1","2","3","4","a","5","6","7","8","9","10","11");
            lines.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return size.indexOf(o1.substring(0, o1.indexOf("."))) - size.indexOf(o2.substring(0, o2.indexOf(".")));
                }
            });
            System.out.println(lines);

            for (String s : lines) {
                wb.write(s);
                wb.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
