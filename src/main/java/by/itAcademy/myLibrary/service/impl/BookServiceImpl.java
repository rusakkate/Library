package by.itAcademy.myLibrary.service.impl;


import java.util.ArrayList;
import java.util.List;
import by.itAcademy.myLibrary.dao.CRUDBookDAO;
import by.itAcademy.myLibrary.dao.DAOProvider;
import by.itAcademy.myLibrary.dao.FindBookDAO;
import by.itAcademy.myLibrary.dao.exception.DAOException;
import by.itAcademy.myLibrary.entity.Book;
import by.itAcademy.myLibrary.service.BookService;
import by.itAcademy.myLibrary.service.exception.ServiceException;

public class BookServiceImpl implements BookService {
	DAOProvider provider = DAOProvider.getInstance();
	CRUDBookDAO dao = provider.getBookDAO();
	FindBookDAO fileDao = provider.getFindDAO();
	
	@Override
	public void save(Book book) throws ServiceException {
		// data validation
		try {
			dao.save(book);
		} catch (DAOException e) {
			// log exception
			throw new ServiceException();
		}
	}

	@Override
	public Book findById(int id) throws ServiceException {
		Book findBook = new Book();
		try {
			findBook = fileDao.find(id);
		}  catch (DAOException e) {
			// log exception
			throw new ServiceException();
		} 
		return findBook;
	}

	@Override
	public List<Book> findByAuthor(String author) throws ServiceException {
		List<Book> arrayByAuthor = new ArrayList<>();
		try {
			arrayByAuthor = fileDao.findByAuthor(author);
		} catch (DAOException e) {
			// log exception
			throw new ServiceException();
		}
		return arrayByAuthor;
	}

	@Override
	public void delete(int id) throws ServiceException {
		try {
			dao.delete(id);
		} catch (DAOException e) {
			// log exception
			throw new ServiceException();
		}
	}

}
