public class Giant extends Monster {
    public Giant() {
	super();
	HP = 200;
    }

    public String toString() {
	return "this Giant's stats: "
	    + System.lineSeparator()
	    + super.toString();
}
