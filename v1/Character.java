public class Character {
  
  public int HP;
  public int strength;
  public int defense;
  public double attack;
  
  public Character() {
    HP = 125;
    strength = 100;
    defense = 40;
    attack = .4;
  }
  
  public boolean isAlive() {
    return HP > 0;
  }
  
  public int getDefense() {
    return defense;
  }
  
  public void lowerHP(int dmg) {
    HP = HP - dmg;
  }
  
  public int attack (Character name) {
    int damage = (int) ((strength * attack) - name.getDefense());
    
    if (damage < 0) {damage = 0;}
    
    name.lowerHP( damage );
    
    return damage;
  }

}
