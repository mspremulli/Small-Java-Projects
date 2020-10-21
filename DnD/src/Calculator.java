import Character.PlayerCharacter;
public class Calculator {
  private static final int CRITICAL_MISS = 1;
  private static final int CRITICAL_HIT = 20;
  
  public static int attack(int armorClass, int defenseMod, int attackMod, String damageDice){
    Die d20 = new Die(20);
    int d20Roll = d20.rollDie();
    int damageRoll = 0;

    if (d20Roll == CRITICAL_MISS) {
      System.out.println("Critical Miss!");
    } else if (d20Roll == CRITICAL_HIT) {
      damageRoll = rollDamageDice(damageDice);
      int secondDamageRoll = rollDamageDice(damageDice);
      System.out.printf("Critical Hit! %d + %d = %d damage%n", damageRoll, secondDamageRoll, damageRoll + secondDamageRoll);
    } else if (d20Roll + attackMod <= defenseMod + armorClass) {
      System.out.println("Miss 0 damage");
    } else {
      damageRoll = rollDamageDice(damageDice);
      System.out.printf("Hit %d damage dealt%n", damageRoll);
    }

    return damageRoll;
  }

  public static int attack(PlayerCharacter attacker, PlayerCharacter defender){
   return attack(
           defender.getArmorClass(),
           defender.getDefenseMod() + defender.getArmor().getArmorMod(),
           attacker.getAttackMod() + attacker.getWeapon().getAttackMod(),
           attacker.getWeapon().getDamageDice()
   );
  }

  private static int rollDamageDice(String roll){
    String[] damageDice = roll.split("d");
    int damageTotal = 0;

    for (int i = 0; i < Integer.parseInt(damageDice[0]); i++) {
      damageTotal += new Die(Integer.parseInt(damageDice[1])).rollDie();
    }

    return damageTotal;
  }
}
