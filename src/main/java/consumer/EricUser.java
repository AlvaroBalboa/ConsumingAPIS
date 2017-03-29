package consumer;

/**
 * Created by souporman on 3/29/17.
 */
public class EricUser {
    String address;
    String email;
    String groups;
    int id;
    String username;

    public EricUser() {
    }
    public EricUser(String address,String email,int id,String username){
        this.address=address;
        this.email = email;
        this.id=id;
        this.username=username;
        this.groups="random PUT group";

    }

    public EricUser(String address, String email, String groups, int id, String username) {
        this.address = address;
        this.email = email;
        this.groups = groups;
        this.id = id;
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
