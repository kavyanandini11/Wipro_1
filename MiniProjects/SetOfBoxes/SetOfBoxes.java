import java.util.HashSet;
import java.util.Set;

public class SetOfBoxes {

    public static void main(String[] args) {
        Set<Box> boxes = new HashSet<>();
        boxes.add(new Box(2, 3, 4));
        boxes.add(new Box(5, 5, 5));
        boxes.add(new Box(2, 3, 4));
        boxes.add(new Box(1, 2, 3));
        boxes.add(new Box(5, 5, 5));

        System.out.println("Added 5 boxes, two pairs of which are identical.");
        System.out.println("Distinct boxes in the set: " + boxes.size());
        for (Box box : boxes) {
            System.out.println(box);
        }
    }
}
