//Team Fun In the Sun-- Shaik Abiden, Richard Lin, and Sebastian Dittgen
//APCS1 pd 10
//HW28 -- Ye Olde Role Playing Game, Expanded
//2015 - 11 - 14

//Class Cleric

public class Cleric extends Character{
    //Constructor: Initializes Cleric's attributes
    public Cleric(String n){
        name = n;
        hp = 50;
        strength = 200;
        defense = 3;
        attackRating = 0.5;
    }
    //specialize: prepares the Cleric to perform special attack
    public void specialize(){
        defense = defense - 2;
        attackRating = attackRating + 0.3;
    }

    //normalize: brings Cleric back to normal
    public void normalize() {
        defense = 3;
        attackRating = 0.5;
    }
}