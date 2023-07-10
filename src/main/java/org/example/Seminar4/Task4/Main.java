package org.example.Seminar4.Task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LRUCache<Employee> cache = new LRUCache<Employee>(4);
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            employees.add(new Employee("Иванов Иван Иванович " + i, i * 100,  "раб " + i));
        }
        for (Employee employee : employees) {
            cache.addElement(employee);
            System.out.println("cache.getAllElement() = " + cache.getAllElement());
        }

    }
}
