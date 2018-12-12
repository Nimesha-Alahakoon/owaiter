package nishi.owaiter3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class User {

    @Id
    @GeneratedValue
    @Column(name = "userid")
    private String id;
    @Column(name = "username")
    private String name;
    @Column(name = "useremail")
    private String email;
    @Column(name = "userstatus")
    private String status;

    public User(String id,String name,String email,String status)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.status=status;
    }

    public User(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
