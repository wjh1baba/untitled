package 多线程.线程池;

import java.util.concurrent.*;

public class Demo {
    public static void main(String[] args) {
        ExecutorService pools = new ThreadPoolExecutor(3,5,6, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        Runnable target = new MyRunnable();
        pools.execute(target);
        pools.execute(target);
        pools.execute(target);

        pools.execute(target);    //在队列中
        pools.execute(target);
        pools.execute(target);
        pools.execute(target);
        pools.execute(target);   //队列装满了,下一个要启动临时线程了

        pools.execute(target);   //开始使用临时线程
        pools.execute(target);

        pools.execute(target);   //核心进程和临时进程全部在运行,队列满时,拒绝策略被触发
//
//        pools.shutdownNow();  //立即关闭,即使任务没玩完成,会丢失任务
//        pools.shutdown();    //等待全部任务执行完毕再关闭
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}