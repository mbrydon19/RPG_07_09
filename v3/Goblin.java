public class Goblin extends Monster {
    public Goblin() {
	super();
	attackrating = 1.5;
    }

    public String toString() {
	return "this Goblin's stats: "
	    + System.lineSeparator()
	    + super.toString();
    }
