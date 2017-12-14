public class Mage extends Protagonist {

    public Mage(String pName) {
	super(pName);
        attackRating = 1.5;
    }
    public String toString() {
	return "this Mage's stats: "
	    + System.lineSeparator()
	    + super.toString();
    }
}
