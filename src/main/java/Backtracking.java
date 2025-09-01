public class Backtracking {
  public static void printPermutation(String s, int n,  String perm) {
    // Time complexity = (n * n!)
    if (s.length() == 0) {
      System.out.println(perm);
      return;
    }
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      String ns = s.substring(0, i) + s.substring(i + 1);
      printPermutation(ns, n + 1, perm + c);
    }
  }
  public static void main(String[] args) {
    String person = "ABC";
    printPermutation(person, 0, "");
  }
}
