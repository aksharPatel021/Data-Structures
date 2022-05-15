/* 
 * ArrayList demo:  Replace all instances of "Tom" with "Harry" 
 * Requires ArrayList 
 */

public class ReplaceNamePL {
    public static void main(String[] args){
        PositionalList<String> list = new LinkedPositionalList<>();
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
        
        Position p = list.first();
        while (list.after(p)!=null){
            if (p.getElement().equals("Tom"))
                list.set(p, "Harry");
            p = list.after(p);
        }       
        System.out.println(list);             
    }   
}
