public class Mage extends Protagonist{
  /* test
  public static void main(String[] args){
    Mage ttest = new Mage();
    System.out.println(ttest.isAlive());
  }

  */
  
  public Mage() {
        _hitPts = 70;
        _strength = 70;
        _defense = 10;
        _attack = .75;
  }
  
  public Mage( String name ) {
    this();
    _name = name;
  }
  
  //prepare for special attack
  public void specialize() {
      _attack = .90;
      _defense = 6;
  }

  //revert to normal mode
  public void normalize() {
      _attack = .75;
      _defense = 10;
  }
  
}
