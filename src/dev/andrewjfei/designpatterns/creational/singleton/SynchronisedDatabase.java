package dev.andrewjfei.designpatterns.creational.singleton;

public class SynchronisedDatabase {
    private static volatile SynchronisedDatabase synchronisedDatabase;
    private String data;

    private SynchronisedDatabase() {}

    public static SynchronisedDatabase getInstance() {
        // Using local variable to reduce number of times to access memory.
        SynchronisedDatabase database = synchronisedDatabase;

        // If statement to reduce number of threads being blocked.
        if (database == null) {

            // The synchronized keyword is used to ensure only a single thread can access this block at a time. This
            // can be removed if we are not using multithreading.
            synchronized (SynchronisedDatabase.class) {
                database = synchronisedDatabase;
                if (synchronisedDatabase == null) {
                    synchronisedDatabase = new SynchronisedDatabase();
                }
            }
        }

        return database;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SynchronisedDatabase{" +
                "data='" + data + '\'' +
                '}';
    }
}
