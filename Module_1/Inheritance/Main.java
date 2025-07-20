package Inheritance;

public class Main{

	public static void main(String[] args) 
	{
		Dog dog = new Dog();
		
		dog.setName("MONKEY"); // setting name if Not Set means -> NULL will return ...
		
		System.out.println(dog.getName());
		
		dog.eat();
		dog.leg(4);
		dog.makeSound("Bark");
	}

}
