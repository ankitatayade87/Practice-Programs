package Problems;

import java.util.Scanner;

public class CheckIsPrimeNo {
	
	static boolean isPrimeNo(int Num)
	{
		boolean flag = false;
		
		for(int i = 2; i < Num/2; i++)
		{
			if(Num % i == 0)
			{
				flag = true;
			}
		}
		
		return flag;		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No.");
		
		int Num = sc.nextInt();
		
		if(!isPrimeNo(Num))
		{
			System.out.println("Input no. is Prime no.");
		}
		else
		{
			System.out.println("Input no. is not Prime no.");
		}
		
	}
}
