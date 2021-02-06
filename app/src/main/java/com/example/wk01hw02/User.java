package com.example.wk01hw02;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int userId;
    private String username;
    private String password;

    static ArrayList<User> users;

    public User(String username, String password) {
        this.userId = users.size() + 1;
        this.username = username;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        User user1 = new User("din_djarin", "baby_yoda_ftw");
    }
}
