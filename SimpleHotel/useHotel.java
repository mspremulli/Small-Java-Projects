public class useHotel {
  public static void main(String[] args){
    testHotel();
  }

  public static void testHotel(){
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
