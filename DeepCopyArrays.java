public class DeepCopyArrays{
    public static void main (String[] args) throws CloneNotSupportedException{
        Person[] contacts = {new Person ("Harry", "Potter"), 
                            new Person ("Ron", "Weasley"),
                            new Person ("Hermione", "Granger"),
                            new Person ("Draco", "Malfoy")}; 
        // create deep copy
        Person[] guests = new Person[contacts.length];
        for (int k=0; k<contacts.length; k++)
            guests[k] = (Person)contacts[k].clone();
        
        // edit guest list
        guests[3].setFirstName("Luna");        
        guests[3].setLastName("Lovegood");
        
        // compare
        System.out.println("Contacts:");
        for (Person p : contacts){
            System.out.println(p);        
        }
        System.out.println("\nGuests:");
        for (Person p : guests){
            System.out.println(p);        
        }
    }
}
