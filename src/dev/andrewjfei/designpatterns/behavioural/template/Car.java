package dev.andrewjfei.designpatterns.behavioural.template;

public class Car extends Vehicle {
    public Car() {}

    @Override
    public void move() {
        System.out.println("Drive to destination");
    }

    @Override
    public void arrive() {
        System.out.println("Park car");
    }
}
