package pl.edu.pjwstk.jaz.webapp;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@RequestScoped
public class NavigationController implements Serializable {
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
}
