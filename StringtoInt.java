import java.util.Scanner;
public class StringtoInt {
	
	String a, b;
	void Max()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		a = sc.next();
		System.out.println("Enter 2nd number: ");
		b = sc.next();
		sc.close();
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		if(c>d)
			System.out.println("1st number is greater.");
		else
			System.out.println("2nd number is greater.");
		
	}

	public static void main(String[] args) {
		
		StringtoInt s = new StringtoInt();
		s.Max();

	}

}
