package Problems;
import java.util.Scanner;

public class FindLargestElement {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value: ");
		a = sc.nextInt();
		
		System.out.println("Enter b value: ");
		b = sc.nextInt();
		
		System.out.println("Enter c value: ");
		c = sc.nextInt();
		
		if(a > b && a > c)
		{
			System.out.println("a is greatest");
		}
		else if(b > a && b > c)
		{
			System.out.println("b is greatest");
		}
		else
			System.out.println(" c is greatest");
	}
}
