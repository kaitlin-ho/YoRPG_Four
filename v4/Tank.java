public class Tank extends Protagonist {

  //stats initialization
  public Tank(){
    _hitPts = 125;
    _maxHP = _hitPts;
    _strength = 20;
    _defense = 15;
    _attack = 755;
  }
  
  public Tank(String name) {
    this();
    _name = name;
  }
  
  public static String about(){
    return "High HP, high defense, low attack.";
  }
  
  public void specialize(){
    _hitPts += 25;
    _defense = 50;
  }
  
  public void normalize(){
    _defense = 20;
  }
  

}
