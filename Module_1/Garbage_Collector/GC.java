package Garbage_Collector;

public class GC 
{
	public static void main(String[] args) 
	{
//		GC gc = new GC();
//		gc = null ;
		
		Runtime rt = Runtime.getRuntime();
		
		
		System.out.println(rt);
		System.out.println(rt.freeMemory());
		rt.gc();
		System.out.println(rt.freeMemory());
		rt.gc();
		System.out.println(rt.freeMemory());
		
	}
	
}
