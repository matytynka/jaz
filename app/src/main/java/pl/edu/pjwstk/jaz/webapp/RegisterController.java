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

    public void login() throws IOException {
        System.out.println("Tried to register using " + registerRequest.toString());

        profileRepository.newUser(registerRequest.getProfileEnity());

        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().redirect("/app/webapp/login");

       // profileRepository.sampleCodeWithPC();
    }
}
