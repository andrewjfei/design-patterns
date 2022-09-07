package dev.andrewjfei.designpatterns.creational.singleton;

public class Database {
    private static Database database;
    private String data;

    private Database() {}

    public static Database getInstance() {
        if (database == null) {
            database = new Database();
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
        return "Database{" +
                "data='" + data + '\'' +
                '}';
    }
}
