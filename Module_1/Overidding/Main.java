
package Overidding;

public class Main {

	public static void main(String[] args) 
	{
		B b = new B(1, 2, 3);
		b.display();
		System.out.println(b instanceof B);
		
//		A parent = new B(0, 0, 0) ; // Parent Will Call Child = P --> C ( VALID )
//		B child = new A(0, 0) ; // Will Get Error Child Never Call Parent = C !-> P (Invalid)
	}

}
