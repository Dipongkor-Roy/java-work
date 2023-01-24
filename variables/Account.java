class Account
{
	public String acc_no;
	public double balance;
	public static int perDayTransactionLimit;

	static
	{
		perDayTransactionLimit=500;
		System.out.println("I am first static block");
		
	}
	
	static
	{
		System.out.println("I am 2nd static block");
		
	}
	

	Account()
	{
		System.out.println("I am a default constructor");
	}

	Account(String a, double b)
	{
		acc_no=a;
		balance=b;
		System.out.println("I am a parameterized constructor");
	}


	public void show_AccInfo()
	{
		System.out.println("Account no: "+acc_no);
		System.out.println("Balance: " +balance);
		System.out.println("number of transaction: "+perDayTransactionLimit);

	}


}

