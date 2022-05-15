
import java.util.Iterator;

public class PQ_Example {
    public static void main (String args[]){
        
        PriorityQueue<Integer, String> pq = new HeapPriorityQueue<>();       
        
        pq.insert(8, "Harry");
        pq.insert(6, "Ron");
        pq.insert(7, "Hermione");
        pq.insert(5, "Ginny");
        pq.insert(3, "Neville");
        pq.insert(0, "Luna");
        pq.insert(9, "Draco");
        System.out.print("Wait list: " + pq + "\n");
        
        while (pq.size() > 0){
            System.out.println("\nNext to the Hogwarts Express: " + pq.min());
            pq.removeMin();   
            System.out.println("Remaining on Wait List " + pq);
        }    
    }
    
}
