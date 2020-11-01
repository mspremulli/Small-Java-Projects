import java.time.LocalDate;

public class Guest {
  private String name;
  private int roomNumber;
  private LocalDate checkInDate;
  private LocalDate checkOutDate;


  public Guest(String name, int roomNumber) {
    this.name = name;
    this.roomNumber = roomNumber;
    checkInDate = LocalDate.now();
  }

  //to check in guests early
  public Guest(String name, int roomNumber, LocalDate checkInDate) {
    this.name = name;
    this.roomNumber = roomNumber;
    this.checkInDate = checkInDate;
  }

  public void checkOut(){
      checkOutDate = LocalDate.now();
  }

}
