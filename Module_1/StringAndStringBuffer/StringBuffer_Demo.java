package StringAndStringBuffer;

public class StringBuffer_Demo {

	public static void main(String[] args) 
	{
		StringBuffer string = new StringBuffer("JavaDeveloper");
		System.out.println(string);
		System.out.println(string.reverse().toString());
		
		System.out.println(string.capacity());
		
		string.setCharAt(4, 'j');
		
		System.out.println(string.reverse());
		System.out.println(string);

	}

}
