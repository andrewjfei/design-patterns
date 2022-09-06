package dev.andrewjfei.designpatterns.creational.builder;

public class BuilderMain {

    public static void main(String[] args) {
        Car emptyCar = Car.builder().build();

        Car partialCar = Car.builder()
                .make("Toyota")
                .model("Supra")
                .type("Coupe")
                .build();

        Car fullCar = Car.builder()
                .make("Toyota")
                .model("Hilux")
                .type("Ute")
                .colour("Orange")
                .build();

        System.out.println(emptyCar);
        System.out.println(partialCar);
        System.out.println(fullCar);
    }
}
