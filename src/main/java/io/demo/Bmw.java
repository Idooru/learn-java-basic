package io.demo;

public class Bmw extends Car {
    public void action() {
        super.action();
        System.out.println(super.wheels);
    }
}
