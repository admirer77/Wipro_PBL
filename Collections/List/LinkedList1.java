import java.util.Collections;
import java.util.LinkedList;

public class LinkedList1{
  public static void main(String[] args) {
    LinkedList<String> list1 = new LinkedList<String>();

    Collections.addAll(list1, "Telangana","Tamil Nadu", "Kerala", "Karnataka", "AP");
    System.out.println(list1);
  }
}