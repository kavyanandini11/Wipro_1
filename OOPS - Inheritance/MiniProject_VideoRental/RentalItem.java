public abstract class RentalItem {

    private String itemId;
    private String title;
    private int copiesAvailable;

    public RentalItem(String itemId, String title, int copiesAvailable) {
        this.itemId = itemId;
        this.title = title;
        this.copiesAvailable = copiesAvailable;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    public abstract double getRentalPricePerDay();

    public abstract String getCategory();

    public String getDetails() {
        return String.format("[%s] %-22s | %-8s | Rs.%6.2f/day | Copies: %d",
                itemId, title, getCategory(), getRentalPricePerDay(), copiesAvailable);
    }
}
