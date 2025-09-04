import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    list.add(1, 50);

    Collections.sort(list);
    list.forEach(arg0 -> {
      System.out.println(arg0);
    });
  }
}
