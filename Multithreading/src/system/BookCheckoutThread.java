package system;

public class BookCheckoutThread extends Thread {
  private BookInventory bookInventory;
  private String checkOutName;
  int numOfBooks;

  public BookCheckoutThread(BookInventory bookInventory, String checkOutName, int numOfBooks) {
    this.bookInventory = bookInventory;
    this.checkOutName = checkOutName;
    this.numOfBooks = numOfBooks;
  }

  @Override
  public void run(){
    bookInventory.checkoutBook(checkOutName, numOfBooks);
  }
}
