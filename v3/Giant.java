ublic class Giant extends Monster {

  //stats initialization
  public Giant(){
    _hitPts = 50;
    _strength = 20;
    _defense = 100;
    _attack = 10;
  }
  
  public Giant(String name) {
    this();
    _name = name;
  }
  
  public static String about(){
    return "insert stuff";
  }
  
  public void specialize(){
    _hitPts += 25;
    _defense = 50;
  }
  
  public void normalize(){
    _defense = 20
  }
  

}