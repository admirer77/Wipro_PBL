import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PrintAll {

    ArrayList<String> stringList = new ArrayList<>();

    public void printAll() {
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        PrintAll elements = new PrintAll();

        Collections.addAll(elements.stringList, "India", "USA", "Australia", "April", "Pak", "Sri Lanka");

        elements.printAll();
    }
}
