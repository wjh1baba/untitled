package 多线程.创建线程方式;

import java.util.concurrent.Callable;

import java.util.concurrent.FutureTask;


//第三种方法 可以得到线程返回值
public class Demo3 {
    public static void main(String[] args) {
        //创建callable 任务对象
        Callable<String> mycall = new Mycall(100);
        //把Callable 任务对象交给 FutureTask 对象
        //FutureTask 对象 底层实现了Rannable接口 可以把FutureTask对象直接给Thread
        //可以通过FutureTask.get 拿到线程执行后的结果
        FutureTask<String> f1 = new FutureTask<>(mycall);

        Thread t1 = new Thread(f1);
        t1.start();

        try {
            //如果线程f1任务没有执行完毕，这里的代码会等待到执行线程f1执行完毕
            String s = f1.get();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class Mycall implements Callable<String>{
    int n;

    public Mycall(int n) {
        this.n = n;
    }

    @Override
    public String call() {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return n+"之和为:"+sum;
    }
}