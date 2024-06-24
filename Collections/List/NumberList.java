import java.util.ArrayList;
import java.util.List;

public class NumberList<T extends Number> {
    private List<T> numberList = new ArrayList<>();

    public void addNumber(T number) {
        numberList.add(number);
    }

    public void printAll() {
        for (T number : numberList) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        NumberList<Number> numbers = new NumberList<>();
        
        numbers.addNumber(10);        // Integer
        numbers.addNumber(15.5);      // Double
        numbers.addNumber(20.3f);     // Float
        numbers.addNumber(45L);       // Long

        System.out.println("All numbers:");
        numbers.printAll();
    }
}
