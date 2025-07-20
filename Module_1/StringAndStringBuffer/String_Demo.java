package StringAndStringBuffer;

public class String_Demo {

	public static void main(String[] args) 
	{
		// first 
		char data[] = {'a','b','c'};
		String str = new String(data);
		System.out.println(str);
		
		//second
		String str1 = "Abc";
		if (str == str1) // CHECK THE REFERENCE NOT THE STRING
		{
			System.out.println("==" + " Equals");
		}
		else 
		{
			System.out.println("==" + " Not Equals");
		}
		
		//third
		if(str.equals(str1)) // Check the String Value
		{
			System.out.println("equals by equals");
		}
		else 
		{
			System.out.println("Not equals by equals");
		}
		
		//fourth
		
		if(str.equalsIgnoreCase(str1)) // Check the String Value without the case like upper or lower
		{
			System.out.println("equals by equals case");
		}
		else 
		{
			System.out.println("Not equals by equals case");
		}
		
		// startsWith and endsWith
		
		String s1 = "Sasikumar" ;
		String s2 = "JavaDeveloper";
		System.out.println(s1.startsWith("Sasi"));
		System.out.println(s2.endsWith("er"));

	}

}
