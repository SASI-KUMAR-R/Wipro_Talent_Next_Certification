package Encapsulation;

public class Book
{
	private String bookName ;
	private Author author ; 
	private int price ; 
	private int qutInStock ;
	
	public Book(String bookName, Author author, int price, int qutInStock) {
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.qutInStock = qutInStock;
	}
	
	public String getbookName() {
		return bookName ;
	}
	
	public Author getAuthor()
	{
		return author ;
	}
	
	public int getPrice()
	{
		return price ;
	}
	
	public int InStock() {
		return qutInStock ;
	}
	
	public String toString() {
        // We can call the author's toString() method directly here
        return "Book[name=" + bookName + ", " + author.toString() + ", price=" + price + ", qtyInStock=" + qutInStock + "]";
    }
	
	
	

}
