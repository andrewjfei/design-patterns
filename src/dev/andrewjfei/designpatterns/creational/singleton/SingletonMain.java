package dev.andrewjfei.designpatterns.creational.singleton;

public class SingletonMain {

    public static void main(String[] args) {

        // Standard (non synchronised)
        Database database = Database.getInstance();
        System.out.println(database.getData());

        database.setData("Data");
        System.out.println(database.getData());

        Database anotherDatabase = Database.getInstance();
        System.out.println(anotherDatabase.getData());

        // Synchronised
        // TODO: Fix synchronised singleton
//        SynchronisedDatabase synchronisedDatabase = SynchronisedDatabase.getInstance();
//        System.out.println(synchronisedDatabase);
//
//        synchronisedDatabase.setData(" Synchronised Data");
//        System.out.println(synchronisedDatabase.getData());
//
//        SynchronisedDatabase anotherSynchronisedDatabase = SynchronisedDatabase.getInstance();
//        System.out.println(anotherSynchronisedDatabase.getData());
    }
}
