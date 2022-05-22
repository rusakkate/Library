package by.itAcademy.myLibrary.dao.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.itAcademy.myLibrary.dao.ReadDAO;
import by.itAcademy.myLibrary.entity.Book;
import home_library.ResourseLocation;

public class FileReadDAO implements ReadDAO {
	ResourseLocation resourseLocation = new ResourseLocation();
	File file = new File(resourseLocation.FILEPATH);

	@Override
	public List<Book> readFromFile() throws IOException {
		List <Book> arrayBooks = new ArrayList<>();
		Book book = new Book();
		StringBuffer sb = new StringBuffer ();
		int counterLine;
		counterLine = 0;
		int counter;
		counter = 0;
		
		try (FileReader fr = new FileReader (file)) {
			
			while (fr.ready()) {
				
				char c = (char)fr.read();
				
				if (c == '_' & counter == 0) {
					book.setId(Integer.parseInt(sb.toString()));
					sb = new StringBuffer ();
					for (int i = 0; i < 2; i++) {
						c = (char)fr.read();
						sb.append(c);
					}
					sb.delete(0, 2);
					sb = new StringBuffer ();
					counter++;	
				} else if (c == '_' & counter == 1) {
					book.setAuthor(sb.toString());
					sb = new StringBuffer ();
					for (int i = 0; i < 2; i++) {
						c = (char)fr.read();
						sb.append(c);
					}
					sb.delete(0, 2);
					sb = new StringBuffer ();
					counter++;	
				} else if (c == '_' & counter == 2) {
					book.setName(sb.toString());
					sb = new StringBuffer ();
					for (int i = 0; i < 2; i++) {
						c = (char)fr.read();
						sb.append(c);
					}
					sb.delete(0, 2);
					sb = new StringBuffer ();
					counter++;	
				} else if (c == '\n') {
					book.setYear(Integer.parseInt(sb.toString()));
					arrayBooks.add(counterLine, book);
					book = new Book();
					counterLine++;
					sb = new StringBuffer ();
					counter = 0;
				} else {
					sb.append(c);
				}
				
			}
		} catch (FileNotFoundException e) {
			// log exception
			System.out.println("File don't find");
		}
		
		return arrayBooks;
	}

}
