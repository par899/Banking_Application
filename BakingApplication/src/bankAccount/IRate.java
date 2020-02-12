package bankAccount;

public interface IRate {
	//Write method that returns the base Rate
	public default double getBaseRate()
	{
		return 2.5;
	}

}
