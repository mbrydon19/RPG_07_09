public class Warrior extends Protagonist {
    public Warrior() {
	super(name);
        defense = 30;
    }
    public String toString() {
	return "this Warrior's stats: "
	    + System.lineSeparator()
	    + super.toString();
    }
}
