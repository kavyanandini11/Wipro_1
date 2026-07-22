import java.util.HashMap;
import java.util.Map;

public class ContactListHashMap {

    private Map<String, Integer> contacts = new HashMap<>();

    public void addContact(String name, int phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public boolean hasContact(String name) {
        return contacts.containsKey(name);
    }

    public Integer getNumber(String name) {
        return contacts.get(name);
    }

    public static void main(String[] args) {
        ContactListHashMap contactList = new ContactListHashMap();
        contactList.addContact("Ravi", 98765);
        contactList.addContact("Meena", 91234);
        contactList.addContact("Suresh", 90011);

        System.out.println("All contacts: " + contactList.contacts);
        System.out.println("Has 'Meena'?  " + contactList.hasContact("Meena"));
        System.out.println("Number of Ravi: " + contactList.getNumber("Ravi"));
        System.out.println("Has 'Kiran'?  " + contactList.hasContact("Kiran"));
    }
}
