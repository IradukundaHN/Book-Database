
 import javax.swing.JOptionPane;
 import java.util.Random;
 import java.text.DecimalFormat;
 
 //Data Element class defined
public class Book {

	//Declare the instance variable
	private String titleBook;
	private String authorBook;
	private int totalRating;
	private int numberRating;
	private double price;
	private String hasHardCover;
	DecimalFormat fmt = new DecimalFormat("#,##0.00");
	
	/**
	 * Book Constructor
	 * @param title book
	 * @param author book
	 */
	public Book (String title, String author)
	{
		titleBook = title;
		authorBook = author;
		totalRating = 0;
		Random rand = new Random();
		price = (double) rand.nextInt(10)+1;
		hasHardCover = "no";
	}
	
	/**
	 * Book constructor
	 * @param title
	 * @param author
	 * @param price
	 * @param hasHardCover
	 */
	public Book (String title, String author, double price, String hasHardCover)
	{
		titleBook = title;
		authorBook = author;	
		numberRating = 0;
		totalRating = 0;
		this.price = price;
		this.hasHardCover = "yes";
	}
	
	/**
	 * addRating Method
	 * @param ratingBook
	 */
	public void addRating(int ratingBook)
	{

		totalRating += ratingBook;
		
		numberRating++;
	}
	
	/**
	 * findAvg Method
	 * @return average Rating
	 */
	public double findAvgRating()
	{
		if (numberRating == 0)
			return 0;
		else
		 return ((double) totalRating)/numberRating;
		
	}
	
	/**
	 * bookRecommendation Method
	 * @return String for the recommendation
	 */
	public String bookRecommendation()
	{
		double avgRating = findAvgRating();
		
		if ((avgRating >= 3)&&(avgRating <= 4))
			return "strongly recommended";
		else if ((avgRating >= 2)&&(avgRating < 3))
			return "Recommended";
		else if ((avgRating < 2)&&(avgRating >= 1))
			return "Not recommended";
		else
			return "No Information is Available For Recommendation";
	}
	
	/**
	 * toString Method
	 * return the information for the book
	 */
	public String toString()
	{
		return "TITLE: " + titleBook + 
				"\nAUTHOR: " + authorBook+
				"\nTOTAL# OF RATINGS: " + numberRating+
				"\nAVERAGE RATING: "+ (fmt.format(findAvgRating()))+
				"\nPRICE: " + price +
				"\nHARDCOVER: " + hasHardCover +
				"\nRECOMMENDATION BASED ON BOOK RATINGS: " + bookRecommendation();
	}
}

