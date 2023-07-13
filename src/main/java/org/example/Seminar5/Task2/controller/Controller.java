package org.example.Seminar5.Task2.controller;

import org.example.Seminar5.Task2.data.Student;
import org.example.Seminar5.Task2.data.User;
import org.example.Seminar5.Task2.service.UserService;

import java.util.List;

public class Controller {
    public void send(List<Student> students) {
        UserService userService  = new UserService();
        userService.create(students);
    }

    public List<Student> show(List<Student> students) {
        UserService userService = new UserService();
        return userService.read();
    }
}
