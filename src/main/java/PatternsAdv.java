public class PatternsAdv {
  public static void main(String[] args) {
    
    int columns = 4;

    // BUTTERFLY PATTERN
    /*
    // upper side
    for (int i = 1; i <= columns; i++) {
      // left stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      // middle spaces
      int a = 2 * (columns - i);
      for (int j = a; j > 0; j--) {
        System.out.print(" ");
      }
      // right stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      } 
      System.out.println();
    }
    // lower side
    for (int i = columns; i > 0; i--) {
      // left stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      // middle spaces
      int a = 2 * (columns - i);
      for (int j = a; j > 0; j--) {
        System.out.print(" ");
      }
      // right stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    */

    // NUMBER PIRAMID
    /*
    for (int i = 1; i <= columns; i++) {
      for (int j = 1; j <= (columns - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
    */

    // PALINDROMIC PIRAMID
    /*
    for (int i = 1; i <= columns ; i++) {
      for (int j = 1; j <= (columns - i); j++) {
        System.out.print("  ");
      }
      for (int j = i; j > 0; j--) {
        System.out.print(j + " ");
      }
      for (int j = 2; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    */

    // DIAMOND PATTERN
    for (int i = 1; i <= columns; i++) {
      for (int j = (columns - i); j > 0; j--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("💎");
      }
      System.out.println();
    }
    for (int i = columns; i > 0; i--) {
      for (int j = (columns - i); j > 0; j--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("💎");
      }
      System.out.println();
    }
  }
}
