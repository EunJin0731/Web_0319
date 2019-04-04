package kr.hs.dgsw.web_01_319;

public class User {

    private String id;
    private String name;
    private String email;
    private String password;

    public User(){}

    public User(String id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {return "User = " + name + "/" + email;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
