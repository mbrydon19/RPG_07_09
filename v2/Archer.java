public class Archer extends Protagonist {
<<<<<<< HEAD
    public Archer() {
	super(name);
=======
    public Archer(String pName) {
	super(pName);
>>>>>>> 6180efe140c6cb4adbf463d909b24c1419691975
        strength = 60;
    }
    public String toString() {
	return "this Archer's stats: "
	    + System.lineSeparator()
	    + super.toString();
    }
}
