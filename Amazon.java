
import javax.swing.JOptionPane;

//Driver class Amazon
public class Amazon {
	
	public Book getInput()
	{
		Book book;
		int rating;
		
		JOptionPane.showMessageDialog(null, "Welcome to Amazon Book Information Entry Application!" + "\nLet's start entering book information");
		String another = null;
		do
		{
		String title = JOptionPane.showInputDialog("Enter the title of the book");
		String author = JOptionPane.showInputDialog("Enter the author of the book");
		String choice = JOptionPane.showInputDialog("Do you have more information for the book, ex. price,type of cover,...(y or n)?");
		
		if (choice.equalsIgnoreCase("y"))
		{
	
			double price =Double.parseDouble(JOptionPane.showInputDialog("Price"));
			
			String hasHardCover =JOptionPane.showInputDialog("Is this Hardcover (y or n)?");
			
			book = new Book (title, author, price, hasHardCover);
			
		}
		else
			book = new Book(title,author);
		
		do {
		rating =Integer.parseInt(JOptionPane.showInputDialog("Enter Rating (1-4) or 0 for no rating"));
		
		while (rating>=1 && rating <=4)
		{
			book.addRating(rating);
			rating =Integer.parseInt(JOptionPane.showInputDialog("Enter Rating (1-4) or 0 for no more rating"));
			
		}
	
		if(rating<0||rating>4)	
		{
			JOptionPane.showMessageDialog(null,"INVALID RATING!");
		} 
		}while(rating !=0);
		
		JOptionPane.showMessageDialog(null, book.toString());
		
		another = JOptionPane.showInputDialog("Do you want to enter another book information");
		
		}while (another.equalsIgnoreCase("y"));
	
		return book;
	}
	
	/**
	 * main Method
	 * @param args
	 */
	//Define a main method
	 public static void main(String[] args)
	 {
		 Book b = new Amazon().getInput();
		
		 JOptionPane.showMessageDialog(null, b.toString());
	}
}	
