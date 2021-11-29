/**
  class Monster -- Represents random incarnations of
  the adventurer's natural enemy in Ye Olde RPG
**/

public class Monster extends Character {

  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
  // All inherited variables from Character
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
    _attack = .4;
  }

  // Inheritted Methods:
  // int getDefense()
  // boolean isAlive() 
  // int attack( Protagonist player ) {
  // void lowerHP( int damageInflicted )

}//end class Monster
