package 多线程.线程同步.同步方法;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String card;
    private double money;
    private final Lock lock = new ReentrantLock();   //使用实例对象ReentrantLock构建Lock锁对象
    public Account() {
    }

    public Account(String name, String card, double money) {

        this.card = card;
        this.money = money;
    }


    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


    public synchronized void drawMoney(double money) {
        String name = Thread.currentThread().getName();

        if(this.money >= money){
            System.out.println(name+"成功取出"+money);
            this.money -= money;
            System.out.println("剩余钱:"+this.money);
        }
        else {
            System.out.println(name +"余额不足");
        }


    }
}
