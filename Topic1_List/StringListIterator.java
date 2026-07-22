import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringListIterator {

    private List<String> items = new ArrayList<>();

    public void add(String value) {
        items.add(value);
    }

    public void printAll() {
        Iterator<String> iterator = items.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        StringListIterator list = new StringListIterator();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        System.out.println("Printing all elements using an Iterator:");
        list.printAll();
    }
}
