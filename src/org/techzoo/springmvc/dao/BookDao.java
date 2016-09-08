package org.techzoo.springmvc.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.techzoo.springmvc.vo.BookVO;

@Component
public interface BookDao {
	
	public boolean addBook(BookVO book);
	public void updateBook(BookVO book);
	public List<BookVO> listBooks();
	public BookVO getBookById(Integer bookId);
	public boolean removeBook(BookVO book);
}
