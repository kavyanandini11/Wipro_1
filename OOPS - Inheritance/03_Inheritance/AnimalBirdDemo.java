public class AnimalBirdDemo {

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println("Animal:");
        animal.eat();
        animal.sleep();

        Bird bird = new Bird();
        System.out.println("\nBird:");
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
