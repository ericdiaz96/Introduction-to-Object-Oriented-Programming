public class Movie
{
	//attributes
	private String movieName;
	private String MPAARating;
	private int ratings[] = new int[5];
	//default constructor
	public Movie()
	{
	movieName = null;
	MPAARating = null;
	ratings[0]= 0;
	ratings[1]= 0;
	ratings[2]= 0;
	ratings[3]= 0;
	ratings[4]= 0;
	}//end of the default constructor
	
	public Movie (String newMovieName, String newMPAARating)
	{
	movieName = newMovieName;
	MPAARating = newMPAARating;
	ratings[0]= 0;
	ratings[1]= 0;
	ratings[2]= 0;
	ratings[3]= 0;
	ratings[4]= 0;
	} //end of constructor
	public Movie(String movieName1, String MPAARating1, int terrible1, int bad1, int ok1, int good1, int great1)
	{
		movieName = movieName1;
		MPAARating = MPAARating1;
		ratings[0]= terrible1;
		ratings[1]= bad1;
		ratings[2]= ok1;
		ratings[3]= good1;
		ratings[4]= great1;
	}
	//getMovieName()
	public String getMovieName()
	{
	return movieName;
	}
	//setMovieName
	public void setMovieName(String newMovieName)
	{
	movieName = newMovieName;
	}
	public String getMPAARating()
	{
	return MPAARating;	
	}//end of MPAA method
	public void setMPAARating(String newMPAARating)
	{
	MPAARating = newMPAARating;
	} // end of setMPAARating
	public void addRating(int rate)
	{
	switch(rate)
	{
	case 1:
	ratings[0]++;
	break; 
	
	case 2:
	ratings[1]++;
	break;
	
	case 3:
	ratings[2]++;
	break;
	
	case 4:
	ratings[3]++;
	break;
	
	case 5:
	ratings[4]++;
	break;
	}
	}
	public double getAverage()
	{
	return (double) (ratings[0]*1 + ratings[1]*2
	+ ratings[2]*3 + ratings[3]*4 + ratings [4]*5)/
	(ratings[0] + ratings[1] + ratings[2] + ratings[3]+
	ratings[4]);
	}
	//start main method
	public static void main (String[]args)
	{
	Movie movie1 = new Movie();
	Movie movie2 = new Movie("Final Destination","PG-13");
	Movie movie3 = new Movie("Ghost Rider", "PG", 2, 2, 2, 2, 2);
	//call setMovieName
	movie1.setMovieName("Avatar");
	//call setMPAARating
	movie1.setMPAARating("R");
	//add ratings for the movie1
	movie1.addRating(5);
	movie1.addRating(4);
	movie1.addRating(5);
	movie1.addRating(3);
	movie1.addRating(4);
	movie1.addRating(5);
	movie1.addRating(3);
	movie1.addRating(4);
	movie1.addRating(3);
	movie1.addRating(5);
	//add ratings for the movie2
	movie2.addRating(5);
	movie2.addRating(1);
	movie2.addRating(4);
	movie2.addRating(5);
	movie2.addRating(3);
	movie2.addRating(5);
	movie2.addRating(4);
	movie2.addRating(2);
	movie2.addRating(5);
	movie2.addRating(3);
	//add ratings for movie3
	movie3.addRating(4);
	movie3.addRating(5);
	movie3.addRating(2);
	movie3.addRating(3);
	movie3.addRating(5);
	movie3.addRating(3);
	movie3.addRating(4);
	movie3.addRating(5);
	movie3.addRating(2);
	movie3.addRating(3);
	
	//display the movie1 details
	System.out.println("Movie Name: " + movie1.getMovieName());
	System.out.println("MPAA Rating: " + movie1.getMPAARating());
	System.out.println("People Rating: " + movie1.getAverage());
	System.out.println();
	
	//display movie2 details
	System.out.println("Movie Name: " + movie2.getMovieName());
	System.out.println("MPAA Rating: " + movie2.getMPAARating());
	System.out.println("People Rating: " + movie2.getAverage());
	System.out.println();
	
	//display movie3 details
	System.out.println("Movie Name: " + movie3.getMovieName());
	System.out.println("MPAA Rating: " + movie3.getMPAARating());
	System.out.println("People Rating: " + movie3.getAverage());
	System.out.println();
	}
}