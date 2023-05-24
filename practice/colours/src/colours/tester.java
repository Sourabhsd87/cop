package colours;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		
			Scanner sc =new Scanner(System.in);
			System.out.print("Available colours: ");
			Colors []col=Colors.values();
			for(Colors c:col)
			{
				System.out.print(c+"  ");
			}
			System.out.println("\nEnter the colour:");
			Colors c =Colors.valueOf(sc.next().toLowerCase());
			System.out.println("Selected colour is ="+c);
			
			
	}

}
