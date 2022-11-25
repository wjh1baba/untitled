package 多线程.线程同步.lock锁;

public class Demo1 {
    public static void main(String[] args) {
        Account acc = new Account("小明","110",10000);
        Thread t1 = new Mythread("小明",acc);
        Thread t2 = new Mythread("小洪",acc);
        t1.start();
        t2.start();
    }
}


class Mythread extends Thread{
    private Account acc;
    public Mythread() {
    }

    public Mythread(String name, Account acc) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        acc.drawMoney(10000);
    }
}

