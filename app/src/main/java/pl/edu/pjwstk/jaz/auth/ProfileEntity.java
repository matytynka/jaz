package pl.edu.pjwstk.jaz.auth;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profile")
public class ProfileEntity {
    @Id
    private String username;

    private String name;
    private String surname;
    private String email;
    private String birthdate;
    private String password;

    public ProfileEntity(String username, String name, String surname, String email, String birthdate, String password) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthdate = birthdate;
        this.password = password;
    }

    public ProfileEntity() {
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }
}
