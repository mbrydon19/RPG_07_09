public class Character {

    protected int HP;
    protected int strength;
    protected int defense;
    protected double attackRating;

    public boolean isAlive() {
        return HP > 0;
    }
    
    public int getDefense() {
	return defense;
    }

    public void lowerHP( int damage ) {
	HP -= damage;
    }

    public int attack( Character fighter ) {
	int damage = (int)(strength * attackRating - fighter.getDefense());
	fighter.lowerHP(damage);
	return damage;
    }
    
}
