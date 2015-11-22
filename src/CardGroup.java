import java.util.*; // for ArrayList and Collections

public class CardGroup {

	public ArrayList<Card> cards = new ArrayList<Card>();

	public void initFullDeck() {
		this.cards.clear();
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		int[] rankValues = { 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };

		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				this.cards.add(new Card(ranks[i], suits[j], rankValues[i]));
			}
		}
	}

	public Card takeCard() { // Removes card from top of card group's ArrayList
								// and returns it
		if (this.cards.size() < 1) {
			System.out.println("Error: no more cards!");
			System.exit(0);
		}
		Card tempCard = this.cards.get(this.cards.size() - 1);
		this.cards.remove(this.cards.size() - 1);
		return tempCard;
	}

	public void shuffle() {
		long seed = System.nanoTime(); // Seed for random class
		Collections.shuffle(this.cards, new Random(seed)); // This implementation traverses the list backwards, from the last element up to the second, repeatedly swapping a randomly selected element into the "current position"
	}

	public int getTotalValue() {
		int totalValue = 0;
		for (int i = 0; i < this.cards.size(); i++)
			totalValue += this.cards.get(i).value;
		return totalValue;
	}

	public int getNumAces() {
		int numAces = 0;
		for (int i = 0; i < this.cards.size(); i++)
			if (this.cards.get(i).rank == "Ace")
				numAces++;
		return numAces;
	}

	public int getCount() {
		return this.cards.size();
	}

	public void print() {
		for (int i = 0; i < this.cards.size(); i++) {
			this.cards.get(i).print();
		}
	}

}
