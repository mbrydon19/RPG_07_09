public class Mage extends Protagonist {
    public Mage() {
	super(name);
        attackRating = 1.5;
    }
    public String toString() {
	return "this Mage's stats: "
	    + System.lineSeparator()
	    + super.toString();
    }
}
