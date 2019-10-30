package pl.edu.pjwstk.jaz.users;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class Database {
    private final List<Account> database = new ArrayList<Account>();
    public void newUser(Account account) {
        database.add(account);
    }
    public Account CheckLoginandPassw(String username, String password) {
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).getUsername().equals(username)) {
                if (database.get(i).getPassword().equals(password)) {
                    return database.get(i);
                }
            }
        }
        return null;
    }
}