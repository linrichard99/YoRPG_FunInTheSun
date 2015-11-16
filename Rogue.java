//Team Fun In the Sun-- Shaik Abiden, Richard Lin, and Sebastian Dittgen
//APCS1 pd 10
//HW28 -- Ye Olde Role Playing Game, Expanded
//2015 - 11 - 14

//Class Rogue

public class Rogue extends Character{
    //Constructor: Initializes Rogue's attributes
    public Rogue(String n){
        name = n;
        hp = 80;
        strength = 80;
        defense = 9;
        attackRating = 0.5;
    }
    //specialize: prepares the Rogue to perform special attack
    public void specialize(){
        defense = defense - 3;
        attackRating = attackRating + 0.5;
    }

    //normalize: brings Rogue back to normal
    public void normalize() {
        defense = 9;
        attackRating = 0.5;
    }

    public String about() {
	return "The Thief Class";
    }
}
