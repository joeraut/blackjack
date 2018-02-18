## Simple Blackjack game in Java, with GUI
Joseph Rautenbach

![Main image](http://i.imgur.com/tibL3bM.png)

### About
This is a one-player blackjack game, where the player plays against the dealer.

### Implementation
The game is written in Java (developed in Eclipse) using Swing/AWT for the GUI.

Standard Blackjack rules are used:
 * Dealer stands on 16
 * Aces have a value of 11, **unless** total is >21 - if so, then the Ace assumes a value of 1. If more than one Ace is present, only one can change value.

Each card is an instance of `Card`, stored in a `CardGroup` and the contents of a `CardGroup` can be displayed as a `CardGroupPanel`, an extension of Swing's `JPanel`.
The game contains 3 instances of `CardGroup` - one for the dealer's initial (shuffled) deck, and two for the player and dealer cards which are displayed using `CardGroupPanel`.
Cards are popped from the dealer's deck and added to the player or dealer card group each time a player hits or dealer takes a card.
The code is well commented so should be pretty easy to understand.

### Installation
After cloning or downloading, it should be possible to import directly into the Eclipse IDE (or similar).
Source files are located in `src`; when compiling, be sure to include the image resources in the repo root.

### Gameplay
The player sets an initial balance, deals and then hits or stands until either getting a blackjack, winning, losing or pushing.
When out of money the option to top up or end the game is given.