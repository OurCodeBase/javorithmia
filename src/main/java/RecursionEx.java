import java.util.ArrayList;

public class RecursionEx {
  public static void printPermutations(String s, String perm) {
    if (s.length() == 0) {
      System.out.println(perm);
      return;
    }
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      // abc => a
      String ns = s.substring(0, i) + s.substring(i + 1);
      printPermutations(ns, perm + c);
    }
  }
  public static int countMazePaths(int i, int j, int m, int n) {
    if (i == (m - 1) && j == (n - 1)) {
      return 1;
    }
    int r = 0; // right
    int d = 0; // down
    // down
    if (i != (m - 1)) { // check the down matrix boundary.
      d = countMazePaths(i + 1, j, m, n);
    }
    // right
    if (j != (n - 1)) { // check the right matrix boundary.
      r = countMazePaths(i, j + 1, m, n);
    }
    return r + d;
  }
  public static int placeTiles(int n, int m) {
    if (n == m) return 2;
    if (n < m) return 1;
    int vertical = placeTiles(n - m, m);
    int horizontal = placeTiles(n - 1, m);
    return vertical + horizontal;
  }
  public static int inviteGuests(int n) { // need more practice.
    if (n <= 1) return 1;
    int a = inviteGuests(n - 1);
    int b = (n - 1) * inviteGuests(n - 2);
    return a + b;
  }
  public static void findSubsets(int n, ArrayList<Integer> set) {
    if (n == 0) {
      for (int i = 0; i < set.size(); i++) {
        System.out.print(set.get(i));
      }
      System.out.println();
      return;
    }
    // if the element choose to be.
    set.add(n);
    findSubsets(n - 1, set);
    // if the element choose not to be.
    set.remove(set.size() - 1);
    findSubsets(n - 1, set);
  }
  public static void main(String[] args) {
    // printPermutations("abc", "");
    // System.out.println(countMazePaths(0, 0, 3, 3));
    // System.out.println(placeTiles(4, 2));
    // System.out.println(inviteGuests(3));
    //
    ArrayList<Integer> set = new ArrayList<>();
    findSubsets(3, set);
  }
}
