package dev.andrewjfei.designpatterns.behavioural.template;

public abstract class Vehicle {
    // Template method
    public void travel() {
        start();
        move();
        arrive();
        end();
    }

    // Template method step
    public void start() {
        System.out.println("Start engine");
    }

    // Template method step
    public abstract void move();

    // Template method step
    public abstract void arrive();

    // Template method step
    public void end() {
        System.out.println("Turn off engine");
    }
}
