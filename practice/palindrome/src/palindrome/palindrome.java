package palindrome;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number youwant to check palindrome :-");
		int num = sc.nextInt();
		int n = num;
		int remainder;
		int reverse = 0;
		while(num!=0)
		{
			remainder = num % 10;
			reverse = (reverse*10)+remainder;
			num=num/10;
		}
		if(reverse == n)
		{
			System.out.println("number is palindrome.");
		}
		else 
		{
			System.out.println("Number is not a palindrome.");
		}
	}
}
