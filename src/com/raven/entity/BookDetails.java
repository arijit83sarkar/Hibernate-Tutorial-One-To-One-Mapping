package com.raven.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_details")
public class BookDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "book_name")
    private String bookName = "";

    @Column(name = "isbn_no")
    private String isbnNo = "";

    @Column(name = "publisher_name")
    private String publisherName = "";

    @Column(name = "published_date")
    private String publishedDate = "";

    public BookDetails() {
    }

    public BookDetails(String bookName, String isbnNo, String publisherName, String publishedDate) {
        this.bookName = bookName;
        this.isbnNo = isbnNo;
        this.publisherName = publisherName;
        this.publishedDate = publishedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIsbnNo() {
        return isbnNo;
    }

    public void setIsbnNo(String isbnNo) {
        this.isbnNo = isbnNo;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public String toString() {
        return "BookDetails [bookName=" + bookName + ", id=" + id + ", isbnNo=" + isbnNo + ", publishedDate="
                + publishedDate + ", publisherName=" + publisherName + "]";
    }

}
