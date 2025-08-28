import java.util.HashSet;

public class RecursionAdv {
  public static void solveHanoiDisk(int n, String src, String hlp, String dst) {
    if (n == 1) {
      System.out.println("[TRANSFER]: " + n + " @ " + src + " -> " + dst);
      return;
    }
    solveHanoiDisk(n - 1, src, dst, hlp);
    System.out.println("[TRANSFER]: " + n + " @ " + src + " -> " + dst);
    solveHanoiDisk(n - 1, hlp, src, dst);
  }
  public static void printReverseString(int n, String s) {
    System.out.print(s.charAt(n));
    if (n == 0) {
      System.out.println();
      return;
    }
    printReverseString(n - 1, s);
  }
  public static int first = -1;
  public static int last = -1;
  public static void findOccurance(String str, int i, char c) {
    if (i == str.length()) {
      System.out.println("[FIRST]: " + first + "\n[LAST]: " + last);
      return;
    }
    char mChar = str.charAt(i);
    if (mChar == c) {
      if (first == -1) {
        first = i;
      } else {
        last = i;
      }
    }
    findOccurance(str, i + 1, c);
  }
  public static boolean isElementsSorted(int[] a, int i) {
    if (i == a.length - 1) return true;
    if (a[i] >= a[i + 1]) return false;
    return isElementsSorted(a, i + 1);
  }
  public static void moveAllX(String str, int i, int count, String mStr) {
    if (i == str.length()) {
      for (int j = 0; j < count; j++) mStr += 'x';
      System.out.println(mStr);
      return;
    }
    char c = str.charAt(i);
    if (c == 'x') count++;
    else mStr += c;
    moveAllX(str, i + 1, count, mStr);
  }
  public static boolean[] map = new boolean[26];
  public static void printDistinct(String s, int i, String ns) {
    if (i == s.length()) {
      System.out.println(ns);
      return;
    }
    char c = s.charAt(i);
    if (map[c - 'a'] != true) {
      ns += c;
      map[c - 'a'] = true;
    }
    printDistinct(s, i + 1, ns);
  }
  public static void subSequence(String s, int i, String ns) {
    if (i == s.length()) {
      System.out.println(ns);
      return;
    }
    char c = s.charAt(i);
    // To be
    subSequence(s, i + 1, ns + c);
    // To not be
    subSequence(s, i + 1, ns);
  }
  public static void subSequenceUnique(String s, int i, String ns, HashSet<String> h) {
    if (i == s.length()) {
      if (!h.contains(ns)) {
        System.out.println(ns);
        h.add(ns);
      }
      return;
    }
    char c = s.charAt(i);
    // To be
    subSequenceUnique(s, i + 1, ns + c, h);
    // To not be
    subSequenceUnique(s, i + 1, ns, h);
  }
  public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
  public static void printComb(String s, int i, String cn) {
    // cn = combination;
    if (i == s.length()) {
      System.out.println(cn);
      return;
    }
    char c = s.charAt(i);
    String m = keypad[c - '0']; // mapping
    for (int j = 0; j < m.length(); j++) {
      printComb(s, i + 1, cn + m.charAt(j));
    }
  }
  public static void main(String[] args) {
    // String str = "abcxxabccc";
    // int[] a = {1, 2, 3, 4};
    // solveHanoiDisk(3, "S", "H", "D");
    // printReverseString(str.length() - 1, str);
    // findOccurance(str, 0, 'l');
    // System.out.println(isElementsSorted(a, 0));
    // moveAllX("abcxdfxfx", 0, 0, "");
    // printDistinct(str, 0, "");
    // subSequence("abc", 0, "");
    //
    // HashSet<String> set = new HashSet<>();
    // subSequenceUnique("aaa", 0, "", set);
    // printComb("23", 0, "");
  }
}
