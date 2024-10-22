package com.ssafy.mvc.model.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.mvc.dto.Book;
import com.ssafy.mvc.model.dao.BookDao;

@Service
public class BookServiceImpl implements BookService {
	private final BookDao bookDao;
	public BookServiceImpl(BookDao bookDao) {
		System.out.println("BookServiceImpl 객체 생성");
		this.bookDao = bookDao;
	}

	@Override
	public List<Book> selectAll() throws SQLException {
		return bookDao.selectAll();
	}

	@Override
	public Book findById(int id) throws SQLException {
		return bookDao.findById(id);
	}

	@Override
	public int insert(Book phone) throws SQLException {
		return bookDao.insert(phone);
	}

	@Override
	public int deleteById(int id) throws SQLException {
		return bookDao.deleteById(id);
	}

}
