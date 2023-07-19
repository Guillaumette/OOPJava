package org.example.Seminar6.task1;

public class GenreBook implements Genre{
    private String genreName;

    public GenreBook(String genreName) {
        this.genreName = genreName;
    }

    @Override
    public String getGenre() {
        return genreName;
    }
}
