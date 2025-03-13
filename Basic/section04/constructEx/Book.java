package com.kihongkim.section04.constructEx;

public class Book {
    String title;
    String author;
    int page;

    public Book() {
        this("", "", 0);
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);

    }
}
