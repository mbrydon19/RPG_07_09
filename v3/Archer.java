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

    //error toString() was not overridden
    // Archer.java:1: error: Archer is not abstract and does not override abstract method toString() in Protagonist

}
