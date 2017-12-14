public abstract class Protagonist extends Character {

    private String name;

    public Protagonist( String pName ) {
	name = pName;
	HP = 200;
	strength = 50;
	defense = 20;
	attackRating = 1.0;
    }

    public String getName() {
	return name;
    }

    public void specialize() {
	attackRating *= 2;
	defense /= 2;
    }

    public void normalize() {
	attackRating = 1.0;
	defense = 20;
    }

    // error displayed when class header is not changed:
    // 'Protagonist is not abstract and does not override abstract method toString() in Protagonist'
    
    public abstract String toString();

    // public static void main(String[] args) {
    // 	Protagonist p0 = new Protagonist();

    // error
    // Protagonist.java:33: error: Protagonist is abstract; cannot be instantiated
    //     Protagonist p0 = new Protagonist();
    
    // }

}
