class Start
{
	public static void main(String [] args)
	{
	  Account a1= new Account("1111", 200.0);
	  a1. show_AccInfo();
	  a1.acc_no= "1115"; 
	  a1. show_AccInfo();
		

	  Account a2= new Account("1112", 200.0);
	  a2. show_AccInfo();
	  a2.acc_no= "1113"; 
          a2.perDayTransactionLimit=8;
	  a2. show_AccInfo();

	  a1. show_AccInfo();
	  Account.perDayTransactionLimit=12;

	  a1. show_AccInfo();

	  a2. show_AccInfo();

		
	  Account a3=a2;
	  a3.show_AccInfo();

	  a2.balance=300.0;

	  a2. show_AccInfo();

	  a3. show_AccInfo();
	  a3. balance=500.0;
	  a2. show_AccInfo();



	

	  






	}



}