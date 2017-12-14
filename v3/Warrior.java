public class Warrior extends Protagonist {
    
    public Warrior(String pName) {
	super(pName);
        defense = 30;
    }
   
    public String toString() {
	return "this Warrior's stats: "
	    + System.lineSeparator()
	    + "HP: " + HP
	    + " strength: " + strength
	    + " defense: " + defense
	    + " attack rating: " + attackRating;
    }

    public void specialize() {
	attackRating *= 1.25;
	defense /= 1.25;
    }

    public void normalize() {
	attackRating = 1.0;
	defense = 20;
    }
}
