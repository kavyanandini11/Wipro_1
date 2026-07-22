public class Box {

    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Box box = new Box(4, 5, 6);
        System.out.println("Width  = " + box.width);
        System.out.println("Height = " + box.height);
        System.out.println("Depth  = " + box.depth);
        System.out.println("Volume of the box = " + box.volume());
    }
}
