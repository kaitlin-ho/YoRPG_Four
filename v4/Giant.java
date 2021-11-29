public class Giant extends Monster {

  //stats initialization
  public Giant(){
    _hitPts = 100;
    _strength = 20;
    _defense = 10;
    _attack = .6;
  }
  
  public static String about(){
    return "High HP, low defense, high damage.";
  }
  
  public void specialize(){
    _attack = .99;
    _defense = 50;
  }
  
  public void normalize(){
    _attack = .6;
    _defense = 10;
  }

}
