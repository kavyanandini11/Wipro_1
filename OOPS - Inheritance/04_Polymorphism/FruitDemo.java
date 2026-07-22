public class FruitDemo {

    public static void main(String[] args) {
        Fruit genericFruit = new Fruit("Mango", "rich and sweet", "large");
        Fruit apple = new Apple("medium");
        Fruit orange = new Orange("small");

        genericFruit.eat();
        apple.eat();
        orange.eat();
    }
}
