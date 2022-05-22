package by.itAcademy.myLibrary.service;

import java.util.List;

import by.itAcademy.myLibrary.entity.Book;
import by.itAcademy.myLibrary.service.exception.ServiceException;

public interface BookService {
		void save (Book book) throws ServiceException;
		Book findById (int id) throws ServiceException;
		public List<Book> findByAuthor(String author) throws ServiceException;
		void delete (int id) throws ServiceException;

}
