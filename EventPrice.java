import java.util.Scanner;

public class EventPrice {
  public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    int guestNo;

    System.out.print("Enter the number of guest: ");
    guestNo = user.nextInt();

    int price = 35;
    int total = price * guestNo;
    //Motto as a welcome message
    System.out.println("*********************************************************\n*\t\t\t\t\t\t\t*\n*\tCarly's makes the food that makes it a party.   *\n*\t\t\t\t\t\t\t*\n*********************************************************");

    //Calculations for guests
    System.out.println("The number of guest attending are " + guestNo + " the price per guest is $" + price + " the total is $" + total);

    boolean isLargeEvent = (guestNo >= 50);
    System.out.println(isLargeEvent);
    user.close();
  }
}
