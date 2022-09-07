package dev.andrewjfei.designpatterns.creational.builder;

public class BirdDirector {

    public BirdDirector() {};

    public void buildKiwi(Bird.BirdBuilder builder) {
        builder.type("Kiwi").colour("Brown").canFly(false);
    }

    public void buildEagle(Bird.BirdBuilder builder) {
        builder.type("Eagle").colour("White/Brown").canFly(true);
    }
}
