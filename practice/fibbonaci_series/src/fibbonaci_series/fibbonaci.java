package fibbonaci_series;

import java.util.Scanner;

public class fibbonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms of you want in fibbonaci series :- ");
		int n = sc.nextInt();
		int first=0,second=1,third;
		for(int i = 1;i<=n;i++)
		{
			System.out.println(first+" " );
			third = first + second;
			first = second;
			second = third;
		}
		
		
	}

}
