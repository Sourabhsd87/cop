package compoundinterest;

import java.util.Scanner;

public class compound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount in rupees :-");
		float amount = sc.nextFloat();
		System.out.println("Enter time period in years :-");
		float time = sc.nextFloat();
		System.out.println("Enter interest rate :-");
		float rate = sc.nextFloat();
		float interest = (float) (amount*(Math.pow((1+(rate/100)),time)));
		System.out.println(interest);
	}

}
