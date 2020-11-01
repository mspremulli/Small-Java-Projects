import java.time.LocalDate;

public class Guest {
  private final String name;
  private final int guestId;
  private LocalDate checkInDate;
  private LocalDate checkOutDate;


  public Guest(String name, int guestId) {
    this.name = name;
    this.guestId = guestId;
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

  public int getGuestId() {
    return guestId;
  }
}
