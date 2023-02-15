package models;

import exceptions.BadFormatAuthentificationDataException;
import exceptions.NullAuthentificationDataException;

public class User {
    private String login;
    private String password;

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean authenticateUser() throws NullAuthentificationDataException, BadFormatAuthentificationDataException {
        if (login == null || password == null) {
            throw new NullAuthentificationDataException("Login and password are required");
        } else {
            if (login.length() < 3 || password.length() < 4) {
                throw new BadFormatAuthentificationDataException("The login must have at least 3 characters and the password 4.");
            }
        }
        return login.equals("admin") && password.equals("passer1234");
    }
}
