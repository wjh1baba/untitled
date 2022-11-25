package 多线程.线程池;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws Exception{
        ExecutorService pool = new ThreadPoolExecutor(3,5,6, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),new ThreadPoolExecutor.AbortPolicy());
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4= pool.submit(new MyCallable(400));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
    }
}

class MyCallable implements Callable<String> {
    private int n;

    public MyCallable() {
    }

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName()+"线程==>"+n+"之和的结果是"+sum;
    }
}