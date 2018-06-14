
public class Cat implements Animal{
	
	public void speak()
	{
		System.out.println("Cat speak method.");
	}
	public void eat()
	{
		System.out.println("Cat eat method.");
	}

	public static void main(String[] args) {
		
		
		Cat c = new Cat();
		c.speak();
		c.eat();

	}

}
