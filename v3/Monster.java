public class Monster extends Character{
    public Monster() {
	HP = 150;
	strength = 30;
	defense = 20;
	attackRating = 1.0;
    }

    public String toString() {
	return "HP: " + HP
	    + " strength: " + strength
	    + " defense: " + defense
	    + " attack rating: " + attackRating;
    }
   
}
