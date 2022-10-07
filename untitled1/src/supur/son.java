package supur;

public class son extends bb_rz{
    private static int age;

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        son.age = age;
    }

    public void show(){
        System.out.println("儿子在这");
    }

    bb_rz BB = new bb_rz();
}
