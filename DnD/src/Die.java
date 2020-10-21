public class Die {
  private final int numberOfSides;
  private int value;

  public Die() {
    numberOfSides = 6;
    value = 1;
  }

  public Die(int numberOfSides) {
    this.numberOfSides = numberOfSides;
    value = 1;
  }

  public Die(int numberOfSides, int value) {
    this.numberOfSides = numberOfSides;
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public int rollDie(){
    value = (int) (Math.random() * numberOfSides + 1);
    return value;
  }
}
