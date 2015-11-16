//Team Fun In the Sun-- Shaik Abiden, Richard Lin, and Sebastian Dittgen
//APCS1 pd 10
//HW28 -- Ye Olde Role Playing Game, Expanded
//2015 - 11 - 14

//Class Monster
public class Monster extends Character{
    //constructor: initializes the monster's attibutes
    public Monster() {
        strength = (int) (Math.random() * (45) + 20);
        hp = 150;
        defense = 10;
        attackRating = .7;
    }
}