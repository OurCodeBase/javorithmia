import java.util.Scanner;

public class Conditions {
  public static void main(String[] args) {
    /*
    while (true) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number: ");
      int number = sc.nextInt();
      if (number % 2 == 0) System.out.println("Even");
      else System.out.println("Odd");
    }
    */

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter button [1]: ");
    int number = sc.nextInt();
    switch (number) {
      case 1:
        System.out.println("CLICKED: " + number);
        break;
      default: System.out.println("NOT CLICKED ONE!"); 
    }
  }
}
