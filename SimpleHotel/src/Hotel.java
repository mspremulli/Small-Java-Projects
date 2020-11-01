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

  //TODO allow for multiple guests with same name(currently finds fist match)
  public void checkoutGuest(String guestName){

    boolean foundGuest = false;
    int guestIndex = 0;
    int currentGuestsSize = currentGuests.size();

    while (guestIndex < currentGuestsSize) {
      Guest currentGuest = currentGuests.get(guestIndex);
      if (currentGuest.getName().equals(guestName)) {
        foundGuest = true;
        break;
      }

      guestIndex++;
    }

    if(foundGuest){
      previousGuests.add(currentGuests.get(guestIndex).checkOut());
      currentGuests.remove(guestIndex);
      guestId--;
    }
    else{
      System.err.println("guest not found");
    }
  }


  public void displayCurrentGuests(){
    for (Guest guest:currentGuests ) {
      System.out.println(guest.getName() +" arrived on " + guest.getCheckInDate());
    }
  }

}
