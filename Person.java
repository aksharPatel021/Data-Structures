/*
 * Deep copy demo: Arrays
*/

public class Person implements Cloneable {
    private String firstName;
    private String lastName;
    
    Person(){
        this("unknown", "unknown");
    }
    
    Person(String f, String l){
        firstName = f;
        lastName = l;
    }
    
    public Object clone() throws CloneNotSupportedException{
        return super.clone();                   
    }
    
    public void setFirstName(String f){
        firstName = f;
    }
    
    public void setLastName(String l){
        lastName = l;
    }
    
    public String toString(){
        return firstName + " " + lastName;
    }
}
