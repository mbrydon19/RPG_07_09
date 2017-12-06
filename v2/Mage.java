public class Mage extends Protagonist {
<<<<<<< HEAD
    public Mage() {
	super(name);
=======
    public Mage(String pName) {
	super(pName);
>>>>>>> 6180efe140c6cb4adbf463d909b24c1419691975
        attackRating = 1.5;
    }
    public String toString() {
	return "this Mage's stats: "
	    + System.lineSeparator()
	    + super.toString();
    }
}
