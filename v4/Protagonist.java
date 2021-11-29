/**
  class Protagonist -- protagonist of Ye Olde RPG
  **/

public class Protagonist extends Character {

  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
  protected String _name = "J. Doe";
  // All inherited variables from Character
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  /**
    default constructor
    pre:  instance vars are declared
    post: initializes instance vars.
    **/
  public Protagonist() {
      _hitPts = 125;
      _maxHP = _hitPts;
      _strength = 100;
      _defense = 40;
      _attack = .4;
  }


  /**
    overloaded constructor
    pre:  instance vars are declared
    post: initializes instance vars. _name is set to input String.
    **/
  public Protagonist( String name ) {
      this();
      _name = name;
  }


  // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
  public String getName() { return _name; }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  // Inheritted Methods:
  // int getDefense()
  // boolean isAlive() 
  // int attack( Monster opponent ) {
  // void lowerHP( int damageInflicted )

  //prepare a Protagonist for a special attack
  public void specialize() {
      _attack = .75;
      _defense = 20;
  }

  //revert to normal mode
  public void normalize() {
      _attack = .4;
      _defense = 40;
  }
  
  public void heal(){
      _hitPts = _hitPts + (_maxHP - _hitPts);
  }

}//end class Protagonist
