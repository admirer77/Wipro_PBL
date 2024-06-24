import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MonthYear {
    public static void main(String[] args) {
        List<String> months = new ArrayList<>();

        Collections.addAll(months,"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");

        System.out.println("Months of the year :");

        for (String month : months) {
            System.out.println(month);
        }
    }
}
