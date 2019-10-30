package pl.edu.pjwstk.jaz.login;

import pl.edu.pjwstk.jaz.users.Account;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class RegisterRequest {
    private String name, surname, username, email, birthdate, password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getBirthdate() { return birthdate; }

    public void setBirthdate(String birthdate) { this.birthdate = birthdate; }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() { return password; }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "RegisterRequest{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    public Account getAccount() {
        Account acc = new Account();
        acc.setUsername(this.username);
        acc.setPassword(this.password);
        acc.setBirthdate(this.birthdate);
        acc.setEmail(this.email);
        acc.setSurname(this.surname);
        acc.setName(this.name);

        return acc;
    }
}
