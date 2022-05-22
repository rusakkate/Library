package by.itAcademy.myLibrary.dao.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.itAcademy.myLibrary.dao.FindBookDAO;
import by.itAcademy.myLibrary.dao.exception.DAOException;
import by.itAcademy.myLibrary.entity.Book;

public class FileFindBookDAO implements FindBookDAO {
	List <Book> arrayBook = new ArrayList<>();
	FileReadDAO readFile = new FileReadDAO();

	
	public Book find(int id) throws DAOException {
		Book findBook = new Book();
		
		try {
			arrayBook = readFile.readFromFile();
		} catch (IOException e) {
			// log exception
			System.out.println("File don't find");
		}
		
		for (Book book : arrayBook) {
			if ( id == book.getId() ) {
				findBook = book;
				break;
			}
		}
		
		return findBook;
	}

	public List<Book> findByAuthor(String author) throws DAOException  {
		
		try {
			arrayBook = readFile.readFromFile();
		} catch (IOException e) {
			// log exception
			System.out.println("File don't find");
		}
		List <Book> arrayByAuthor = new ArrayList<>();
		int counterLine;
		counterLine = 0;
		for (Book book : arrayBook) {
			if (author.equals(book.getAuthor())) {
				arrayByAuthor.add(counterLine, book);
				counterLine++;
			}
		}
		return arrayByAuthor;
	}
	
	public List<Book> findByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
