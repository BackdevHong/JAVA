package CustomException;

public class PasswordTest {
    public static void main(String[] args) {
        Password password = new Password();
        String passwordText = null;

        try {
            password.setPassword(passwordText);
            System.out.println("오류 없음");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        passwordText = "abcd";
        try {
            password.setPassword(passwordText);
            System.out.println("오류 없음");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        passwordText = "abcde";
        try {
            password.setPassword(passwordText);
            System.out.println("오류 없음");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        passwordText = "abcde#1";
        try {
            password.setPassword(passwordText);
            System.out.println("오류 없음");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
