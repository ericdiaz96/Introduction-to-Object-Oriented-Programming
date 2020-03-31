public class compatibility
{
 private String[][] compatible = new String[12][6];
 public compatibility()
 {
    	 compatible[0][0] = "Aries";
    	 compatible[0][1] = "Leo";
    	 compatible[0][2] = "Sagittarius";
    	 compatible[0][3] = "Gemini";
    	 compatible[0][4] = "Libra";
    	 compatible[0][5] = "Aquarius";
    	
    	 compatible[1][0] = "Aries";
    	 compatible[1][1] = "Leo";
    	 compatible[1][2] = "Sagittarius";
    	 compatible[1][3] = "Gemini";
    	 compatible[1][4] = "Libra";
    	
    	 compatible[2][0] = "Aries";
   	 compatible[2][1] = "Leo";
    	 compatible[2][2] = "Sagittarius";
    	 compatible[2][3] = "Gemini";
    	 compatible[2][4] = "Libra";
    	 compatible[2][5] = "Aquarius";
    	 compatible[3][0] = "Taurus";
    	 compatible[3][1] = "Virgo";
    	 compatible[3][2] = "Capricorn";
    	 compatible[3][3] = "Cancer";
    	 compatible[3][4] = "Scorpio";
    	 compatible[3][5] = "Pisces";
	
    	 compatible[4][0] = "Taurus";
    	 compatible[4][1] = "Virgo";
    	 compatible[4][2] = "Capricorn";
    	 compatible[4][3] = "Cancer";
    	 compatible[4][4] = "Scorpio";
    	
    	 compatible[5][0] = "Taurus";
    	 compatible[5][1] = "Virgo";
    	 compatible[5][2] = "Capricorn";
    	 compatible[5][3] = "Cancer";
    	 compatible[5][4] = "Scorpio";
    	 compatible[5][5] = "Pisces";
    	
    	 compatible[6][0] = "Aries";
    	 compatible[6][1] = "Leo";
    	 compatible[6][2] = "Gemini";
    	 compatible[6][3] = "Libra";
    	 compatible[6][4] = "Aquarius";
    	
    	 compatible[7][0] = "Leo";
    	 compatible[7][1] = "Sagittarius";
    	 compatible[7][2] = "Gemini";
    	 compatible[7][3] = "Libra";
    	 compatible[7][4] = "Aquarius";
    	
    	 compatible[8][0] = "Aries";
    	 compatible[8][1] = "Leo";
    	 compatible[8][2] = "Sagittarius";
    	 compatible[8][3] = "Gemini";
    	 compatible[8][4] = "Libra";
    	 compatible[8][5] = "Aquarius";
    	
    	 compatible[9][0] = "Taurus";
    	 compatible[9][1] = "Virgo";
    	 compatible[9][2] = "Capricorn";
    	 compatible[9][3] = "Cancer";
    	 compatible[9][4] = "Scorpio";
    	 compatible[9][5] = "Pisces";
    	
    	 compatible[10][0] = "Taurus";
    	 compatible[10][1] = "Virgo";
    	 compatible[10][2] = "Capricorn";
    	 compatible[10][3] = "Cancer";
    	 compatible[10][4] = "Scorpio";
    	 compatible[10][5] = "Pisces";
    	
    	 compatible[11][0] = "Taurus";
    	 compatible[11][1] = "Capricorn";
    	 compatible[11][2] = "Cancer";
    	 compatible[11][3] = "Scorpio";
    	 compatible[11][4] = "Pisces";
 }
 public boolean isCompatible(String sign1, String sign2)
 {
  String [] compatibleSigns = getCompatibleSigns(sign1);
  for (int i = 0; i < compatibleSigns.length; i++)
  {
   if (compatibleSigns[i] != null && compatibleSigns[i].equals(sign2))
    return true;
 	  }
	  return false;
 }
 public String[] getCompatibleSigns(String sign)
 {
    	 int signIndex = getSignIndex(sign);
    	 return compatible[signIndex];
	 }
 public int getSignIndex(String sign)
 {
    	 int signIndex = 0;
    	 if ("Aries".equals(sign))
       	  signIndex = 0;
    	 if ("Leo".equals(sign))
        	  signIndex = 1;
    	 if ("Sagittarius".equals(sign))
        	  signIndex = 2;
    	 if ("Taurus".equals(sign))
        	  signIndex = 3;
    	 if ("Virgo".equals(sign))
        	  signIndex = 4;
    	 if ("Capricorn".equals(sign))
        	  signIndex = 5;
    	 if ("Gemini".equals(sign))
        	  signIndex = 6;
    	 if ("Libra".equals(sign))
        	  signIndex = 7;
    	 if ("Aquarius".equals(sign))
        	  signIndex = 8;
    	 if ("Cancer".equals(sign))
        	  signIndex = 9;
    	 if ("Scorpio".equals(sign))
        	  signIndex = 10;
    	 if ("Pisces".equals(sign))
        	  signIndex = 11;
    	return signIndex;
	 }
}
