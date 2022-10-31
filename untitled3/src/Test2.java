interface Animal{
    void show();
}

class Cat implements Animal{
    public void show(){
        System.out.println("猫");
    }
}

class Test2{
    public static void main(String[] args){
        fun(new Cat());//请用普通的子类的形式调用

        fun(() -> System.out.println("这"));//请用匿名内部类的形式调用
    }

    public static void fun(Animal a){
        a.show();
    }
}	