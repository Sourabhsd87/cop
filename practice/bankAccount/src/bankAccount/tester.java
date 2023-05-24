package bankAccount;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Account type : ");
		for(accountType acc:accountType.values())
		{
			System.out.println(acc+"  ");
		}
		System.out.println("Enter date of creation : ");
		Date dac = new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println("Enter actid,name,email,balance,acc type");
		
		Bankaccount BOI = new Bankaccount(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), accountType.valueOf(sc.next().toLowerCase()),dac);
		System.out.println(BOI);
	}

}
