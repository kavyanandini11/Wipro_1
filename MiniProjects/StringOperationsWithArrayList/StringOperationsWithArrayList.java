import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringOperationsWithArrayList {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Delhi");
        names.add("Mumbai");
        names.add("Chennai");
        names.add("Kolkata");
        names.add("Mumbai");

        System.out.println("Original list : " + names);
        System.out.println("Size          : " + names.size());
        System.out.println("Contains Delhi: " + names.contains("Delhi"));
        System.out.println("Index of Chennai: " + names.indexOf("Chennai"));

        names.remove("Mumbai");
        System.out.println("After removing one 'Mumbai': " + names);

        names.set(0, "New Delhi");
        System.out.println("After replacing first element: " + names);

        Collections.sort(names);
        System.out.println("Sorted list   : " + names);

        System.out.print("Iterating     : ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
