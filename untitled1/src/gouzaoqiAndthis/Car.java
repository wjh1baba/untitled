package gouzaoqiAndthis;

public class Car {
    String name;
    double price;
    public Car(String name,double price){
        this.name = name;
//      this 代表Car的name
        this.price = price;
        System.out.println(this.price+"万的"+name+"在马路上行驶");
    }


    public void gowith(String name,double price)
    {
        System.out.println(this.price+"万的"+name+"在马路上行驶");
    }
}
