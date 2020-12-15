package system;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BookInventory {
  private volatile int availableBooks = 10;

    public void checkoutBook(String name, int numOfBooks){
    System.out.println("currentInventory: " + availableBooks);
    if (availableBooks >= numOfBooks && numOfBooks > 0 ){
      System.out.println(name + " took out " + numOfBooks + " books");
      availableBooks -= numOfBooks;
    }
    else{
      System.out.println("Sorry we ran out of books");
    }
  }




//  Lock lock = new ReentrantLock();
//
//  public void checkoutBook(String name, int numOfBooks){
//    lock.lock();
//    try{
//      System.out.println("currentInventory: " + availableBooks);
//      if (availableBooks >= numOfBooks && numOfBooks > 0 ){
//        System.out.println(name + " took out " + numOfBooks + " books");
//        availableBooks -= numOfBooks;
//      }
//      else{
//        System.out.println("Sorry we ran out of books");
//      }
//    }
//
//    catch (Exception e){
//      System.out.println(e);
//    }
//
//    finally {
//      lock.unlock();
//      System.out.println("Thanks for coming");
//    }
//  }


//  public synchronized void checkoutBook(String name, int numOfBooks){
//    System.out.println("currentInventory: " + availableBooks);
//    if (availableBooks >= numOfBooks && numOfBooks > 0 ){
//      System.out.println(name + " took out " + numOfBooks + " books");
//      availableBooks -= numOfBooks;
//    }
//    else{
//      System.out.println("Sorry we ran out of books");
//    }
//  }
}
