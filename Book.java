package Lab4;

public class Book {
	String title,author,publisher,date;
	
	public Book(String title,String author,String publisher,String date) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.date = date;
	}
	public String getTitle(String title) {
		return title;
	}
	public String getAuthor(String author) {
		return author;
	}
	public String getPubliser(String publisher) {
		return publisher;
	}
	public String getDate(String date) {
		return date;
	}
	
	public String toString(){	
			return "This class represent about the details of Book. \n"
					+ "Which contains the title of book, author of the book, publisher"
					+ "\n and copyright date of the book.";
	}
}
