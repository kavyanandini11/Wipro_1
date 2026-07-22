import java.util.ArrayList;
import java.util.List;

public class VideoRentalInventory {

    private List<RentalItem> items = new ArrayList<>();

    public void addItem(RentalItem item) {
        items.add(item);
    }

    public RentalItem findById(String itemId) {
        for (RentalItem item : items) {
            if (item.getItemId().equalsIgnoreCase(itemId)) {
                return item;
            }
        }
        return null;
    }

    public void displayInventory() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("                          CURRENT INVENTORY                               ");
        System.out.println("--------------------------------------------------------------------------");
        for (RentalItem item : items) {
            System.out.println(item.getDetails());
        }
        System.out.println("--------------------------------------------------------------------------");
    }

    public void rentItem(String itemId) {
        RentalItem item = findById(itemId);
        if (item == null) {
            System.out.println("Rent failed: no item found with id " + itemId);
            return;
        }
        if (item.getCopiesAvailable() <= 0) {
            System.out.println("Rent failed: '" + item.getTitle() + "' is out of stock.");
            return;
        }
        item.setCopiesAvailable(item.getCopiesAvailable() - 1);
        System.out.println("Rented '" + item.getTitle() + "'. Copies left: " + item.getCopiesAvailable());
    }

    public void returnItem(String itemId) {
        RentalItem item = findById(itemId);
        if (item == null) {
            System.out.println("Return failed: no item found with id " + itemId);
            return;
        }
        item.setCopiesAvailable(item.getCopiesAvailable() + 1);
        System.out.println("Returned '" + item.getTitle() + "'. Copies now: " + item.getCopiesAvailable());
    }
}
