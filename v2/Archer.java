public class Archer extends Protagonist {
    public Archer() {
	super(name);
        strength = 60;
    }
    public String toString() {
	return "this Archer's stats: "
	    + System.lineSeparator()
	    + super.toString();
    }
}
