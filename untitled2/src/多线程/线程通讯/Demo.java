package 多线程.线程通讯;

public class Demo {
    public static void main(String[] args) {
        //用一个卡号进行通讯
        Account acc = new Account("110",0);
        //二个线程取钱
        new Demo1("小红",acc).start();
        new Demo1("小明",acc).start();
        //三个线程存钱
        new Demo2("亲爸",acc).start();
        new Demo2("干爹",acc).start();
        new Demo2("姥爷",acc).start();
    }
}


class Demo1 extends Thread{
    private Account acc;

    public Demo1() {
    }

    public Demo1(String name, Account acc) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        while (true) {
            acc.drawMoney(1500.0);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


class Demo2 extends Thread{
    private Account acc;

    public Demo2() {
    }

    public Demo2(String name, Account acc) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {

        while (true) {
            acc.deposit(1500.0);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}