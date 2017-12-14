public class Mage extends Protagonist {

    public Mage(String pName) {
	super(pName);
        attackRating = 1.5;
    }
    public String toString() {
	return "this Mage's stats: "
	    + System.lineSeparator()
	    + "HP: " + HP
	    + " strength: " + strength
	    + " defense: " + defense
	    + " attack rating: " + attackRating;
    }

    public void specialize() {
	attackRating *= 2;
	defense /= 2;
    }

    public void normalize() {
	attackRating = 1.0;
	defense = 20;
    }
}
