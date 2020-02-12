package bankAccount;

public abstract class Account implements IRate  {
	//List Common properties for saving and checking account
		private String Name;
		private String sSN;
		private static int index=10000;
		private double balance;
		protected String Acc_No;
		protected double Rate;
	
		//constructor to set base properties and initialize the account
		public Account(String name,String sSN,double initdeposit)
		{
			this.Name=name;
			this.sSN=sSN;
			balance=initdeposit;
			index++;
			Acc_No=setAccountNumber();
			setRate();
			
		}
		public abstract void setRate();
		
		//set account number
		private String setAccountNumber()
		{
			String last_2_sSN = sSN.substring(sSN.length()-2,sSN.length());
			int uniqueId=index;	
			int randomNum=(int)(Math.random()*Math.pow(10,3));
			return last_2_sSN+uniqueId+randomNum;
			
		}
		public void compound()
		{
			double accuredInterest=balance*(Rate/100);
			balance=balance+accuredInterest;
			System.out.println("Accrued Interest: $"+accuredInterest);
			
		}
		
		//List Common Methods
		
		public void deposit(double amount)
		{
			balance =balance+amount;
			System.out.println("Deposited amount $"+amount);
			printBalance();
		}
		public void withdraw(double amount)
		{
			balance =balance-amount;
			System.out.println("Withdraw amount $"+amount);
			printBalance();
		}
	
		public void transfer(String toWhere,double amount)
		{
			balance =balance-amount;
			System.out.println("Transfering amount $"+amount+" to "+
			toWhere);
			printBalance();
		}
		public void printBalance()
		{
			System.out.println("Current Balance is $"+balance);
		}
		public void showInfo()
		{
			System.out.println("Name: "+Name+"\nAccount Number: "+Acc_No+"\nSocial Security Number: "+sSN+"\nDeposit: $"+balance
					+"\nRate "+Rate+"%");
			compound();			
			deposit(1000);			
			withdraw(1000);			
			transfer("Mortgage",1000);
		}

}
