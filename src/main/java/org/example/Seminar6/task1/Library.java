package org.example.Seminar6.task1;

import org.example.Seminar6.task1.book.Book;

import java.util.ArrayList;
import java.util.List;

public class Library implements Searchable{
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public Library() {
    }

    @Override
    public List<Book> booksSearchByAuthor(String author) {
        List<Book>result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) result.add(book);
        }
        return result;
    }

    public List<Book> getBooks() {
        return books;
    }
}