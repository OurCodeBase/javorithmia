public class Strings {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("Hello");
    str.append(" World");
    str.setCharAt(0, 'C');
    System.out.println(str);
  }
}
