package dev.andrewjfei.designpatterns.creational.builder;

public class Car {
    private String make;
    private String model;
    private String type;
    private String colour;

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    private Car(String make, String model, String type, String colour) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.colour = colour;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    // Builder
    public static class CarBuilder implements Builder<Car> {
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

        @Override
        public Car build() {
            return new Car(make, model, type, colour);
        }
    }
}
