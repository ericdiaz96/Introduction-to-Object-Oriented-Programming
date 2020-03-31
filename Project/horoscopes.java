public class horoscopes
{
 public static String horoscope;
 
public static String getHoro(int newDay, int newMonth)
 {

if((newMonth == 12 && newDay >= 22 && newDay <= 31) || (newMonth ==  1 && newDay >= 1 && newDay <= 19))
             horoscope = "Capricorn";

  if((newMonth ==  1 && newDay >= 20 && newDay <= 31) || (newMonth ==  2 && newDay >= 1 && newDay <= 17))
         	 horoscope = "Aquarius";

    	 if((newMonth ==  2 && newDay >= 18 && newDay <= 29) || (newMonth ==  3 && newDay >= 1 && newDay <= 19))
    	 	 horoscope = "Pisces";

    	 if((newMonth ==  3 && newDay >= 20 && newDay <= 31) || (newMonth ==  4 && newDay >= 1 && newDay <= 19))
   	   	 horoscope = "Aries";

    	 if((newMonth ==  4 && newDay >= 20 && newDay <= 30) || (newMonth ==  5 && newDay >= 1 && newDay <= 20))
   	   	 horoscope = "Taurus";

    	 if((newMonth ==  5 && newDay >= 21 && newDay <= 31) || (newMonth ==  6 && newDay >= 1 && newDay <= 20))
        	  horoscope = "Gemini";

    	 if((newMonth ==  6 && newDay >= 21 && newDay <= 30) || (newMonth ==  7 && newDay >= 1 && newDay <= 22))
        	  horoscope = "Cancer";

    	 if((newMonth ==  7 && newDay >= 23 && newDay <= 31) || (newMonth ==  8 && newDay >= 1 && newDay <= 22))
       	  horoscope = "Leo";

    	 if((newMonth ==  8 && newDay >= 23 && newDay <= 31) || (newMonth ==  9 && newDay >= 1 && newDay <= 22))
        	  horoscope = "Virgo";

    	 if((newMonth ==  9 && newDay >= 23 && newDay <= 30) || (newMonth == 10 && newDay >= 1 && newDay <= 22))
        	  horoscope = "Libra";

    	 if((newMonth == 10 && newDay >= 23 && newDay <= 31) || (newMonth == 11 && newDay >= 1 && newDay <= 21))
        	  horoscope = "Scorpio";

    	 if((newMonth == 11 && newDay >= 22 && newDay <= 30) || (newMonth == 12 && newDay >= 1 && newDay <= 21))
        	  horoscope = "Sagittarius";
   	  System.out.println(horoscope);

  return horoscope;
 }
}
