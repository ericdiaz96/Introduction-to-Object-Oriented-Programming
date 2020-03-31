import java.util.Scanner;
public class Counter
{
	//instance variables 
	private int counterVal = 0;

  	//Setting counter to Zero.
	public void resetCounter()
	{
		counterVal = 0;
	}
  	//increase counterVal by one
	public void increaseCounter()
	{
		counterVal = counterVal + 1;
	}
	//Decrease counter by 1 but cannot be below 0
	public void decreaseCounter()
	{
		if (counterVal > 0)
		{
			counterVal = counterVal - 1;
		}
		else
		{
			System.out.println("Counter is zero. A negative counter is not allowed.");
		}
		
	}
	//Return the current counter value
	public int getCounterValue()
	{
		return counterVal;
	}
	//Print to String
	public void tostringCounter()
	{
		System.out.println("Currently the counter reads: " + counterVal);
}





 }