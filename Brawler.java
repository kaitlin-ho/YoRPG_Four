public class Brawler extends Protagonist {

  //stats initialization
  public Brawler(){
    _hitPts = 100;
    _maxHP = _hitPts;
    _strength = 50;
    _defense = 12;
    _attack = .6;
  }
  
  public Brawler(String name) {
    this();
    _name = name;
  }
  
  public static String about(){
    return "Normal HP, balanced attack and defense.";
  }
  
  public void specialize(){
    _attack = .7;
    _defense = 15;
  }
  
  public void normalize(){
    _attack = .6;
    _defense = 12;
  }
  

}
