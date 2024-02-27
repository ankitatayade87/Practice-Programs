package Problems;

import java.util.Scanner;

public class FibbonacciSeries {
	
	static void iterationMethod(int k)
	{
		int n1, n2, n3;
		
		n1 = 0;
		n2 = 1;
		n3 = 0;
		System.out.print(n1 +", ");
		System.out.print(n2 +", ");
		
		for(int i = 2; i < k; i++)
		{
			n3 = n1 + n2;
			System.out.print(n3+ ", ");
			n1 = n2;
			n2 = n3;		
		}
	}
	
	static int fibbonacci(int n)
	{
		if(n == 0 || n == 1)
		{
			return n;
		}
		else
			return fibbonacci(n - 1) + fibbonacci(n - 2);
			
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No.");
		
		int k = sc.nextInt();
		
		//iterationMethod(k);
		
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1 +", ");
		System.out.print(n2 +", ");
		
		for(int i = 2; i < k; i++)
		{
			System.out.print(fibbonacci(i)+ ", ");
		}
		
	}
}
