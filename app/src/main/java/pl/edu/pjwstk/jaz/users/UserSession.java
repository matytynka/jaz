package pl.edu.pjwstk.jaz.users;

import pl.edu.pjwstk.jaz.login.LoginFilter;
import pl.edu.pjwstk.jaz.webapp.LoginController;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.xml.registry.infomodel.User;
import java.io.Serializable;

@Named
@SessionScoped
public class UserSession implements Serializable {
    private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public boolean loggedUser() {
        if (account != null) {
            return true;
        } else {
            return false;
        }
    }
}
