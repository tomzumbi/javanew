import Model.Admin;
import Model.Student;
import Model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<User> users = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Tạo tài khoản admin và sinh viên
        users.add(new Admin("admin","admin123"));
        users.add(new Student("student1","student123"));
        users.add(new Admin("student2","student234"));
        users.add(new Admin("student2","student234"));
        users.add(new Admin("student2","student234"));
        users.add(new Admin("student2","student234"));
        users.add(new Admin("student2","student234"));
    }
}
