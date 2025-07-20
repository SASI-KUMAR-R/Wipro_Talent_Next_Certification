package Inheritance;

public class Dog extends Animal // Dog -> Child || Animal -> Parent 
{
	@Override
	public void makeSound(String sound) 
	{
		super.makeSound(sound); // Super Must Be Used If We OVERRIDDED
	}
	
	@Override
	public void leg(int leg) {
		super.leg(leg);
	}

}
