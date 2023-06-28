package org.example.Seminar1.Homework;

import java.util.LinkedList;
import java.util.List;

public class Basket extends Shop {

    public Basket(List<Item> item) {
        super.setCatalog(item);
    }

    public Basket(){
        super.setCatalog(new LinkedList<>());
    }

    @Override
    public String toString() {
        return "Basket [" + getCatalog() + ']';
    }
}
