package com.raven.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "full_Name")
    private String fullName = "";

    @Column(name = "email")
    private String email = "";

    @Column(name = "phone_no")
    private String phoneNo = "";

    @Column(name = "country")
    private String country = "";

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_details_id")
    private BookDetails bookDetails;

    public Author() {
    }

    public Author(String fullName, String email, String phoneNo, String country) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public BookDetails getBookDetails() {
        return bookDetails;
    }

    public void setBookDetails(BookDetails bookDetails) {
        this.bookDetails = bookDetails;
    }

    @Override
    public String toString() {
        return "Author [bookDetails=" + bookDetails + ", country=" + country + ", email=" + email + ", fullName="
                + fullName + ", id=" + id + ", phoneNo=" + phoneNo + "]";
    }

}
