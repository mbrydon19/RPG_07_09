public class Protagonist extends Character {

    protected String name;

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

}
