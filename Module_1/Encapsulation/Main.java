package Encapsulation;

public class Main {

	public static void main(String[] args) 
	{
		Author author = new Author("SASIKUMAR", "rsasikumar670@gmail.com", 'M') ;
		Book book = new Book("SCIENCE", author, 1247, 5) ;
		
        System.out.println("Book Name: " + book.getbookName());
        System.out.println("Author Name: " + book.getAuthor().getName());
        System.out.println("Author Email: " + book.getAuthor().getEmail());
        System.out.println("Author Gender: " + book.getAuthor().getGender());
        System.out.println("Book Price: $" + book.getPrice());
        System.out.println("Quantity in Stock: " + book.InStock()); 


	}

}
