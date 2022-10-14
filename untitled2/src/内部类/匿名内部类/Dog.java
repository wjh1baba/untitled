package 内部类.匿名内部类;

import 多态.形式.Dod;

public abstract class Dog {
    String name;
    abstract void move();
    abstract void call();

    public static void main(String[] args) {
        Dog dg = new Dog() {
            @Override
            void move() {
                System.out.println(name+"跑的飞快");
            }

            @Override
            void call() {
                System.out.println(name+"汪汪~");
            }
        };

        dg.move();
        dg.call();
    }
}
