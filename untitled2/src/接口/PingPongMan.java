package 接口;

public class PingPongMan implements SportMan{
    private String name;

    public PingPongMan(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name+"在跑步");
    }

    @Override
    public void competition() {
        System.out.println(name+"在健身");
    }
}
