package org.example.Seminar5.Task2.service;

import org.example.Seminar5.Task2.data.Student;
import org.example.Seminar5.Task2.data.User;

import java.util.List;

public interface DataService {
    void create(List<Student> studentList);
    List<Student> read();
}
