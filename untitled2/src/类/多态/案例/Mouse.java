package 类.多态.案例;

public class Mouse implements USB{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect() {

    }

    @Override
    public void unconnect() {

    }

    void dbClick(){
        System.out.println(name+"点击");
    }
}
