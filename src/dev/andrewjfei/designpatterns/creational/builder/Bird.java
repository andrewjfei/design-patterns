package dev.andrewjfei.designpatterns.creational.builder;

public class Bird {
    private String type;
    private String colour;
    private boolean canFly;

    public static BirdBuilder builder() {
        return new BirdBuilder();
    }

    private Bird(String type, String colour, boolean canFly) {
        this.type = type;
        this.colour = colour;
        this.canFly = canFly;
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

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "type='" + type + '\'' +
                ", colour='" + colour + '\'' +
                ", canFly=" + canFly +
                '}';
    }

    public static class BirdBuilder implements Builder<Bird> {
        private String type;
        private String colour;
        private boolean canFly;

        public BirdBuilder() {}

        public BirdBuilder type(String type) {
            this.type = type;
            return this;
        }

        public BirdBuilder colour(String colour) {
            this.colour = colour;
            return this;
        }

        public BirdBuilder canFly(boolean canFly) {
            this.canFly = canFly;
            return this;
        }

        @Override
        public Bird build() {
            return new Bird(type, colour, canFly);
        }
    }
}
