package bankAccount;

public class Saving extends Account {
	//List properties to specific to a checking account 
	private int safetydepositboxid;
	private	int safetydepositboxkey;
		//Constructor to initialize checking account properties
			public Saving(String Name,String sSN,double initdeposit)
			{
				super(Name,sSN,initdeposit);
				Acc_No="1"+Acc_No;
				setSafetyDepositBox();
				
			}
			@Override
			public  void setRate()
			{
				
				Rate=getBaseRate() -.25;
			}
		//List any methods specific to the checking account 
			private void setSafetyDepositBox()
			{
				safetydepositboxid=(int)(Math.random()* Math.pow(10,3));
				safetydepositboxkey=(int)(Math.random()* Math.pow(10,4));
			}
			public void showInfo()
			{
				System.out.println("\nAccount Type Saving:\n");
				super.showInfo();
				System.out.println("Your Saving Account Features:"+"\nSafetyDepositboxId  "+safetydepositboxid
						+"\nSafetyDepositboxkey  "+safetydepositboxkey);
				
			}

}
