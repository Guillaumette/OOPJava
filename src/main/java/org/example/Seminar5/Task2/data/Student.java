package org.example.Seminar5.Task2.data;

import java.time.LocalDate;

public class Student extends User {
    int studentId;

    public Student(String name, LocalDate birthDate, int studentId) {
        super(name, birthDate);
        this.studentId = studentId;
    }
}
