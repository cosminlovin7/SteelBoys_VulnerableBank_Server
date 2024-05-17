package com.vulnerablebank.server.cmd;

public class LoginRequestCmd {
    private String username;
    private String password;

    public LoginRequestCmd() {
        super();
    }

    public LoginRequestCmd(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
