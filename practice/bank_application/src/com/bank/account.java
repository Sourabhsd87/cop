package com.bank;

public class account {
	private int accid;
	private String Name,email,city;
	private double balance;
	private static int count;
	static        //static initializer block
	{
		count=1000;
	}
	public account(String name, String email, String city, double balance) {
		super();
		count++;
		this.accid = count;
		this.Name = name;
		this.email = email;
		this.city = city;
		this.balance = balance;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAccid() {
		return accid;
	}
	public double getBalance(int acc) {
		return this.balance;
	}
	public void display()
	{
		System.out.println("Account no="+this.accid+" Name="+this.Name+" Email="+this.email+" City="+this.city);
	}
	public void deposite(double amt)
	{
		this.balance=this.balance+amt;
		System.out.println("Transfer successfull.");
		System.out.println("current Balance="+this.balance);
	}
	public void withdraw(double amt)
	{
		if(this.balance<amt)
		{
			System.out.println("Insufficient funds.");
		}
		else
		{
			this.balance=this.balance-amt;
			System.out.println("withdrawl successfull.");
			System.out.println("Current balance="+this.balance);
		}
	}
	public void transfer(account acc,double amt)
	{
		if(this.balance>amt)
		{
		this.balance=this.balance-amt;
		acc.balance=acc.balance+amt;
		System.out.println("Transfer successfull");
		}
		else
		{
			System.out.println("Insufficient funds.");
		}
	}
}
