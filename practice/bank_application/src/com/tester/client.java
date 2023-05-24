package com.tester;

import java.util.Scanner;

import com.bank.account;

public class client {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		account[] bank=new account[10];
		System.out.println("1.Create account.");
		System.out.println("2.Display all accounts");
		System.out.println("3.deposite money.");
		System.out.println("4.Withdraw money.");
		System.out.println("5.Check balance.");
		System.out.println("6.Update email.");
		System.out.println("7.Update city.");
		System.out.println("8.Show all customers name.");
		System.out.println("9.Show all customers email.");
		System.out.println("10.Bank transfer.");
		System.out.println("11.Exit");
		int choice=0;
		int index=0;
		boolean flag=false;
		boolean flag1=false;

		do {
			System.out.println("Enter your choice:-");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				if(index<bank.length)
				{
					System.out.println("Enter Name, Email, City, Balance");
					bank[index]=new account(sc.next(), sc.next(), sc.next(), sc.nextDouble());
					index++;
				}
				else
				{
					System.out.println("Array full");
				}
				break;
			case 2:
					for(int i=0;i<index;i++)
					{
						bank[i].display();
					}
				
				break;
			case 3:
				System.out.println("Enter the account number:");
				int acc=sc.nextInt();
				for(int i=0;i<index;i++)
				{
					if(bank[i].getAccid()==acc)
					{
						System.out.println("Enter the amount you want to add:");
						double amt = sc.nextDouble();
						bank[i].deposite(amt);
						flag=true;
						break;
					}
					else
					{
						flag=false;
					}
				}
				if(flag==false)
				{
					System.out.println("Account does not exist.");
				}
				flag=false;
				break;
			case 4:
				System.out.println("Enter account number:");
				acc=sc.nextInt();
				for(int i=0;i<index;i++)
				{
					if(acc==bank[i].getAccid())
					{
						System.out.println("Enter amount to withdraw:");
						double amt=sc.nextDouble();
						bank[i].withdraw(amt);
						flag=true;
						break;
					}
					else
					{
						flag=false;
					}
				}
				if(flag==false)
				{
					System.out.println("Account does not exist");
				}
				flag=false;
				break;
			case 5:
				System.out.println("Enter your account number :");
				acc=sc.nextInt();
				for(int i=0;i<index;i++)
				{
					if(acc==bank[i].getAccid())
					{
						System.out.println(bank[i].getBalance(acc));
						flag=true;
						break;
					}
					else 
					{
						flag=false;
					}
				
				}
				if(flag==false)
				{
					System.out.println("Account does not exist.");
				}
				break;
			case 6:
				System.out.println("Enter account number:");
				acc=sc.nextInt();
				for(int i=0;i<index;i++)
				{
					if(acc==bank[i].getAccid())
					{
						System.out.println("Enter your email:");
						bank[i].setEmail(sc.next());
						System.out.println("Email updated.");
						flag=true;
						break;
					}
					else
					{
						flag=false;
					}
				}
				if(flag==false)
				{
					System.out.println("Account does not exist.");
				}
				break;
			case 7:
				System.out.println("Enter account number:");
				acc=sc.nextInt();
				for(int i=0;i<index;i++)
				{
					if(acc==bank[i].getAccid())
					{
						System.out.println("Enter your city:");
						bank[i].setCity(sc.next());
						System.out.println("City updated.");
						flag=true;
						break;
					}
					else
					{
						flag=false;
					}
				}
				if(flag==false)
				{
					System.out.println("Account does not exist.");
				}
				break;
			case 8:
				for(int i=0;i<index;i++)
				{
					System.out.println(bank[i].getName());
				}
				break;
			case 9:
				for(int i=0;i<index;i++)
				{
					System.out.println(bank[i].getEmail());
				}
				break;
			case 10:
				System.out.println("Enter your account number:");
				acc=sc.nextInt();
				for(int i=0;i<index;i++)
				{
					if(acc==bank[i].getAccid())
					{
						System.out.println("Enter recievers account number:");
						int accr=sc.nextInt();
						for(int j=0;j<index;j++)
						{
							if(accr==bank[j].getAccid())
							{
								System.out.println("Enter amount you want to transfer:");
								double amt=sc.nextDouble();
								bank[i].transfer(bank[j],amt);
								flag1=true;
								break;
							}
							else
							{
								flag1=false;
							}
						}
						if(flag1==false)
						{
							System.out.println("Reciever account does not exist");
						}
						flag=true;
						break;
					}
					else
					{
						flag=false;
					}
				}
				if(flag==false)
				{
					System.out.println("Account does not exist.");
				}
				break;
			default:
				System.out.println("invalid choice");
			}
		}while(choice<11);



		
	}

}
