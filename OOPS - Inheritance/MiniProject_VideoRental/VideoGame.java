public class VideoGame extends RentalItem {

    private String platform;
    private double pricePerDay;

    public VideoGame(String itemId, String title, String platform, double pricePerDay, int copiesAvailable) {
        super(itemId, title, copiesAvailable);
        this.platform = platform;
        this.pricePerDay = pricePerDay;
    }

    public String getPlatform() {
        return platform;
    }

    @Override
    public double getRentalPricePerDay() {
        return pricePerDay;
    }

    @Override
    public String getCategory() {
        return "Game";
    }
}
