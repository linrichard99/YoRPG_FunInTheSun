//Team Fun In the Sun-- Shaik Abiden, Richard Lin, and Sebastian Dittgen
//APCS1 pd 10
//HW28 -- Ye Olde Role Playing Game, Expanded
//2015 - 11 - 14

//Class Ranger

public class Ranger extends Character{
    //Constructor: Initializes Ranger's attributes
    public Ranger(String n){
        name = n;
        hp = 100;
        strength = 200;
        defense = 10;
        attackRating = 0.2;
    }
    //specialize: prepares the Ranger to perform special attack
    public void specialize(){
        defense = defense - 5;
        attackRating = attackRating + 0.3;
    }

    //normalize: brings Ranger back to normal
    public void normalize() {
        defense = 10;
        attackRating = 0.2;
    }
}