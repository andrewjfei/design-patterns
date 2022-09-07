package dev.andrewjfei.designpatterns.behavioural.template;

public class TemplateMain {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle plane = new Plane();

        System.out.println("Car Travel:");
        // Using template method
        car.travel();

        System.out.println("\nPlane Travel:");
        // Using template method
        plane.travel();
    }
}
