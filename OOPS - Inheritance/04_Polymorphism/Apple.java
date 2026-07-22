public class Apple extends Fruit {

    public Apple(String size) {
        super("Apple", "sweet and crunchy", size);
    }

    @Override
    public void eat() {
        System.out.println("The " + size + " Apple is " + taste + " - great for a quick snack.");
    }
}
