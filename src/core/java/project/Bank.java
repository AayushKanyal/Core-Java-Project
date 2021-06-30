/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.java.project;

import java.util.Scanner;
class Bank
{
	int n,dep,wit,bal=5000;
	long acc_no;
	Scanner s;

	public Bank(Scanner s)
	{
		this.s=s;

		this.login();
	}

	private void login()
	{
		System.out.println("Enter Account Number");
		acc_no=s.nextInt();

		this.verify();
	}

	public void verify()
	{
		if(acc_no==123456)
		{
			this.printMenu();
		}
		else
		{
			System.out.println("Invalid Account Number");
			this.login();
		}
	}

	public void printMenu()
	{
		System.out.println("1...Deposit");
		System.out.println("2.... Withdraw");
		System.out.println("3...Logout");

		System.out.println("Enter operation you want to perform");
		n=s.nextInt();

		switch(n)
		{
			case 1:
				try
				{
					this.deposit();
				}
				catch(GreaterThanZeroException g)
				{
					System.out.println("Error:"+g.getMessage());
				}
				this.printMenu();

			case 2:
				try
				{
					this.withdraw();
				}
				catch(LessThanBalanceException l)
				{
					System.out.println("Error:"+l.getMessage());
				}
				this.printMenu();
	
			case 3:
				this.login();
			
			default:
				System.out.println("Invalid Operation");
				System.exit(0);
		}

			
	}
	public void deposit() throws GreaterThanZeroException
	{
		System.out.println("Enter the amount to be deposited");
		dep=s.nextInt();

		if(dep<=0)
		{
			throw new GreaterThanZeroException();
		}
		else
		{
			bal=bal+dep;
			System.out.println("Balance="+bal);	
		}	
	}

	public void withdraw() throws LessThanBalanceException
	{
		System.out.println("Enter the amount to be withdraw");
		wit=s.nextInt();

		if(wit>bal)
		{
			throw new  LessThanBalanceException();
		}
		else
		{
			bal=bal-wit;
			System.out.println("Balance="+bal);	
		}	
	}
}

