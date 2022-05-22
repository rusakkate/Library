package by.itAcademy.myLibrary.dao;

import by.itAcademy.myLibrary.dao.exception.DAOException;
import by.itAcademy.myLibrary.entity.Book;

public interface CRUDBookDAO {
	void save (Book book) throws DAOException;
	void update (int id, Book book);
	void delete (Book book);
	void delete (int id) throws DAOException;
	
	void updateStatus (int id, int newStatus);


}
