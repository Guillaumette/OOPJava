package org.example.Seminar5.Task2.data;

import java.time.LocalDate;

public abstract class User {
    String name;
    LocalDate birthDate;

    public User(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public User() {
    }
}
