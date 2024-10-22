package com.ssafy.mvc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.ssafy.mvc.dto.Book;

@Repository
public class BookDaoImpl implements BookDao {
	private final DataSource ds;
	public BookDaoImpl(DataSource ds) {
		System.out.println("BookDaoImpl 객체 생성");
		this.ds = ds;
	}

	/**
	 * 전체 목록 조회
	 */
	@Override
	public List<Book> selectAll() throws SQLException {
		String sql = "select id, title, author, price\r\n"
				+ "from book";
		List<Book> books = new ArrayList<>();
		try(
				Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			while(rs.next()) {
				Book book = new Book();
				book.setId(rs.getInt("id"));
				book.setTitle(rs.getString("title"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getInt("price"));

				books.add(book);
			}
		}
		return books;
	}


	@Override
	public Book findById(int id) throws SQLException {
		String sql = "select id, title, author, price, description\r\n"
				+ "from book\r\n"
				+ "where id=?";
		try(
				Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);){
			pstmt.setInt(1, id);
			try(ResultSet rs = pstmt.executeQuery();){
				if(rs.next()) {
					Book book = new Book();
					book.setId(id);
					book.setTitle(rs.getString("title"));
					book.setAuthor(rs.getString("author"));
					book.setPrice(rs.getInt("price"));
					book.setDescription(rs.getString("description"));
					return book;
				}
				return null;
			}
		}
	}

	@Override
	public int insert(Book book) throws SQLException {
		String sql = "insert into book\r\n"
				+ "(title, author, price, description)\r\n"
				+ "values\r\n"
				+ "(?, ?, ?, ?)";
		try(
				Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);){
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setInt(3, book.getPrice());
			pstmt.setString(4, book.getDescription());

			return pstmt.executeUpdate();
		}
	}

	@Override
	public int deleteById(int id) throws SQLException {
		String sql = "delete from book\r\n"
				+ "where id=?";
		try(
				Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);){
			pstmt.setInt(1, id);

			return pstmt.executeUpdate();
		}
	}
}
