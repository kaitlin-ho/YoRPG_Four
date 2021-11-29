public class Goblin extends Monster {

  //stats initialization
  public Goblin(){
    _hitPts = 70;
    _strength = 60;
    _defense = 20;
    _attack = .7;
  }
  
  public Goblin() {
    this();
  }
  
  public static String about(){
    return "low HP, low defense, high damage";
  }
  
  public void specialize(){
    _attack = .8;
    _defense = 10;
  }
  
  public void normalize(){
    _attack = .6;
    _defense = 10;
  }
  

}

