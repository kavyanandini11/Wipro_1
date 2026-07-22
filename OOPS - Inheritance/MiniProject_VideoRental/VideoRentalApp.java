public class VideoRentalApp {

    public static void main(String[] args) {
        VideoRentalInventory inventory = new VideoRentalInventory();

        inventory.addItem(new Movie("M01", "Inception", "Sci-Fi", 40.0, 3));
        inventory.addItem(new Movie("M02", "The Lion King", "Animation", 30.0, 2));
        inventory.addItem(new Movie("M03", "Interstellar", "Sci-Fi", 45.0, 1));
        inventory.addItem(new VideoGame("G01", "FIFA 24", "PS5", 60.0, 2));
        inventory.addItem(new VideoGame("G02", "Minecraft", "PC", 25.0, 4));

        inventory.displayInventory();

        System.out.println("\n>> Processing rentals");
        inventory.rentItem("M03");
        inventory.rentItem("M03");
        inventory.rentItem("G01");

        System.out.println("\n>> Processing a return");
        inventory.returnItem("M03");

        System.out.println();
        inventory.displayInventory();
    }
}
