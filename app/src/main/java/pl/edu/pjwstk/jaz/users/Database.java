package pl.edu.pjwstk.jaz.users;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private final List<Account> database = new ArrayList<Account>();
    public void newUser(Account account) {
        database.add(account);
    }
    public boolean CheckLoginandPassw(String username, String password) {
        username.getBytes();
    }
}