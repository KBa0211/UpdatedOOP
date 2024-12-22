package project;

public class Admin extends User {
    public Admin(String name, String password) {
        super(name, password);
    }

    @Override
    public String getRole() {
        return "Admin";
    }
}