import Character.PlayerCharacter;

public class PlayDnD {
  public static void main(String[] args){
    PlayerCharacter attacker = new PlayerCharacter();
    PlayerCharacter defender = new PlayerCharacter();

    Calculator.attack(1,2,3,"3d4");
    Calculator.attack(defender.getArmor().getArmorMod(),1,attacker.getWeapon().getAttackMod(),"2d4");
    Calculator.attack(attacker,defender);
    Calculator.attack(attacker,defender);
  }
}
