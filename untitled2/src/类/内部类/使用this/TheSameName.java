package 类.内部类.使用this;

public class TheSameName {
    int x = 7;
    class lnner{
        int x = 9;
        void doit(){
            System.out.println(this.x);
            System.out.println(TheSameName.this.x);
        }
    }

    public static void main(String[] args) {
        TheSameName tn = new TheSameName();
//        TheSameName.lnner ln = tn.new lnner();
//        ln.doit();

    }
}
