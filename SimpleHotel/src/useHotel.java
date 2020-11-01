public class useHotel {
  public static void main(String[] args){
    Hotel hotel = new Hotel("My First Hotel");
    hotel.addGuest("Gracie");
    hotel.addGuest("Mike");
    hotel.addGuest("Iliana");

    hotel.displayCurrentGuests();
    hotel.checkoutGuest("Mike");
    System.out.println();
    hotel.displayCurrentGuests();

    hotel.checkoutGuest("Mike");
  }
}
