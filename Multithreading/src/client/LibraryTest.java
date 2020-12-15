package client;

import system.BookCheckoutThread;
import system.BookInventory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibraryTest {
  public static void main(String[] args) throws InterruptedException {
    BookInventory bookInventory = new BookInventory();
    BookCheckoutThread thread1 = new BookCheckoutThread(bookInventory, "Margie",3);
    BookCheckoutThread thread2 = new BookCheckoutThread(bookInventory, "Mike",4);
    BookCheckoutThread thread3 = new BookCheckoutThread(bookInventory, "Gabriel",1);
    BookCheckoutThread thread4 = new BookCheckoutThread(bookInventory, "Tom",5);
    BookCheckoutThread thread5 = new BookCheckoutThread(bookInventory, "Arniel",2);
    BookCheckoutThread thread6 = new BookCheckoutThread(bookInventory, "Cliff",8);
    List<Thread> threadList = new ArrayList<>(Arrays.asList(thread1,thread2,thread3,thread4,thread5,thread6));

    for (Thread thread: threadList  ) {
      thread.start();
    }
  }
}
