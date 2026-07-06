import java.util.Scanner;

public class EventPriceWithMethods {
  public static void main(String[] args) {
    
    int guest = guestNumber();
    motto();
    calculator(guest);

  }

  //Method that gets the guest number
  public static int guestNumber(){
    Scanner user = new Scanner(System.in);
    int guestNo;

    System.out.print("Enter the number of guest: ");
    guestNo = user.nextInt();
    user.close();

    return guestNo;
  }

  //Method that prints the company's MOTTO
  public static void motto(){
    System.out.println("*********************************************************\n*\t\t\t\t\t\t\t*\n*\tCarly's makes the food that makes it a party.   *\n*\t\t\t\t\t\t\t*\n*********************************************************");
  }

  //Method that calculate the price due
  public static void calculator(int guestNo){
    final int PRICE = 35;
    int total = PRICE * guestNo;

    System.out.println("The number of guest attending are " + guestNo + " the price per guest is $" + PRICE + " the total is $" + total);

    boolean isLargeEvent = (guestNo >= 50);
    System.out.println(isLargeEvent);
  }

  //Method that gets event number
  public static String eventNumber(){
    Scanner user = new Scanner(System.in);
    String  eventNo;

    System.out.print("Enter the event number: ");
    eventNo = user.nextLine();
    user.close();

    return eventNo;
  }
}

