package project;

public class Manager extends Employee {
    public Manager(String name, int id, String email, String password) {
        super(name, password);
    }

    @Override
    public String getRole() {
        return "Manager";
    }
}