package pl.edu.pjwstk.jaz.users;

import pl.edu.pjwstk.jaz.auth.ProfileEntity;
import pl.edu.pjwstk.jaz.login.LoginFilter;
import pl.edu.pjwstk.jaz.webapp.LoginController;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.xml.registry.infomodel.User;
import java.io.Serializable;

@Named
@SessionScoped
public class UserSession implements Serializable {

    private String accountName = "";

    private ProfileEntity profileEntity;

    public ProfileEntity getProfile() {
        return profileEntity;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setProfile(ProfileEntity profileEntity) {
        this.profileEntity = profileEntity;
        accountName = " " + profileEntity.getName() + " " + profileEntity.getUsername();
    }

    public boolean loggedUser() {
        if (profileEntity != null) {
            return true;
        } else {
            return false;
        }
    }

}
