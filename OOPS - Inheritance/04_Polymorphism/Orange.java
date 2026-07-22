public class Orange extends Fruit {

    public Orange(String size) {
        super("Orange", "tangy and juicy", size);
    }

    @Override
    public void eat() {
        System.out.println("The " + size + " Orange is " + taste + " - full of vitamin C.");
    }
}
