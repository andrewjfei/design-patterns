package dev.andrewjfei.designpatterns.creational.builder;

public class CarBuilder {
    private String make;
    private String model;
    private String type;
    private String colour;

    public CarBuilder() {}

    public CarBuilder make(String make) {
        this.make = make;
        return this;
    }

    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder type(String type) {
        this.type = type;
        return this;
    }

    public CarBuilder colour(String colour) {
        this.colour = colour;
        return this;
    }

    public Car build() {
        return new Car(make, model, type, colour);
    }
}
