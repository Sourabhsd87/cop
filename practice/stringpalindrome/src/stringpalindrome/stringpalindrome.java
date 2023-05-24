package stringpalindrome;

import java.util.Scanner;

public class stringpalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		char s=0;
		String str = new String(sc.next());
		String rev = new String();
		System.out.println(str.length());
		
		for(int i=str.length()-1;i>=0;i--)
		{
			s=str.charAt(i);
			rev=rev+s;
		}
		
		System.out.println(rev);
		
		if(str.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else 
		{
			System.out.println("String is not palindrome");
		}
	}

}
