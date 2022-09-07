package dev.andrewjfei.designpatterns.structural.facade;

public class FacadeMain {

    public static void main(String[] args) {
        String password = "password";

        // Using the facade class
        PasswordUtil passwordUtil = new PasswordUtil();
        String encodedPassword = passwordUtil.encode(password);
        System.out.println(encodedPassword);
    }
}
