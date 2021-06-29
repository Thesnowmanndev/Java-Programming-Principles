//Demonstrates the BankAccount and derived classes

import java.text.*;			// to use Decimal Format

public class AccountDriver
{
	public static void main(String[] args)
	{
		double put_in = 500;
		double take_out = 1000;

		DecimalFormat myFormat;
		String money;
		String money_in;
		String money_out;
		boolean completed;

		// to get 2 decimals every time
		myFormat = new DecimalFormat("#.00");

		//to test the Checking Account class
		CheckingAccount myCheckingAccount =
				new CheckingAccount ("Benjamin Franklin", 1000);
		System.out.println ("Account Number "
			+ myCheckingAccount.getAccountNumber() +
			" belonging to " + myCheckingAccount.getOwner());
		money  = myFormat.format(myCheckingAccount.getBalance());
		System.out.println ("Initial balance = $" + money);
		myCheckingAccount.deposit (put_in);
		money_in = myFormat.format(put_in);
		money  = myFormat.format(myCheckingAccount.getBalance());
		System.out.println ("After deposit of $" + money_in
			+ ",  balance = $" + money);
		completed = myCheckingAccount.withdraw(take_out);
		money_out = myFormat.format(take_out);
		money  = myFormat.format(myCheckingAccount.getBalance());
		if (completed)
		{
			System.out.println ("After withdrawal of $" + money_out
					+ ",  balance = $" + money);
		}
		else
		{
			System.out.println ("Insuffient funds to withdraw $"
					+ money_out	+ ",  balance = $" + money);
		}
		System.out.println();

		//to test the savings account class
		SavingsAccount yourAccount =
				new SavingsAccount ("William Shakespeare", 400);
		System.out.println ("Account Number "
				+ yourAccount.getAccountNumber() +
				" belonging to " + yourAccount.getOwner());
		money  = myFormat.format(yourAccount.getBalance());
		System.out.println ("Initial balance = $" + money);
		yourAccount.deposit (put_in);
		money_in = myFormat.format(put_in);
		money  = myFormat.format(yourAccount.getBalance());
		System.out.println ("After deposit of $" + money_in
				+ ",  balance = $" + money);
		completed = yourAccount.withdraw(take_out);
		money_out = myFormat.format(take_out);
		money  = myFormat.format(yourAccount.getBalance());
		if (completed)
		{
			System.out.println ("After withdrawal of $" + money_out
				+ ",  balance = $" + money);
		}
		else
		{
			System.out.println ("Insuffient funds to withdraw $"
				+ money_out	+ ",  balance = $" + money);
		}
		yourAccount.postInterest();
		money  = myFormat.format(yourAccount.getBalance());
		System.out.println ("After monthly interest has been posted,"
				+ "balance = $"	+ money);
		System.out.println();


		// to test the copy constructor of the savings account class
		SavingsAccount secondAccount =
				new SavingsAccount (yourAccount,5);
		System.out.println ("Account Number "
				+ secondAccount.getAccountNumber()+
				" belonging to " + secondAccount.getOwner());
		money  = myFormat.format(secondAccount.getBalance());
		System.out.println ("Initial balance = $" + money);
		secondAccount.deposit (put_in);
		money_in = myFormat.format(put_in);
		money  = myFormat.format(secondAccount.getBalance());
		System.out.println ("After deposit of $" + money_in
				+ ", balance = $" + money);
		secondAccount.withdraw(take_out);
		money_out = myFormat.format(take_out);
		money  = myFormat.format(secondAccount.getBalance());
		if (completed)
		{
			System.out.println ("After withdrawal of $" + money_out
					+ ",  balance = $" + money);
		}
		else
		{
			System.out.println ("Insuffient funds to withdraw $"
					+ money_out	+ ",  balance = $" + money);
		}
		System.out.println();

		//to test to make sure new accounts are numbered correctly
		CheckingAccount yourCheckingAccount =
				new CheckingAccount ("Issac Newton", 5000);
		System.out.println ("Account Number "
				+ yourCheckingAccount.getAccountNumber()
				+ " belonging to "
				+ yourCheckingAccount.getOwner());

	}
}
