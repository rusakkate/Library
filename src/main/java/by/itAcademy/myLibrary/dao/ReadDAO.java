package by.itAcademy.myLibrary.dao;

import java.io.IOException;
import java.util.List;

import by.itAcademy.myLibrary.entity.Book;

public interface ReadDAO {
	public List <Book> readFromFile () throws IOException;

}
