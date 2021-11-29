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
    _attack = .70;
    _defense = 5;
  }
  
  public void normalize(){
    _attack = .65;
    _defense = 7;
  }
  

}