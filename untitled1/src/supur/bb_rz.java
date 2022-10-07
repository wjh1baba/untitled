package supur;

public class bb_rz {
    private String name;
    public static String xingbie;

    public bb_rz(){
        System.out.println("666");
    }

    public bb_rz(int id){
        System.out.println("666"+id);
    }

    public String getName() {
        return name;
    }

    public static String getXingbie() {
        return xingbie;
    }

    public static void setXingbie(String xingbie) {
        bb_rz.xingbie = xingbie;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void farter() {
        System.out.println("我是爹");
    }

}
