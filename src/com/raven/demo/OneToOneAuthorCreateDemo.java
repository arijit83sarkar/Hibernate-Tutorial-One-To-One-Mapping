package com.raven.demo;

import com.raven.entity.Author;
import com.raven.entity.BookDetails;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneAuthorCreateDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("----- One-To-One Mapping - Author Demo ------");
        SessionFactory sessionFactory = null;
        Session session = null;

        try {
            sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Author.class)
                    .addAnnotatedClass(BookDetails.class).buildSessionFactory();
            session = sessionFactory.getCurrentSession();

            Author author = new Author("Rabindranath Tagore", "rabi@abcmail.com", "9933333311", "INDIA");
            BookDetails bookDetails = new BookDetails("Gitanjali", "ISBN-10050", "ABC Publishers", "01/01/1947");
            author.setBookDetails(bookDetails);

            session.beginTransaction();
            session.save(author);
            session.getTransaction().commit();
            System.out.println("------------> DATA SAVED!!! <----------");
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
