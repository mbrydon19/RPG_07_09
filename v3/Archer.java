public class Archer extends Protagonist {

    public Archer(String pName) {
	super(pName);
        strength = 60;
    }
    public String toString() {
	return "this Archer's stats: "
	    + System.lineSeparator()
	    + super.toString();
    }
}
