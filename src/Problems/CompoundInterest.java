package Problems;

import java.util.Scanner;

public class CompoundInterest {
	
	public static void main(String[] args) {
		
		/*
		 * CI = P*(1 + (R/100))^n  - P
		 */
		
		double CI, P, R, n, compound;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principal amount");
		P = sc.nextDouble();
		
		System.out.println("Enter Rate");
		R = sc.nextDouble();
		
		System.out.println("Enter N years");
		n = sc.nextDouble();
		
		
		compound =  P * Math.pow((1 + (R / 100)), n);
		
		CI = compound - P;
		
		System.out.println("Compount Interest is "+ CI);
		
	}
}
