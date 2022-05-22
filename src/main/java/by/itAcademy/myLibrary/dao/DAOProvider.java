package by.itAcademy.myLibrary.dao;

import by.itAcademy.myLibrary.dao.impl.FileCRUDBookDAO;
import by.itAcademy.myLibrary.dao.impl.FileFindBookDAO;

public class DAOProvider {
	private static DAOProvider instance;

	private CRUDBookDAO bookDAO = new FileCRUDBookDAO();
	private FindBookDAO findDAO = new FileFindBookDAO();

	public DAOProvider() {

	}

	public CRUDBookDAO getBookDAO() {
		return bookDAO;
	}

	public FindBookDAO getFindDAO() {
		return findDAO;
	}

	public static DAOProvider getInstance() {
		if (instance == null) {
			instance = new DAOProvider();
		}
		return instance;
	}
}
