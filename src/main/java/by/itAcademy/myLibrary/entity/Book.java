package by.itAcademy.myLibrary.entity;

import java.io.Serializable;

public class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	String author;
	int year;

	public Book() {
		
	}
	
	public Book(int id, String name, String author, int year) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.year = year;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}



	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}



	public void setAuthor(String author) {
		this.author = author;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", year=" + year + "]";
	}

}
