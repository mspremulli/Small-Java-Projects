import java.util.ArrayList;

public class Hotel {
  private ArrayList<Guest> currentGuests;
  private ArrayList<Guest> previousGuests;
  private String hotelName;
  private int guestId;

  public Hotel(String hotelName) {
    this.hotelName = hotelName;
    currentGuests = new ArrayList<>();
    previousGuests = new ArrayList<>();
    guestId = 0;
  }

  public void addGuest(String guestName){
    currentGuests.add(new Guest(guestName, guestId++));
  }

  //TODO allow for multiple guests with same name
  public void checkoutGuest(String guestName){
    guestId--;
    int guestIndex = 0;
    for (Guest currentGuest : currentGuests) {
      if (currentGuest.getName().equals(guestName)) {
        guestIndex = currentGuest.getGuestId();
        break;
      }
    }

    previousGuests.add(currentGuests.get(guestIndex).checkOut());
  }

}
