package com.book.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Hibernate.util.HibernateUtil;

public class BookDaoImpl implements BookDao {

	public void saveBook(Book book) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(book);
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Book is saved to Database");
	}

	public Book getBook(int bookId) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Object o = session.get(Book.class, bookId);
		Book book = (Book) o;
		session.close();
		factory.close();
		return book;
	}

}
