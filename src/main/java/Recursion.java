public class Recursion {
  public static void printNumbers(int n) {
    if (n == 0) return;
    System.out.println(n);
    printNumbers(n - 1);
  }
  public static void sumOfNaturalNumbers(int n, int sum) {
    if (n == 0) {
      System.out.println(sum);
      return;
    }
    System.out.println(sum + " + " + n);
    sum += n;
    sumOfNaturalNumbers(n - 1, sum);
  }
  public static int getFactorial(int n) {
    if (n == 1) return 1;
    int f = getFactorial(n - 1);
    return n * f;
  }
  public static void printFibonacci(int a, int b, int n) {
    if (n == 0) return;
    int c = a + b;
    System.out.print(c + ", ");
    printFibonacci(b, c, n - 1);
  }
  public static int getPower(int x, int n) {
    // f(x,y) = x^y
    if (n == 0) return 1;
    if (n == 1) return x;
    int i = getPower(x, n - 1);
    return x * i;
  }
  public static int getPowerOptimized(int x, int n) {
    if (n == 0) return 1;
    if (n == 1) return x;
    boolean isEven = n % 2 == 0;
    if ( isEven ) return getPowerOptimized(x, n/2) * getPowerOptimized(x, n/2);
    else return getPowerOptimized(x, (n - 1)/2) * getPowerOptimized(x, (n - 1)/2) * x;
  }
  public static void main(String[] args) {
    // printNumbers(5);
    // sumOfNaturalNumbers(5, 0);
    // System.out.println(getFactorial(5));
    // printFibonacci(0, 1, 5);
    // System.out.println(getPower(2, 5));
    System.out.println(getPowerOptimized(2, 5));
  }
}
