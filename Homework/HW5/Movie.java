import java.util.Scanner;
public class Movie
{
	//Private declaration of the integer. 
	private String name, rating;
	
	private double averageReview = 0;
	private int terrible = 0;
	private int bad = 0;
	private int ok = 0;
	private int good = 0;
	private int great = 0;
	
	//Constructor, or the template of a movie.
	public Movie()
	{
		name = "Blank Movie.";
		rating = "Not Rated";
	}
		
	public Movie (String initialName)
	{
		name = initialName;
		rating = "Not rated";
	}
	public Movie (String initialName, String initialRating)
	{
		name = initialName;
		rating = initialRating;
	}
	//Set the Movie Name
	public void setName(String newName)
	{
		name = newName;
	}
	//Get the Movie Name
	public String getName()
	{
		return name;
	}
	//Get Movie Rating
	public String getRating()
	{
		return rating;
	}
	//Setting the Parameters - If between 1 and 5, then increased the average.
	public void addRating(int newReview)
	{
		switch (newReview)
		{
			case 1: 
				terrible++;
				break;
			case 2:
				bad++;
				break;
			case 3:
				ok++;
				break;
			case 4:
				good++;
				break;
			case 5:
				great++;
				break;
			default:
				System.out.println("Another number other than 1,2,3,4 or 5 was entered.");
			break;
			}
	}
	public double getAverage()
	{
		averageReview = Math.round(((terrible * 1) + (bad * 2) + (ok * 3) + (good * 4) + (great * 5))/5.00);
		
	return averageReview;
	}
	public String toString()
	{
		return "Name: " + name + "\nRating: " + rating + "\nAverage Review " + averageReview;
	}
	//Writing Output
	public void writeOutput()
	{
		System.out.println("Name: " + getName());
		System.out.println("Rating: " + getRating());
		System.out.println("Average Review " + getAverage());
		System.out.println(terrible + " people have rated this movie as terrible.");
		System.out.println(bad + " people have rated this movie as bad.");
		System.out.println(ok  + " people have rated this movie as OK.");
		System.out.println(good + " people have rated this movie as good.");
		System.out.println(great + " people have rated this movie as great.");
	}
	//Equals boolean method
	public boolean equal(Movie otherObject)
	{
		return (this.rating.equalsIgnoreCase(otherObject.rating)) && (this.averageReview == otherObject.averageReview);
	}
}

