public class CloningDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department("Development");
        Employee original = new Employee(101, "Arjun", department);
        Employee clone = (Employee) original.clone();

        System.out.println("Before modifying the original object");
        System.out.println("Original: " + original);
        System.out.println("Clone   : " + clone);

        original.setId(999);
        original.setName("Arjun Kumar");
        original.getDepartment().setName("Testing");

        System.out.println("\nAfter modifying the original object");
        System.out.println("Original: " + original);
        System.out.println("Clone   : " + clone);

        System.out.println("\nObservation:");
        System.out.println("The primitive 'id' and the String 'name' changed only in the original,");
        System.out.println("because those fields were copied by value into the clone.");
        System.out.println("But the 'department' name changed in BOTH objects, because the clone");
        System.out.println("and the original share the same Department reference - this is the");
        System.out.println("shallow-copy behaviour of Object.clone().");
    }
}
