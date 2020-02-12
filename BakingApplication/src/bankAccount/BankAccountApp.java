package bankAccount;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<Account> accounts =new LinkedList<Account>();
		
		//Read a CSV file and then create account based on that data
		String file ="D:\\Java\\NewBankAccounts.csv";
		List<String[]> newAccountHolders = new Utilities.CSV().read(file);
		for(String[] AccountHolders : newAccountHolders )
		{
			String name=AccountHolders[0];
			String sSN=AccountHolders[1];
			String accountType=AccountHolders[2];
			double initDeposit=Double.parseDouble(AccountHolders[3]);
			//System.out.println(name+" "+sSN+" "+accountType+" $"+initDeposit);
			if(accountType.equals("Savings"))
			{
				
				accounts.add(new Saving(name,sSN,initDeposit));
			}
			else if(accountType.equals("Checking"))
			{
				
				accounts.add(new Checking(name,sSN,initDeposit));
			}
			else
			{
				System.out.println("Error reading account type");	
			}
		}
		for(Account acc : accounts)
		{
			System.out.println("*********************************");
			acc.showInfo();
		}
			
	}

}
