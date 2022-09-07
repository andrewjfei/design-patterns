package dev.andrewjfei.designpatterns.behavioural.template;

public class Plane extends Vehicle {
    public Plane() {}

    @Override
    public void move() {
        System.out.println("Fly to destination");
    }

    @Override
    public void arrive() {
        System.out.println("Land plane");
    }
}
