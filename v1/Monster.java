/**
  class Monster -- Represents random incarnations of
  the adventurer's natural enemy in Ye Olde RPG
**/

public class Monster extends Character {

  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
  private int _hitPts;
  private int _strength;
  private int _defense;
  private double _attack;
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  /**
     default constructor
     pre:  instance vars are declared
     post: initializes instance vars.
  **/
  public Monster() {
    _hitPts = 150;
    _strength = 20 + (int)( Math.random() * 45 ); // [20,65)
    _defense = 20;
    _attack = 1;
  }


  // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
  public int getDefense() { return _defense; }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  /**
     boolean isAlive() -- tell whether I am alive
     post: returns boolean indicated alive or dead
  **/
  public boolean isAlive() {
    return _hitPts > 0;
  }


  /**
     int attack(Warrior) -- simulates attack on a Warrior
     pre:  Input not null
     post: Calculates damage to be inflicted, flooring at 0.
     Calls opponent's lowerHP() method to inflict damage.
     Returns damage dealt.
  **/
  public int attack( Protagonist opponent ) {

    int damage = (int)( (_strength * _attack) - opponent.getDefense() );
    //System.out.println( "\t\t**DIAG** damage: " + damage );

    if ( damage < 0 )
      damage = 0;

    opponent.lowerHP( damage );

    return damage;
  }//end attack


  /**
     void lowerHP(int) -- lowers life by input value
     pre:  Input >= 0
     post: Life instance var is lowered by input ammount.
  **/
  public void lowerHP( int damageInflicted ) {
    _hitPts = _hitPts - damageInflicted;
  }

}//end class Monster
