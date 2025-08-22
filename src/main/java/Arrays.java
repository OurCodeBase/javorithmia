public class Arrays {
  public static void main(String[] args) {
    // To create array with defined size.
    int a[] = new int[10];
    // fixed size array, you cannot add more.
    int b[] = { 10, 20, 30 };
    for (int i = 0; i < b.length; i++) {
      System.out.println(b[i]);
    }
  }
}
