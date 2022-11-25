package 类.多态.案例;

public class KeyBoard implements USB{
    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name+"已连接电脑");
    }

    @Override
    public void unconnect() {
        System.out.println(name+"已拔出");
    }

    void keyDown(){
        System.out.println(name+"来了老弟敲击~");
    }
}
