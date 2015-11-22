//

public class Card { // This class is created for every card and stores the information for each of them
	// Variables to store rank, suit and value of card
	public String rank = "", suit = "";
	public int value = 0;

	Card(String r, String s, int v) { // Constructor - initialise values
		this.rank = r;
		this.suit = s;
		this.value = v;
	}

	public void print() { // Debug - print out info on card
		System.out.printf("%s of %s, value %d\n", this.rank, this.suit, this.value);
	}

	public String getFileName() { // Get the file name of the image of this card
		if (value == 0) // If this is the dealer's turned over card (value 0)
			return "cardImages/backCover.png";
		return String.format("cardImages/%s/%s.png", this.suit, this.rank); // Return file name
	}
}
