package org.example;

public class CorrectFixedPasswordGenerator implements PasswordGenerator{
    @Override
    public String generatePassword() {
        return "abcderfg"; // 8글자
    }
}
