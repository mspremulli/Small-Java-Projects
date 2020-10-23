package Friends;

class Friend extends Acquaintance {
  String homeTown;

  public Friend(String name, String homeTown) {
    super(name);
    this.homeTown = homeTown;
  }

  @Override
  public void getStatus() {
    System.out.println(name + " is a friend and he is from " + homeTown + ".");
  }
}
