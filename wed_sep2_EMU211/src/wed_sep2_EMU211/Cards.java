package wed_sep2_EMU211;

public class Cards {
	private String rank;
	private String suit;
	
	// getters methods
	public String getrank() {
		return rank;
	}
	public String getsuit() {
		return suit;
	}
	
	//Setters
	public void setrank(String rank) {
		this.rank = rank;
	}
	public void setsuit(String suit) {
		this.suit =suit;
	}
	
	//tostring method
	public String toString() {
		return rank + " of " + suit; 
	}
	
	
	
	
	

}
