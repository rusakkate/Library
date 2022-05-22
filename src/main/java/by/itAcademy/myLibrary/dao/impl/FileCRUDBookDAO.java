package by.itAcademy.myLibrary.dao.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import by.itAcademy.myLibrary.dao.CRUDBookDAO;
import by.itAcademy.myLibrary.dao.exception.DAOException;
import by.itAcademy.myLibrary.entity.Book;
import home_library.ResourseLocation;

public class FileCRUDBookDAO implements CRUDBookDAO {
	ResourseLocation resourseLocation = new ResourseLocation();
	File file = new File(resourseLocation.FILEPATH);
	  
	public void save(Book book) throws DAOException {
		try (FileWriter fw = new FileWriter (file, true); BufferedWriter bufferWriter = new BufferedWriter(fw);) {
			StringBuilder sb = new StringBuilder();
			sb.append(book.getId()).append("_ _").append(book.getAuthor()).append("_ _").append(book.getName()).append("_ _").append(book.getYear()).append("\n");
	        bufferWriter.write(sb.toString());
		} catch (IOException e) {
			// log exception
			System.out.println("File don't find");
		} 
		
	}
	
	public void delete(int id) throws DAOException  {
		List <Book> arrayBook = new ArrayList<>();
		FileReadDAO readFile = new FileReadDAO();
		try {
			arrayBook = readFile.readFromFile();
		} catch (IOException e) {
			// log exception
			System.out.println("File don't find");
		}
		
		int numberLine;
		numberLine = 0;
		
		for (Book book : arrayBook) {
			if (id != book.getId()) {
				numberLine++;
			} else {
				break;
			}
		}
		arrayBook.remove(numberLine);
		
		try (FileWriter fw = new FileWriter (file); BufferedWriter bufferWriter = new BufferedWriter(fw);) {
			for (Book book : arrayBook) {
				StringBuilder sb = new StringBuilder();
				sb.append(book.getId()).append("_ _").append(book.getAuthor()).append("_ _").append(book.getName()).append("_ _").append(book.getYear()).append("\n");
		        bufferWriter.write(sb.toString());
			}	
		} catch (IOException e) {
			// log exception
			System.out.println("File don't find");
		} 
		
		
	}

	@Override
	public void update(int id, Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStatus(int id, int newStatus) {
		// TODO Auto-generated method stub
		
	}

}
