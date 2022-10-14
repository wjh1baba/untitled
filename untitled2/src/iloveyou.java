import java.io.FileNotFoundException;
import java.io.PrintStream;

public class iloveyou {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        PrintStream ps = new PrintStream("D:\\Develop\\untitled\\untitled2\\1.txt");
        System.setErr(ps);
        int count=0;
        for (float y=2.5f;y>-2.0f;y-=0.12f){
            for (float x=-2.3f;x<2.3f;x+=0.041f){
                float a = x*x+y*y-4f;
                if ((a*a*a-x*x*y*y*y)<-0.0f){
                    String str="I LOVE 小玲!";
                    int num =count%str.length();
                    System.err.print(str.charAt(num));
                    count++;
                }else{
                    System.err.print(" ");
                }
            }
            System.err.println();
        }
        ps.close();
    }
}
