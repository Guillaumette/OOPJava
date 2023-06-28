package org.example.Seminar1.Homework;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shop mrGeek = new Shop("Мистер Гик");
        Item gift1 = new Item("Картина по номерам Гарри Поттер", 1490, 10);
        Item gift2 = new Item("Бокал В семье не без винишка", 550, 7);
        Item game1 = new Item("Морской бой на раздевание", 890, 9);
        Item game2 = new Item("Ужас Аркхэма", 2890, 10);
        Item game3 = new Item("Покерный набор (300 фишек)", 3750, 5);
        Item gadget1 = new Item("Оптическая мышь на палец", 390, 8);
        Item gadget2 = new Item("Флешка Супермен", 450, 6);
        Item cup1 = new Item("Бутылка Smiling Avocado", 850, 10);
        Item cup2 = new Item("Термокружка Проснись!", 590, 10);
        mrGeek.addItem(gift1);
        mrGeek.addItem(gift2);
        mrGeek.addItem(game1);
        mrGeek.addItem(game2);
        mrGeek.addItem(game3);
        mrGeek.addItem(gadget1);
        mrGeek.addItem(gadget2);
        mrGeek.addItem(cup1);
        mrGeek.addItem(cup2);
        Category gifts = new Category("Подарки");
        gifts.addItem(gift1);
        gifts.addItem(gift2);
        Category boardGames = new Category("Настольные игры");
        boardGames.addItem(game1);
        boardGames.addItem(game2);
        boardGames.addItem(game3);
        Category gadgets = new Category("Гаджеты");
        gadgets.addItem(gadget1);
        gadgets.addItem(gadget2);
        Category capsBottles = new Category("Кружки и бутылки");
        capsBottles.addItem(cup1);
        capsBottles.addItem(cup2);
        List<Item> items = mrGeek.getCatalog();
        System.out.println(mrGeek.toString());
        System.out.println(items);
        System.out.println();
        User user1 = new User("fruity_goose", "iamgeek666");
        User user2 = new User("BTS_from_left_to_right", "merrywithchonguk");
        User user3 = new User("Guillaumette94", "itsoktobe");
        User user4 = new User("Todd_Govard", "buy_Skyrim_100500");
        user1.buyItem(game2, mrGeek);
        List<Item> transaction1 = user1.getBasket();
        System.out.println("transaction1 = " + transaction1);
        user2.buyItem(gift2, mrGeek);
        List<Item> transaction2 = user2.getBasket();
        System.out.println("transaction2 = " + transaction2);
        user3.buyItem(gift1, mrGeek);
        List<Item> transaction3 = user3.getBasket();
        System.out.println("transaction3 = " + transaction3);
        user4.buyItem(gadget2, mrGeek);
        List<Item> transaction4 = user4.getBasket();
        System.out.println("transaction4 = " + transaction4);
        System.out.println();
        items = mrGeek.getCatalog();
        System.out.println(items);
    }
}
