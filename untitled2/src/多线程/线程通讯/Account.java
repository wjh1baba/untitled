package 多线程.线程通讯;

public class Account {
    private String card;
    private double money;

    public Account() {
    }

    public Account(String card, double money) {

        this.card = card;
        this.money = money;
    }


    public synchronized void deposit(double money) {
        String name = Thread.currentThread().getName();
        if(this.money == 0){
            System.out.println(name+"成功存入"+money);
            this.money += money;
            System.out.println("剩余钱:"+this.money);
            this.notifyAll();
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        else {

            this.notifyAll();
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }



    public synchronized void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        if(this.money >= money){
            System.out.println(name+"成功取出"+money);
            this.money -= money;
            System.out.println("剩余钱:"+this.money);
            this.notifyAll();
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        else {

            this.notifyAll();
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
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



}
