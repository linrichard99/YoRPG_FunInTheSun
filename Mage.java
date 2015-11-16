//Team Fun In the Sun-- Shaik Abiden, Richard Lin, and Sebastian Dittgen
//APCS1 pd 10
//HW28 -- Ye Olde Role Playing Game, Expanded
//2015 - 11 - 14

//Class Mage

public class Mage extends Character{
    //Constructor: Initializes Mage's attributes
    public Mage(String n){
        name = n;
        hp = 50;
        strength = 250;
        defense = 5;
        attackRating = 0.3;
    }
    //specialize: prepares the Mage to perform special attack
    public void specialize(){
        defense = defense - 4;
        attackRating = attackRating + 0.6;
    }

    //normalize: brings Mage back to normal
    public void normalize() {
        defense = 5;
        attackRating = 0.3;
    }

    public String about() {
	return "The Magic Class. It has low HP and medium defense, but high attack";
    }
}
