public class Time3
{
	//Variables
	private int hour,minute;
	//This default constructor initializes the hour as 0 by calling setTime(int,int) method with default values
	public Time3()
	{
		hour = 0;
		minute = 0;
	}
	public Time3 (int hour, int minute)
	{
	setTime(hour, minute);
	}
	//isAM method
	public Time3(int hour, int minute, boolean isAm)
	{
	setTime(hour, minute, isAm);
	}
	public Time3(int hour)
	{
	if ((hour <= 24) && (hour >= 0))
		hour = hour;
	else
		System.out.println("Error, try again.");
	}
	public Time3(short minute)
	{
	if ((minute >= 0) && (minute <= 59))
		minute = minute;
	else
		System.out.println("Error try again.");
	}
	//call isValid method
	private boolean isValid(int hour, int minute)
	{
		return (((hour >= 0) && (hour <= 23)) && ((minute >= 0) && (minute <= 59)));
	}
	//setTime method
	public void setTime(int hour, int minute)
	{
		if (isValid(hour,minute))
		{
			hour = hour;
			minute = minute;
		}
		else
			System.out.println("Error try again.");
	}
	//setTime method
	public void setTime(int hour, int minute, boolean isAm)
	{
		if ((hour >= 1) && (hour <= 12))
		{
			if (isAm && hour == 12)
				hour = 0;
		}
		else if (hour < 12 && !isAm)
			hour = hour + 12;
		
		if (isValid(hour,minute))
		{
			hour = hour;
			minute = minute;
		}
	}
	//getTime24 method
	public String getTime24()
	{
		String output = "";
		if (hour < 10)
			output = "0" + hour;
		else 
			output = "" + hour;
		
		if (minute < 10)
			output = output + "0" + minute;
		else
			output = output + minute;
		
		return output;
	}
	//getTime12 method
	public String getTime12()
	{
        String output = "";
        
        if(hour == 0)
            output = "12";
        else if(hour > 12)
            output = output + (hour-12);
        else
            output = output + hour;
		output = output + ":";
        if(minute < 10)
            output = output + "0" + minute;
        else
            output = output + minute;
        if(hour>=0 && hour<11)
            output = output + "a.m.";
        else
            output = output + "PM";
        
        return output;
    }
    //toString
	public String toString(){
        return "Time: " + hour + ":" + minute;
    }
    
}
