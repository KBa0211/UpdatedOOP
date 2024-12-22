package project;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {
    private List<String> users;
    public Admin(String name, String password) {
        super(name, password);
        this.users = new ArrayList<>();
    }

    public List<String> getUsers() {
        return users;
    }
    public void setUsers(List<String> users) {
        this.users = users;
    }

    public void addUser(String user){
        users.add(user);
        System.out.println("Adding user: " + user);
    }
    public void removeUser(String user){
        users.remove(user);
        System.out.println("Removing user: " + user);
    }
    public void updateUser(String user1, String user2){
        removeUser(user1);
        addUser(user2);
        System.out.println("Updating user: " + user1 + " to user: " + user2);
    }
    public void viewLogs(){
        System.out.println("Viewing logs...");
    }

}
