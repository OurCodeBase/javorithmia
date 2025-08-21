public class Patterns {
  public static void main(String[] args) {
    
    int columns = 5;
    int rows = 4;

    // FILLED RECTANGLE
    /*
    for (int i = 0; i < columns; i++) {
      for (int j = 0; j < rows; j++) {
        System.out.print("@");
      }
      System.out.println();
    }
    */

    // HOLLOW RECTANGLE
    /*
    for (int i = 1; i <= columns; i++) {
      for (int j = 1; j <= rows; j++) {
        boolean bool = (i == 1 || j == 1 || i == columns || j == rows);
        if (bool) System.out.print("@");
        else System.out.print(" ");
      }
      System.out.println();
    }
    */

    // PIRAMID
    /*
    for (int i = 1; i <= columns; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    */

    // INVERTED PIRAMID
    /*
    for (int i = columns; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    */

    // INVERTED-FLIPPED PIRAMID
    /*
    for (int i = columns; i > 0; i--) {
      for (int j = 1; j <= columns; j++) {
        if (j < i) System.out.print(" ");
        else System.out.print("*");
      }
      System.out.println();
    }
    */

    // NUMBER PIRAMID
    /*
    for (int i = 1; i <= columns; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j); 
      }
      System.out.println();
    }
    */

    // INVERTED NUMBER PIRAMID
    /*
    for (int i = columns; i > 0; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
    */

    // FLOYED'S TRIANGLE
    /*
    int f = 0;
    for (int i = 1; i <= columns; i++) {
      for (int j = 1; j <= i; j++) {
        f += 1;
        System.out.print(f);
      }
      System.out.println();
    }
    */

    // BOOLEAN TRIANGLE
    /*
    boolean f = true;
    for (int i = 1; i <= columns; i++) {
      boolean o = !f;
      for (int j = 1; j <= i; j++) {
        if (o) System.out.print(1);
        else System.out.print(0);
        o = !o;
      }
      f = !f;
      System.out.println();
    }
    */

    // BOOLEAN TRIANGLE USING MATRIX
    for (int i = 1; i <= columns; i++) {
      for (int j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0) System.out.print(1);
        else System.out.print(0);
      }
      System.out.println();
    }
  }
}
