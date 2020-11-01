import java.time.LocalDate;

public class Guest {
  private final String name;
  private final int guestId;
  private int roomNumber;
  private LocalDate checkInDate;
  private LocalDate checkOutDate;

  //todo allow for specific rooms to be chosen. currently matches room number to guestID
  public Guest(String name, int guestId) {
    this.name = name;
    this.guestId = guestId;
    roomNumber = guestId;
    checkInDate = LocalDate.now();
  }

  //todo make constructor to allow guests to check in early

  public Guest checkOut(){
      checkOutDate = LocalDate.now();
      return this;
  }

  public String getName() {
    return name;
  }

  public LocalDate getCheckInDate() {
    return checkInDate;
  }
}
