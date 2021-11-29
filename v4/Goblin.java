public class Goblin extends Monster {

  //stats initialization
  public Goblin(){
    _hitPts = 50;
    _strength = 60;
    _defense = 15;
    _attack = .7;
  }

  public static String about(){
    return "Low HP, low defense, high damage.";
  }

}

