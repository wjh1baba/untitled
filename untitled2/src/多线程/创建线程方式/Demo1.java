package 多线程.创建线程方式;


// 通过直接继承Thread
public class Demo1 {
    public static void main(String[] args) {
        Thread mythread = new Mythread();
        mythread.start();

        //主线程的任务要放在子线程之后
        for (int i = 0; i < 5; i++) {
            System.out.println("打印主线程"+i);
        }
    }
}


class Mythread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("打印子线程"+i);
        }
    }
}