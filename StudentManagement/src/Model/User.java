package Model;

import java.util.Scanner;

public class User {
    private String userName;
    private String password;

    public User() {
        this.userName = "";
        this.password = "";
    }

    public User(String userName, String passWord) {
        this.userName = userName;
        this.password = passWord;
    }

    public String getUserName() {
        return userName;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String newPassword) {
        if (newPassword.isEmpty() || newPassword.length() < 8) {
            System.out.println("Mật khẩu không được rỗng và phải trên 8 kí tự. Vui lòng nhập lại.");
        }
        else {
            this.password = newPassword;
            System.out.println("Mật khẩu đã được thay đổi thành công!");
        }
    }

    public void changePassword(String newPassword) {
        setPassword(newPassword);
    }
}
