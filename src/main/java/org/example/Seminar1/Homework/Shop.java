package org.example.Seminar1.Homework;

import java.util.LinkedList;
import java.util.List;

public class Shop {
    private String name;
    private List<Item> catalog;

    public Shop(String name, List<Item> catalog) {
        this.name = name;
        this.catalog = catalog;
    }

    public Shop(String name) {
        this.name = name;
        this.catalog = new LinkedList<>();
    }

    public Shop(){

    }

    public String getName() {
        return name;
    }

    public List<Item> getCatalog() {
        return catalog;
    }

    public void setCatalog(List<Item> catalog) {
        this.catalog = catalog;
    }

    public void addItem(Item item) {
        this.catalog.add(item);
    }

    public void removeItem(Item item){
        this.catalog.remove(item);
    }


    @Override
    public String toString() {
        return "Мы рады, что вы выбрали наш магазин <<" + name + ">>\n" +
                "Ознакомьтесь с каталогом товаров:\n ";
    }
}
