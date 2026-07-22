public class Employee {

    private int id;
    private String name;
    private double salary;
    private String location;

    public Employee(int id, String name, double salary, String location) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + location + ", Rs." + salary + ")";
    }
}
