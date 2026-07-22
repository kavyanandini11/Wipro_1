public class Bird extends Animal {

    @Override
    public void eat() {
        System.out.println("The bird pecks at seeds and worms.");
    }

    @Override
    public void sleep() {
        System.out.println("The bird sleeps in its nest.");
    }

    public void fly() {
        System.out.println("The bird flies high in the sky.");
    }
}
