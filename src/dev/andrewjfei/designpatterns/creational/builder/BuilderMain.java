package dev.andrewjfei.designpatterns.creational.builder;

public class BuilderMain {

    public static void main(String[] args) {
        // Standard (without director)
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

        // Using director
        BirdDirector birdDirector = new BirdDirector();

        Bird.BirdBuilder eagleBirdBuilder = Bird.builder();
        birdDirector.buildEagle(eagleBirdBuilder);

        Bird eagleBird = eagleBirdBuilder.build();

        Bird.BirdBuilder kiwiBirdBuilder = Bird.builder();
        birdDirector.buildKiwi(kiwiBirdBuilder);

        Bird kiwiBird = kiwiBirdBuilder.build();

        System.out.println(eagleBird);
        System.out.println(kiwiBird);
    }
}
