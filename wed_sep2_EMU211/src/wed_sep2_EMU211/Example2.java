/*Name: Nidhi Patel
 * Project Name:- Machine Problem #1 
 * Description:- We are randomly picking 4 different suits from the deck.  
 * 
 */
package wed_sep2_EMU211;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cards[][] deck= new Cards[4][13];
		
		
		//This for loop makes the 0th row of the deck to all aceOfDiamond
		for(int c=0; c < deck[0].length; c++)
		{
			Cards aceofdiamond = new Cards();
			aceofdiamond.setrank("Ace");
			aceofdiamond.setsuit("Diamond");
			deck[0][c] = aceofdiamond; 
			
			   
		}
		//this for loop makes the 1st row of the deck to kingOfHearts
		for(int c=0; c < deck[1].length; c++)
		{
			Cards kingofhearts = new Cards();
			kingofhearts.setrank("King");
			kingofhearts.setsuit("Hearts");
			deck[1][c]= kingofhearts;
			
			
		}
		//This for loop makes the 2nd row of the deck to ThreeOfSpades
		for (int c=0; c < deck[2].length; c++)
		{
			Cards threeofspades = new Cards();
			threeofspades.setrank("3");
			threeofspades.setsuit("Spades");
			deck [2][c]= threeofspades;
			
			
		}
		//This for loop makes the 3rd row of the deck to queenOfDiamonds
		for(int c=0; c < deck[3].length; c++)
		{
			Cards queenofdiamonds = new Cards();
			queenofdiamonds.setrank("Queen");
			queenofdiamonds.setsuit("Diamonds");
			deck [3][c]= queenofdiamonds;
			
			
		}
		//This for loop prints out whatever is at those postion.
		for(int r=0; r < deck.length; r++)
		{
			for(int c=0; c < deck[r].length; c++)
			{	
				System.out.println(deck[r][c]);
			}
		}
		


	}

}
