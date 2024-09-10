package Model;

import java.util.List;

public class Admin extends User{
    public Admin(String userName, String passwork){
        super(userName,passwork);
    }
    public void deleteStudent(List<User> users, String userName){
        boolean userFound = false;
        for (User user : users){
            if (user instanceof Student && user.getUserName().equals(userName)){
                users.remove(user);
                System.out.println("Tài khoản sinh viên '" + userName + "' đã được xóa.");
                userFound = true;
                break;
            }
        }
        if (!userFound){
            System.out.println("Tài khoản sinh viên '" + userName + "' không tồn tại.");
        }
    }
}
