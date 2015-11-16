//Team Fun In the Sun-- Shaik Abiden, Richard Lin, and Sebastian Dittgen
//APCS1 pd 10
//HW28 -- Ye Olde Role Playing Game, Expanded
//2015 - 11 - 14

public class Character {
    protected String name = "";
    protected int hp = 0;
    protected int strength = 0;
    protected int defense = 0;
    protected double attackRating = 0.0;
    
     //isAlive: returns True if alive
    public boolean isAlive(){
        return  (hp > 0);
    }
    //getName: returns name
    public String getName(){
        return name;
    }
    //getDeefense: returns value of defense attribute
    public int getDefense(){
        return defense;
    }
    //lowers hp by dmg
    public void lowerHP(int dmg){
        hp = hp - dmg;
    }
    //attack: calculates dmg by (int) (strength * attackRating - warrior defence)
    public int attack(Character enemy){
        int dmg = (int) (strength * attackRating - enemy.getDefense());
        if (dmg < 0){
            dmg = 0;
        }
        enemy.lowerHP(dmg);
        return dmg;
    }
    
    public void specialize(){
        defense = defense - 3;
        attackRating = attackRating + 0.4;
    }

    //normalize: brings Character back to normal
    public void normalize() {
        defense = 7;
        attackRating = 0.3;
    }
    
    public static String about() {
        return "";
    }
    
    
}