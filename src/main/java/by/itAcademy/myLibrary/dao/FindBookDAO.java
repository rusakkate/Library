package by.itAcademy.myLibrary.dao;

import java.util.List;

import by.itAcademy.myLibrary.dao.exception.DAOException;
import by.itAcademy.myLibrary.entity.Book;

public interface FindBookDAO {
	Book find(int id) throws DAOException;
	List<Book> findByTitle(String title);
	List<Book> findByAuthor(String author) throws DAOException;
}
