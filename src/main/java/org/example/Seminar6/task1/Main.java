package org.example.Seminar6.task1;

import org.example.Seminar6.task1.book.Book;
import org.example.Seminar6.task1.book.ElectronBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(Arrays.asList(
                new Book("Властелин колец: Братство Кольца", "Толкиен", 1984, new GenreBook("фентези")),
                new Book("Гарри Поттер и философский камень", "Роулинг", 1994, new GenreBook("фентези")),
                new Book("Игра престолов", "Мартин", 1994, new GenreBook("фентези")),
                new ElectronBook("Гарри Поттер и философский камень", "Роулинг", 1994, new GenreBook("фентези"), "fb2", 50),
                new ElectronBook("Властелин колец: Братство Кольца", "Толкиен", 1984, new GenreBook("фентези"), "epub", 80)
        ));
        System.out.println("library.booksSearchByAuthor(\"Толкиен\") = " + library.booksSearchByAuthor("Толкиен"));
        System.out.println("library.booksSearchByAuthor(\"Роулинг\") = " + library.booksSearchByAuthor("Роулинг"));
        Formatter formatter = new JSONFormat();
        formatter.toFormat((ElectronBook) library.getBooks().get(3));
        formatter.toFormat((ElectronBook) library.getBooks().get(4));
    }
}
