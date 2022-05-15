
public class ReplaceName {
    public static void main(String[] args){
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
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
        
        SinglyLinkedList<String> list2 = new SinglyLinkedList<>();
        
        while (!list.isEmpty()){
            if(list.first().equals("Tom")){
                list.removeFirst();
                list2.addLast("Harry");
            }
            else           
                list2.addLast(list.removeFirst());
        }        
        System.out.println(list2);                
    }
    
    
}
