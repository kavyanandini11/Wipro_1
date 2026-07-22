import java.util.ArrayList;
import java.util.List;

public class NumbersOnlyList {

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(3.14f);
        numbers.add(2.71828);
        numbers.add(100L);

        System.out.println("Numbers stored in the list: " + numbers);

        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        System.out.println("Sum of all numbers: " + sum);
    }
}
