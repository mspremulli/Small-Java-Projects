package Friends;

class BestFriend extends Friend {
  String favoriteSong;

  public BestFriend(String name, String homeTown, String favoriteSong) {
    super(name, homeTown);
    this.favoriteSong = favoriteSong;
  }

  @Override
  public void getStatus() {
    System.out.println(name + " is my best friend. He is from " + homeTown + " and his favorite song is " + favoriteSong + ".");
  }
}
