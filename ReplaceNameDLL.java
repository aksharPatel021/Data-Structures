/* 
 * Doubly linked list demo:  Replace all instances of "Tom" with "Harry" 
 * Requires DoublyLinkedList 
 */

public class ReplaceNameDLL {
    public static void main(String[] args){
        Deque<String> list = new DoublyLinkedList<>();
        list.addFirst("Ginny");
        list.addLast("Tom");    
        list.addLast("Ron");
        list.addLast("Hermione");
        list.addLast("Fred");
        list.addLast("George");
        list.addLast("Tom");
        list.addLast("Neville");
        list.addLast("Tom");
        list.addLast("Seamus");
        
        DoublyLinkedList<String> list2 = new DoublyLinkedList<>();
        
        while (!list.isEmpty()){
            if(list.last().equals("Tom")){
                list.removeLast();
                list2.addFirst("Harry");
            }
            else           
                list2.addFirst(list.removeLast());
        }        
        System.out.println(list2);   
        
    }
    
    
}
