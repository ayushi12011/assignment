package Module1;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the year : ");
		int year = sc.nextInt();
		
		boolean x = (year % 4) == 0;
		boolean y = (year % 100)!= 0;
		boolean z = ((year % 100 == 0) && (year % 400 == 0));
	
		if (x && (y || z)) {
			System.out.println(year + "is a leap year");
		}
		else
		{
			System.out.println(year + "is not a leap year");
		}
		int i;
		System.out.println(" \n The first 10 natural numbers are : ");
		
		for (i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("\n");
	}
}
