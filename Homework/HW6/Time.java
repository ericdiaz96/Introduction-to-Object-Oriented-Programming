// Consider a class Time that represents a time of day.It has attributes for the hour and
import java.util.Scanner;
public class Time
{
private int hour, minute;
private String am_pm;


//Default Constructor
public Time()
{
hour = 0;
minute = 0;
}
private boolean isValid(int hour, int minute)
{
	if ((hour>=0 && hour <=23) 
	&& (minute >=0 && minute <=59))
{
return true;
}
return false;
}
public void setTime(int hour, int minute)
{
if(isValid(hour, minute))
{
this.hour = hour;
this.minute = minute;
}
}
public void setTime (int hour, int minute, boolean isAM)
{
if(isValid(hour, minute))
{
if (hour >=1 && hour <=12)
{
	if(isAM)
		am_pm = "a.m.";
	else
		am_pm = "p.m.";
}
setTime(hour,minute);
}
}
}