package 类.多态.案例;

public class Computer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer(String name) {
        this.name = name;
    }

    void run(){
        System.out.println(name+"已开机");
    }

    void installUSB(USB usb){
        usb.connect();
        if (usb instanceof KeyBoard){
            KeyBoard k = (KeyBoard) usb;
            k.keyDown();
        }else if (usb instanceof Mouse){
            Mouse m = (Mouse) usb;
            m.dbClick();
        }
        usb.unconnect();
    }
}
