package com.example.soldaplication.Activity.Models;

/**
 * Created by Erick_lap on 17/09/2017.
 */

public class User {
    private int userId;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String address;
    private int cellphone;
    private int cardNumber;
    private int secureCode;

    public User(int userId, String name, String lastName, String email, String password, String address, int cellphone, int cardNumber, int secureCode) {
        this.userId = userId;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.cellphone = cellphone;
        this.cardNumber = cardNumber;
        this.secureCode = secureCode;
    }

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public User setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    public int getCellphone() {
        return cellphone;
    }

    public User setCellphone(int cellphone) {
        this.cellphone = cellphone;
        return this;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public User setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public int getSecureCode() {
        return secureCode;
    }

    public User setSecureCode(int secureCode) {
        this.secureCode = secureCode;
        return this;
    }
}
