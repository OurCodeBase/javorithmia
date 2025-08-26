public class Sortings {
  public static void printArray(int[] args) {
    for (int i = 0; i < args.length; i++) {
      System.out.print(args[i] + " ");
    }
    System.out.println();
  }
  public static void BubbleSort(int[] args) {
    for (int i = 0; i < args.length - 1; i++) {
      for (int j = 0; j < args.length - 1; j++) {
        if (args[j] > args[j+1]) {
          int tmp = args[j+1];
          args[j+1] = args[j];
          args[j] = tmp;
        }
      }
    }
    printArray(args);
  }
  public static void SelectionSort(int[] args) {
    for (int i = 0; i < args.length; i++) {
      int si = i; // index of smallest
      for (int j = i; j < args.length; j++) {
        if (args[j] < args[si]) si = j;
      }
      int tmp = args[i];
      args[i] = args[si];
      args[si] = tmp;
    }
    printArray(args);
  }
  public static void main(String[] args) {
    int a[] = { 24, 12, 3, 42, 1, 4, 5, 9, 0 };
    // BubbleSort(a);
    SelectionSort(a);
  }
}
