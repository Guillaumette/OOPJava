package org.example.Seminar6.task1;

import org.example.Seminar6.task1.book.Book;

import java.util.List;

public interface Searchable {
    public List<Book> booksSearchByAuthor(String author);
}
