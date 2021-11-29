public class Zombie extends Monster {

  //stats initialization
  public Zombie(){
    _hitPts = 100;
    _strength = 20;
    _defense = 11;
    _attack = .5;
  }
  
  public static String about(){
    return "average HP, average defense, low damage";
  }
  

}
