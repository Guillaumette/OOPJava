package org.example.Seminar5.Task2.service;

import org.example.Seminar5.Task2.data.Student;
import org.example.Seminar5.Task2.data.User;

import java.util.List;

public class UserService implements DataService {
    List<Student> studentList;
    @Override
    public void create(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public List<Student> read() {
        return studentList;
    }
}
