package com.jbs1;

public class Config {
    /*
   This class gathers instance variables information based on the
   DB_Arguments.properties file
     */
    String url;
    String username;
    String password;
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
