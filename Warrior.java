//Team Fun In the Sun-- Shaik Abiden, Richard Lin, and Sebastian Dittgen
//APCS1 pd 10
//HW28 -- Ye Olde Role Playing Game, Expanded
//2015 - 11 - 14

//Class Warrior

public class Warrior extends Character{
    //Constructor: Initializes Warrior's attributes
    public Warrior(String n){
        name = n;
        hp = 100;
        strength = 200;
        defense = 7;
        attackRating = 0.3;
    }
    //specialize: prepares the Warrior to perform special attack
    public void specialize(){
        defense = defense - 3;
        attackRating = attackRating + 0.4;
    }

    //normalize: brings Warrior back to normal
    public void normalize() {
        defense = 7;
        attackRating = 0.3;
    }
    
    public String about() {
        return "The Warrior Class. It has medium HP, but high strength and defense";
    }
}
