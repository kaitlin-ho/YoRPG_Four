public class Giant extends Monster {

  //stats initialization
  public Giant(){
    _hitPts = 100;
    _strength = 20;
    _defense = 10;
    _attack = .6;
  }
  
  public static String about(){
    return "high HP, low defense, high damage";
  }
  

}
