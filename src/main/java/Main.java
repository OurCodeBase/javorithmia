import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    char c = 'a';
    int number = 10;
    boolean bool = true;
    String hello = "Hello World";
    System.out.println(hello);

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = scanner.nextLine();
    System.out.println("Hello, " + name + "!");
  }
}