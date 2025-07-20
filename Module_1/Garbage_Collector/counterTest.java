package Garbage_Collector;

public class counterTest 
{
	public static int count ;
	
	public counterTest() 
	{  
		count++;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		counterTest obj1 = new counterTest();
		System.out.println(counterTest.count);
		
		counterTest obj2 = new counterTest();
		System.out.println(counterTest.count);
		
		counterTest obj3 = new counterTest();
		System.out.println(counterTest.count);
		
		
		Runtime rt = Runtime.getRuntime();
		
		obj1 = null ;
		obj2 = null ;
		obj3 = null ;
		rt.gc();
		
		
	}
	
	@Override
	protected void finalize() 
	{
		counterTest.count -- ;
		System.out.println("Program About terminated ");
		System.out.println(count);
	}

}
