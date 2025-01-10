package org.example.cis3270_project_current.Registration_Login;

import java.util.Scanner;

public class UserLogin {

    private String userName;
    private String password;
    private boolean loggedIn;

    public UserLogin(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.loggedIn = false;

    }
    public void passwordMatch(String passMatch) {
        if (passMatch.equals(this.password)) {
            this.loggedIn = true;
        }
        else {
            this.loggedIn = false;
        }
    }

    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return userName;
    }
    public Boolean getLoggedIn() {
        return loggedIn;
    }
    public void setLoggedIn(Boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

}