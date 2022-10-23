package 电器类;

public class Ice_Box extends Washer{
//    doorStyle,  coolMethod
    public String doorStyle;
    public String coolMethod;

    public Ice_Box() {
    }

    public Ice_Box(String doorStyle, String coolMethod) {
        this.doorStyle = doorStyle;
        this.coolMethod = coolMethod;
    }

    public Ice_Box(String brand, String model, String color, double price, String doorStyle, String coolMethod) {
        super(brand, model, color, price);
        this.doorStyle = doorStyle;
        this.coolMethod = coolMethod;
    }

    public String getDoorStyle() {
        return doorStyle;
    }

    public void setDoorStyle(String doorStyle) {
        this.doorStyle = doorStyle;
    }

    public String getCoolMethod() {
        return coolMethod;
    }

    public void setCoolMethod(String coolMethod) {
        this.coolMethod = coolMethod;
    }

    @Override
    public String toString() {
        return "Ice_Box{" +
                "doorStyle='" + doorStyle + '\'' +
                ", coolMethod='" + coolMethod + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
