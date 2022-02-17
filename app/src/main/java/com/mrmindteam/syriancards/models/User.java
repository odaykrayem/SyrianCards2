package com.mrmindteam.syriancards.models;

public class User {
    private int id;
    private String name;
    private String phone;
    private String city;
    private int balance;
    private String token;

    public User(int id, String name, String phone, String city, int balance, String token) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.balance = balance;
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
