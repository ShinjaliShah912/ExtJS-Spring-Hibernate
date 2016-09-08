package org.techzoo.springmvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.techzoo.springmvc.vo.BookVO;



import org.techzoo.springmvc.util.HibernateUtil;
@Repository
public class BookDaoImpl implements BookDao {

	private static List<BookVO> books = new ArrayList<BookVO>();

	@Override
	public boolean addBook(BookVO book) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
		transaction = session.beginTransaction();
		session.saveOrUpdate(book);
		session.getTransaction().commit();
		
		} catch (HibernateException e) {
			e.printStackTrace();
		} 
		
		return books.add(book);
	}

	@Override
	public boolean removeBook(BookVO book) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
		transaction = session.beginTransaction();
		session.delete(book);
		session.getTransaction().commit();
		
		} catch (HibernateException e) {
			e.printStackTrace();
		} 
		return books.remove(book);
	}

	@Override
	public List<BookVO> listBooks() {
		return books;
	}

	@Override
	public void updateBook(BookVO book) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try{
		transaction = session.beginTransaction();
		int index = books.indexOf(book);
		if(index != -1) {
			books.add(index, book);
		  }

		session.saveOrUpdate(book);
		session.getTransaction().commit();
		
		}catch (HibernateException e) {
			e.printStackTrace();
		} 

	}
	
	@Override
	public BookVO getBookById(Integer bookId) {
		BookVO b = null;
		for(BookVO b1 : books) {
			if(b1.getId() == bookId) {
				return b1;
			}
		}
		return b;
	}

}