package pl.edu.pjwstk.jaz.webapp;

//import pl.edu.pjwstk.jaz.auth.ProfileRepository;
import pl.edu.pjwstk.jaz.auth.ProfileRepository;
import pl.edu.pjwstk.jaz.login.RegisterRequest;
import pl.edu.pjwstk.jaz.users.Database;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;


@Named
@RequestScoped
public class RegisterController {
    @Inject
    private RegisterRequest registerRequest;

    @Inject
    private Database database;

    @Inject
    private ProfileRepository profileRepository;

    String errorMsg = "";

    public void login() throws IOException {
        System.out.println("Tried to register using " + registerRequest.toString());

        if(profileRepository.userExists(registerRequest.getUsername())) {
            errorMsg = "Uzytkownik o takim nicku juz istnieje!";
        } else {
            profileRepository.newUser(registerRequest.getProfileEntity());
            FacesContext context = FacesContext.getCurrentInstance();
            context.getExternalContext().redirect("/login");
        }
       //profileRepository.sampleCodeWithPC();
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
