package Kissalista.Models;

/**
 *
 * @author David Consuegra
 */
public class User {
    
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static User getUser(String name, String password) {
        if (name.equals("admin") && password.equals("1234")) {
            return new User(1, "Maija Meikäläinen");
        }
        return null;
    }

}
