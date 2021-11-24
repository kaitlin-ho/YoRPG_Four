public class Character {

  public int _hitPts;
  public int _strength;
  public int _defense;
  public double _attack;
  
  public Character() {
  }
  
  public boolean isAlive() {
    return _hitPts > 0;
  }
  
  public int getDefense() {
    return _defense;
  }
  
  public void lowerHP(int dmg) {
    _hitPts = _hitPts - dmg;
  }
  
  public int attack (Character name) {
    int _damage = (int) ((_strength * _attack) - name.getDefense());
    
    if (_damage < 0) {_damage = 0;}
    
    name.lowerHP( _damage );
    
    return _damage;
    
  }

}
