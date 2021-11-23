/**
  class Protagonist -- protagonist of Ye Olde RPG
  **/

public class Protagonist extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    private String _name = "J. Doe";
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
    public Protagonist() {
        _hitPts = 125;
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
      int attack(Monster) -- simulates attack on a Monster
      pre:  Input not null
      post: Calculates damage to be inflicted, flooring at 0.
      Calls opponent's lowerHP() method to inflict damage.
      Returns damage dealt.
      **/
    public int attack( Monster opponent ) {

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

}//end class Protagonist
