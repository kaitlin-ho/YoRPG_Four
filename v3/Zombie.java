public class Zombie extends Monster {

  //stats initialization
  public Zombie(){
    _hitPts = 100;
    _strength = 20;
    _defense = 11;
    _attack = .5;
  }
  
  public Zombie() {
  }
  
  public static String about(){
    return "average HP, average defense, low damage";
  }
  
  public void specialize(){
    _attack = .5;
    _defense = 50;
  }
  
  public void normalize(){
    _attack = .5;
    _defense = 11;
  }
  

}
