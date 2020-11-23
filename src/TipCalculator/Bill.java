package TipCalculator;

public class Bill {
	
	private double amount;
	private double tipPercent;
	private int splits;
	
	public Bill( double myAmount, double myPercent, int mySplits )
	{
		amount = myAmount;
		tipPercent = myPercent;
		splits = mySplits;
	}
	public Bill()
	{
		amount = 0;
		tipPercent = 0;
		splits = 0;
	}
	public double getAmount()
	{
		return amount;
	}
	public double getTipPercent()
	{
		return tipPercent;
	}
	public int getSplits()
	{
		return splits;
	}
	public void setAmount( double myAmount )
	{
		amount = myAmount;
	}
	public void setTipPercent( double myPercent )
	{
		tipPercent = myPercent;
	}
	public void setSplits( int mySplits )
	{
		splits = mySplits;
	}
	public void calcAmountWithTip()
	{
		amount *= (1.0 + tipPercent);
	}
	public double getAmountSplit()
	{
		return amount / splits;
	}
	public String toString()
	{
		calcAmountWithTip();
		if( splits > 1 )
			return "Total amount with tip: $" + amount + ". Each person pays $" + getAmountSplit();
		else
			return "Total amount with tip: $" + amount;
	}
}
