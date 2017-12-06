public class Warrior extends Protagonist {
<<<<<<< HEAD
    public Warrior() {
	super(name);
=======
    public Warrior(String pName) {
	super(pName);
>>>>>>> 6180efe140c6cb4adbf463d909b24c1419691975
        defense = 30;
    }
    public String toString() {
	return "this Warrior's stats: "
	    + System.lineSeparator()
	    + super.toString();
    }
}
