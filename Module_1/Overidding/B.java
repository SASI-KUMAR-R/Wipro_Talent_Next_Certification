package Overidding;

public class B extends A
{
	int c ;
	
	public B(int a,int b,int c) 
	{
		super(a,b);
		this.c = c ;
	}
	
	
	void display()
	{
		super.display(); // it will call the SUPER CLASS WITHOUT CREATEING THE OBJECT
		System.out.println("This is C -> " + c);
		return;
	}
	
	

}
