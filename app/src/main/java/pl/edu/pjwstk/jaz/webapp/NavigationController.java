package pl.edu.pjwstk.jaz.webapp;

import pl.edu.pjwstk.jaz.users.UserSession;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;


@Named
@RequestScoped
public class NavigationController implements Serializable {

    @Inject
    UserSession userSession;

    public String moveToAddAuction() {
        return "/addauction";
    }

    public String moveToEditAuction() {
        return "/editauction";
    }

    public String moveToLogin() {
        return "/login";
    }

    public String moveToRegister() {
        return "/register";
    }

    public String moveToEditSection() {
        if (userSession.getProfile().getUsername().equals("admin")) {
            return "/editsection";
        }
        else return "/accessdenied";
    }
}
