public class Orc extends Monster{
    public Orc() {
	super();
	strength = 40;
    }

    public String toString() {
	return "this Orc's stats: "
	    + System.lineSeparator()
	    + super.toString();
    }
