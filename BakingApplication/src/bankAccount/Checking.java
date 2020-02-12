package bankAccount;

public class Checking extends Account {
	//List properties to specific to a checking account 
	private int Debitcardno;
	private int DebitCardpin;
	//Constructor to initialize checking account properties
	public Checking(String Name,String sSN,double initdeposit)
	{
		super(Name,sSN,initdeposit);
		Acc_No="2"+Acc_No;
		SetDebitcard();
		
	}
	@Override
	public void setRate()
	{
		
		Rate=getBaseRate() *.15;
		
	}
	//List any methods specific to the checking account
	private void SetDebitcard()
	{
		Debitcardno=(int)(Math.random()* Math.pow(10,12));
		 DebitCardpin=(int)(Math.random()* Math.pow(10,4));
	}
	public void showInfo()
	{
		System.out.println("Account Type Checking:\n");
		super.showInfo();
		System.out.println("Your Checking Account Features:"+"\nDebitcardno  "+Debitcardno
				+"\nDebitCardpin "+DebitCardpin);
		
	}
	
}
