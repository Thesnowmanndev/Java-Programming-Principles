/**Defines any type of bank account*/
public abstract class BankAccount
{
	/**class variable so that each account has a unique number*/
	protected static int numberOfAccounts = 100001;

	/**current balance in the account*/
	private double balance;
	/** name on the account*/
	private String owner;
	/** number bank uses to identify account*/
	private String accountNumber;

	/**default constructor*/
	public BankAccount()
	{
		balance = 0;
		accountNumber = numberOfAccounts + "";
		numberOfAccounts++;
	}

	/**standard constructor
	@param name the owner of the account
	@param amount the beginning balance*/
	public BankAccount(String name, double amount)
	{
		owner = name;
		balance = amount;
		accountNumber = numberOfAccounts + "";
		numberOfAccounts++;
	}

	/**copy constructor creates another account for the same owner
	@param oldAccount the account with information to copy
	@param the beginning balance of the new account*/
	public BankAccount(BankAccount oldAccount, double amount)
	{
		owner = oldAccount.owner;
		balance = amount;
		accountNumber = oldAccount.accountNumber;
	}

	/**allows you to add money to the account
	@param amount the amount to deposit in the account*/
	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	/**allows you to remove money from the account if
	enough money is available,returns true if the transaction was
	completed, returns false if the there was not enough money.
	@param amount  the amount to withdraw from the account
	@return true if there was sufficient funds to complete
	the transaction, false otherwise*/
	public boolean withdraw(double amount)
	{
		boolean completed = true;

		if (amount <= balance)
		{
			balance = balance - amount;
		}
		else
		{
			completed = false;
		}
		return completed;
	}

	/**accessor method to balance
	@return the balance of the account*/
	public double getBalance()
	{
		return balance;
	}

	/**accessor method to owner
	@return the owner of the account*/
	public String getOwner()
	{
		return owner;
	}

	/**accessor method to account number
	@return the account number*/
	public String getAccountNumber()
	{
		return accountNumber;
	}

	/**mutator method to change the balance
	@param newBalance the new balance for the account*/
	public void setBalance(double newBalance)
	{
		balance = newBalance;
	}

	/**mutator method to change the account number
	@param newAccountNumber the new account number*/
	public void setAccountNumber(String newAccountNumber)
	{
		accountNumber = newAccountNumber;
	}
}