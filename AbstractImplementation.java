
public class AbstractImplementation extends Animals{
	
	void eat()
	{
		System.out.println("Extended class eat method.");
	}

	public static void main(String[] args) {
		
		AbstractImplementation a = new AbstractImplementation();
		a.eat();
		a.speak();

	}

}
