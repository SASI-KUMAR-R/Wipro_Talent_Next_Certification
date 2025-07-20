package Inheritance;

public class Animal {
	
    private String name; // Input Will Be PASSED

    public void setName(String name) // SETTER
    {
        this.name = name;
    }

    public String getName() // GETTER
    {
        return this.name;
    }

    public void eat() 
    {
        System.out.println(name + " is eating.");
    }

    public void makeSound(String sound) 
    {
        System.out.println("The animal makes a sound -> " + sound);
    }
    
    public void leg(int leg) // Value will be passed from the child object class
    {
    	System.out.println("The "+name+" Have "+leg+" Legs");
    }
}