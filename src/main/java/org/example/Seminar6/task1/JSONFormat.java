package org.example.Seminar6.task1;

import org.example.Seminar6.task1.book.Book;
import org.example.Seminar6.task1.book.ElectronBook;

public class JSONFormat implements Formatter{

    @Override
    public void toFormat(ElectronBook book) {
        System.out.println("Форматировали " + book + " в JSON");
    }
}
