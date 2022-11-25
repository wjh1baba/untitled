package 类.内部类;
//   s书p137

public class Car {
    String brand;

    public Car(String brand) {
        this.brand = brand;
    }



    static class Engine{

        String model;
        public Engine(String model){
            this.model = model;
        }
        void ignite(){
            System.out.println("发动机"+model+"点火");

        }
    }

    void start(){
        System.out.println("启动"+brand);
    }

    public static void main(String[] args) {
        Car car = new Car("北京现代");
        car.start();
        Car.Engine engine = new Engine("99");
        //外部类 对象名称 = new 外部类();
        //外部类.类.内部类 对象名称 = 外部实例对象.new 类.内部类();
        engine.ignite();

    }
}
