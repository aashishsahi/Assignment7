
public class Dog implements Animal{
	
	public void speak()
	{
		System.out.println("Dog speak method.");
	}
	public void eat()
	{
		System.out.println("Dog eat method.");
	}

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.speak();
		d.eat();

	}

}
