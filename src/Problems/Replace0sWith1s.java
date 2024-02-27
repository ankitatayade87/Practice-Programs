package Problems;

import java.util.Scanner;

public class Replace0sWith1s {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No.");
		
		int Num = sc.nextInt();
		
		int n = Num, ans  = 0, i = 0;
		
		while(n != 0)
		{
			if(n % 10 == 0)
			{
				ans = (int) (ans + (Math.pow(10, i) * ((n % 10) + 1)));
			}
			else
			{
				ans  = (int) (ans + (Math.pow(10, i) * (n % 10)));
			}
			
			n = n / 10;
			i++;
		}
		
		System.out.println("Number after replacement is "+ans);
	}
	

}
