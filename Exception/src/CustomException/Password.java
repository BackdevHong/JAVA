package CustomException;

public class Password {
    private String password;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) throws PasswordException {
        if (password == null) {
            throw new PasswordException("비밀번호는 null일 수 없습니다.");
        } else if (password.length() < 5) {
            throw new PasswordException("비밀번호는 5글자 이하일 수 없습니다.");
        } else if (password.matches("[a-zA-Z]+")) {
            throw new PasswordException("비밀번호는 숫자와 특수기호를 포함하여아 합니다.");
        }

        this.password = password;
    }
}
