public class Movie extends RentalItem {

    private String genre;
    private double pricePerDay;

    public Movie(String itemId, String title, String genre, double pricePerDay, int copiesAvailable) {
        super(itemId, title, copiesAvailable);
        this.genre = genre;
        this.pricePerDay = pricePerDay;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public double getRentalPricePerDay() {
        return pricePerDay;
    }

    @Override
    public String getCategory() {
        return "Movie";
    }
}
