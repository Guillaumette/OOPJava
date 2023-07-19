package org.example.Seminar6.task1.book;

import org.example.Seminar6.task1.GenreBook;

public class ElectronBook extends Book{
    private String format;
    private Integer size;

    public ElectronBook(String name, String author, int year, GenreBook genre, String format, Integer size) {
        super(name, author, year, genre);
        this.format = format;
        this.size = size;
    }

    public ElectronBook() {
    }

    public String getFormat() {
        return format;
    }

    public Integer getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "ElectronBook{" +
                "name='" + super.getName() + '\'' +
                ", author='" + super.getAuthor() + '\'' +
                ", year=" + super.getAuthor() + '\'' +
                ", genre=" + super.getGenre() +
                "format='" + format + '\'' +
                ", size=" + size +
                '}';
    }
}
