package org.example.Seminar1.Homework;


import java.util.List;

public class User {
    private String login;
    private String password;
    private Basket basket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public List<Item> getBasket() {
        return basket.getCatalog();
    }

    public void buyItem(Item item, Shop shop) {
        basket.addItem(item);
        shop.removeItem(item);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", basket=" + basket +
                '}';
    }
}
