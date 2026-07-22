import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOperations {

    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("TreeSet (natural order): " + fruits);

        System.out.println("Reversed order: " + fruits.descendingSet());

        System.out.print("Iterating with an Iterator: ");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println("Contains 'Mango'? " + fruits.contains("Mango"));
        System.out.println("Contains 'Grape'? " + fruits.contains("Grape"));
    }
}
