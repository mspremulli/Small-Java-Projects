import java.util.ArrayList;

public class Hotel {
  private ArrayList<Guest> currentGuests;
  private ArrayList<Guest> previousGuests;
  private String hotelName;
  private int currentRoomNumber;

  public Hotel(String hotelName) {
    this.hotelName = hotelName;
    currentGuests = new ArrayList<>();
    previousGuests = new ArrayList<>();
    currentRoomNumber = 1;
  }

  private void addGuest(String guestName){
    currentGuests.add(new Guest(guestName, currentRoomNumber++));
  }

  private void checkoutGuest(Guest guest){
    currentRoomNumber--;
    Guest thisGuest = currentGuests.remove(currentGuests.indexOf(guest));
    thisGuest.checkOut();
    previousGuests.add(thisGuest);
  }

}
