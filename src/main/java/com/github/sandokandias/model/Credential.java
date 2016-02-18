package com.github.sandokandias.model;

import java.io.Serializable;

public class Credential implements Serializable {

    private static final long serialVersionUID = 3864104308733686876L;

    private String login;

    private String password;


    public Credential(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean isValid() {
        return (login != null && !login.isEmpty()) && (password != null && !password.isEmpty());
    }

}
