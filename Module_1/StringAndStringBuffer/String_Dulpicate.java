package StringAndStringBuffer;

public class String_Dulpicate {

	public static void main(String[] args)
	{
		String string = "Wipro";
		StringBuffer stringBuffer = new StringBuffer(string);
		String str = stringBuffer.substring(0, 2); 

//		StringBuilder repeatedString = new StringBuilder();
//		for (int i = 0; i < 5; i++) {
//			repeatedString.append(str);
//		}
//		System.out.println(repeatedString.toString()); // Output: WiWiWiWiWi
		
		System.out.println(str.repeat(5)); // Output: WiWiWiWiWi
	}
}