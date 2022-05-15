 /**
 * Equivalence and Clone Demo
 * Requires SinglyLinkedList with equals() and implements Cloneable
 */

public class SLL_demo {
    public static void main(String[] args)throws CloneNotSupportedException{
    SinglyLinkedList<String> contacts = new SinglyLinkedList<>();
    contacts.addFirst("Harry");
    contacts.addFirst("Ron");
    contacts.addFirst("Hermione");
    contacts.addFirst("Draco");
    
    // create deep copy
    SinglyLinkedList<String> guests = contacts.clone();
    System.out.println("Contacts list same as Guest list? " + guests.equals(contacts));
    
    // edit guest list
    System.out.println("Switching Draco for Luna...");
    guests.removeFirst();
    guests.addFirst("Luna");
    
    // compare
    System.out.println("Contacts list same as Guest list? " + guests.equals(contacts));
    System.out.println(contacts);
    System.out.println(guests);
    }   
}
