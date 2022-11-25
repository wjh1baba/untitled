package 多线程.常用API;

public class Demo {
    public static void main(String[] args) {
        Thread t1 = new MyThread("李冲1号");
        t1.start();
//        t1.setName("李冲1号");    //给线程起名
        System.out.println(t1);

        Thread t2 = new MyThread("李冲2号");
        t2.start();
//        t2.setName("李冲2号");
        System.out.println(t2);

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"线程在执行");   //获取当前线程的名字
        }

    }
}

class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        //送给父类的有参构造器
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyThread.currentThread().getName()+"线程在执行");
        }
    }
}