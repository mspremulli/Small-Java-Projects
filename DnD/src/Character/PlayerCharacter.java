package Character;

public class PlayerCharacter {

  private int totalArmor;
  private int totalAttack;
  private Weapon weapon;
  private Armor armor;
  private int armorClass;
  private int attackMod;
  private int defenseMod;

  public PlayerCharacter() {
    this.weapon = new Weapon(0, "2d4");
    this.armor = new Armor(0);
  }

  public PlayerCharacter(Weapon weapon, Armor armor) {
    this.weapon = weapon;
    this.armor = armor;
  }

  public PlayerCharacter(Weapon weapon, Armor armor, int armorClass, int attackMod, int defenseMod) {
    this.weapon = weapon;
    this.armor = armor;
    this.armorClass = armorClass;
    this.attackMod = attackMod;
    this.defenseMod = defenseMod;
  }

  public int getTotalArmor() {
    return totalArmor = armorClass + defenseMod + armor.getArmorMod();
  }

  public int getTotalAttack() {
    return totalAttack = attackMod + weapon.getAttackMod();
  }

  public Weapon getWeapon() {
    return weapon;
  }

  public Armor getArmor() {
    return armor;
  }

  public int getArmorClass() {
    return armorClass;
  }

  public int getAttackMod() {
    return attackMod;
  }

  public int getDefenseMod() {
    return defenseMod;
  }
}
