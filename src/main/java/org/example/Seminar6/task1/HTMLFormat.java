package org.example.Seminar6.task1;

import org.example.Seminar6.task1.book.ElectronBook;

public class HTMLFormat implements Formatter{
    @Override
    public void toFormat(ElectronBook book) {
        System.out.println("Форматировали " + book + " в HTML");
    }
}
