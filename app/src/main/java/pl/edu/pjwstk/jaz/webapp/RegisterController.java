package pl.edu.pjwstk.jaz.webapp;

//import pl.edu.pjwstk.jaz.auth.ProfileRepository;
import pl.edu.pjwstk.jaz.auth.ProfileRepository;
import pl.edu.pjwstk.jaz.login.RegisterRequest;
import pl.edu.pjwstk.jaz.users.Database;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@RequestScoped
public class RegisterController {
    @Inject
    private RegisterRequest registerRequest;

    @Inject
    private Database database;

    @Inject
    private ProfileRepository profileRepository;

    public void login() {
        System.out.println("Tried to register using " + registerRequest.toString());

        profileRepository.newUser(registerRequest.getProfileEnity());

       // profileRepository.sampleCodeWithPC();
    }
}
