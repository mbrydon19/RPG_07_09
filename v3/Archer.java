public class Archer extends Protagonist {

    public Archer(String pName) {
	super(pName);
        strength = 60;
    }

    public String toString() {
    	return "this Archer's stats: "
    	    + System.lineSeparator()
    	    + "HP: " + HP
	    + " strength: " + strength
	    + " defense: " + defense
	    + " attack rating: " + attackRating;
    }

    public void specialize() {
	attackRating *= 1.5;
	defense /= 1.5;
    }

    public void normalize() {
	attackRating = 1.0;
	defense = 20;
    }

    //error toString() was not overridden
    // Archer.java:1: error: Archer is not abstract and does not override abstract method toString() in Protagonist

}
