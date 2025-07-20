package Overidding;

public class A 
{
	int a ;
	int b ;
	public A(int a,int b) 
	{
		this.a = a ;
		this.b = b ;
		
	}
	
	void display()
	{
		System.out.println("This is Value of A & B -> " + a + " & " + b);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
