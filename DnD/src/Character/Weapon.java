package Character;

public class Weapon {
  private int attackMod;
  private String damageDice;

  public Weapon(int attackValue, String damageDice) {
    this.attackMod = attackValue;
    this.damageDice = damageDice;
  }

  public int getAttackMod() {
    return attackMod;
  }

  public String getDamageDice() {
    return damageDice;
  }
}
