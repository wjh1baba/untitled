package 多线程.创建线程方式;

// 方法二 通过实现Runnable类,把任务类对象给Thread实现多线程
public class Demo2 {
    public static void main(String[] args) {
        Runnable myrunable = new MyRunable();
        Thread t = new Thread(myrunable);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程的任务"+i);
        }
    }
}


//这样就可以实现多实现和继承
class MyRunable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程的任务"+i);
        }
    }
}
