package org.example.Lection2.Ex001;

import java.util.Random;

public abstract class BaseHero {
    public BaseHero(String name, int hp) {
        System.out.println("Вызван BaseHero(String name, int hp)");
    }

    public BaseHero() {
        this("", 0);
        System.out.println("Вызван BaseHero()");
    }
}
