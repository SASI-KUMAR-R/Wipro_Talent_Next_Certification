package Poly_Project_1;

public class Fruit 
{
	String name ;
	String taste ;
	String size ;
	
	public Fruit(String name, String taste, String size) {
		this.name = name;
		this.taste = taste;
		this.size = size;
	}
	
	void eat()
	{
		 System.out.println("The " + this.name + " generally has a " + this.taste + " taste.");
	}
	

}
