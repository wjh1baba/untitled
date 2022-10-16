package supur;

public class Demo {
    public static void main(String[] args) {
        Child C=new Child();

        System.out.println(C.getClass());
    }}


    class Parent{
        Parent(){
            System.out.println("777");
        }
    }

    class Child extends Parent{
        Child(){
            System.out.println("666");
        }
    }

