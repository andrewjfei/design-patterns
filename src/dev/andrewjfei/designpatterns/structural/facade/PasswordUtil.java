package dev.andrewjfei.designpatterns.structural.facade;

public class PasswordUtil {
    // Simplified method to use within the application
    public String encode(String password) {
        ThirdPartyEncoder encoder = new ThirdPartyEncoder();
        return encoder.encode(password);
    }
}
