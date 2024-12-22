package project;

public abstract class User {
    private String name;
    private int id;
    private String email;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public abstract String getRole();
}