/*Name: Nidhi Patel
 * Project Name:- Machine Problem #1 
 * Description:- We are randomly picking 4 different suits from the deck.  
 * 
 */
package wed_sep2_EMU211;

public class MachineProblemOne {

	public static void main(String[] args) {
		
		// Creating a deck
		Cards[][] deck= new Cards[4][13];
		
		//Creating string array of suits and ranks
		String[] suits = {"Hearts", "Diamonds","Spades", "Clubs"};
		
		String[]ranks = {"Ace","2","3","4","5","6","7","8","9",
				"10","Jack","Queen", "King"};
		
		
		//This for loop assigns ranks and suits to the cards in the deck
		for(int r = 0; r < deck.length; r++ )
		{
			for(int c=0; c < deck[r].length; c++)
			{
				
				//Creating a card
				deck[r][c]= new Cards();
				
				//setting the suit
				deck[r][c].setsuit(suits[r]);
				//setting the rank
				deck[r][c].setrank(ranks[c]);
				
				
			}
		}
		//you randomly keep picking cards until
		// you get 4 different suits from the deck.
		int numberofpicks = cardpicker(deck, suits);
		System.out.println("Number of picks is: " + numberofpicks);
		System.out.println("THANK YOU FOR USING NIDHI PATEL'S PROGRAM");
	
	}
	//This method picks out random cards and returns numberOfPicks
	public static int cardpicker(Cards[][] deck, String[] suits)
	{
		//counting the number of random picks it takes to get all 4 suites.
		int numberOfPicks = 0;
		//booleans to keep track of suites found 
		boolean founddiamonds = false;
		boolean foundhearts = false;
		boolean foundspades = false;
		boolean foundclubs = false;
		
		//This while loop keeps looping until the four suites are found.
		while(!founddiamonds || !foundhearts || !foundspades || !foundclubs)
		{
			//This generates random row and column
			int randomRow = (int)(Math.random() * 4);  
			int randomCol = (int)(Math.random() * 13);

			//this statement finds the suit(diamond) and equals it to true, so that it doesn't have to find it again.
			if(deck[randomRow][randomCol].getsuit() == suits[1] && !founddiamonds)
			{
				System.out.println(deck[randomRow][randomCol]);
				founddiamonds = true;
			}
			////this statement finds the suit(hearts) and equals it to true, so that it doesn't have to find it again.
			else if(deck[randomRow][randomCol].getsuit() == suits[0] && !foundhearts)
			{
				System.out.println(deck[randomRow][randomCol]);
				foundhearts = true;
			}
			////this statement finds the suit(spades) and equals it to true, so that it doesn't have to find it again.
			else if(deck[randomRow][randomCol].getsuit() == suits[2] && !foundspades)
			{
				System.out.println(deck[randomRow][randomCol]);
				foundspades = true;
			}
			////this statement finds the suit(clubs) and equals it to true, so that it doesn't have to find it again.
			else if (deck[randomRow][randomCol].getsuit() == suits[3] && !foundclubs)
			{
				System.out.println(deck[randomRow][randomCol]);
				foundclubs = true;
			}
			
			//this increments the numberOfPicks
			numberOfPicks++;
		}
		System.out.println();
		return numberOfPicks;
	}

}































