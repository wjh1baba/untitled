package 类.多态.案例;

public class Test {
    public static void main(String[] args) {
        Computer ct = new Computer("天选");
        ct.run();
        USB kd = new KeyBoard("华硕键盘");
        ct.installUSB(kd);

    }
}
