package Character;

public class Player implements IPlayer{
  private int totalArmor;
  private int totalAttack;
  private Weapon weapon;
  private Armor armor;
  private int armorClass;
  private int attackMod;
  private int defenseMod;

  @Override
  public int getTotalArmor() {
    return totalArmor = armorClass + defenseMod + armor.getArmorMod();
  }

  @Override
  public int getTotalAttack() {
    return totalAttack = attackMod + weapon.getAttackMod();
  }
}
