package org.example;

public class WrongFixedPasswordGenerator implements PasswordGenerator{
    @Override
    public String generatePassword() {
        return "fuck"; // 4자
    }
}
