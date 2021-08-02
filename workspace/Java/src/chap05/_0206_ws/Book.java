package chap05._0206_ws;

public class Book {
	private String isbn;
	private String title;
	private String publisher;
	private String author;
	private int price;
	private String desc;
	
	public Book(String isbn, String title, String publisher, String author, int price, String desc) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", publisher=" + publisher + ", author=" + author
				+ ", price=" + price + ", desc=" + desc + "]";
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
