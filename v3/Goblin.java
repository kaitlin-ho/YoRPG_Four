public class Goblin extends Monster {

  //stats initialization
  public Goblin(){
    _hitPts = 70;
    _strength = 60;
    _defense = 20;
    _attack = .7;
  }

  public static String about(){
    return "low HP, low defense, high damage";
  }
  

}

