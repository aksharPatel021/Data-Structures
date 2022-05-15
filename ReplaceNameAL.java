/* 
 * LinkedPositionslList demo:  Replace all instances of "Tom" with "Harry" 
 * Requires List, PositionalList 
 */

public class ReplaceNameAL {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add(list.size(),"Ginny");
        list.add(list.size(),"Tom");    
        list.add(list.size(),"Ron");
        list.add(list.size(),"Hermione");
        list.add(list.size(),"Fred");
        list.add(list.size(),"George");
        list.add(list.size(),"Tom");
        list.add(list.size(),"Neville");
        list.add(list.size(),"Tom");
        list.add(list.size(),"Seamus");
        
        for (int i=0; i<list.size(); i++)
            if (list.get(i).equals("Tom"))
                list.set(i, "Harry");
                         
        System.out.println(list);             
    }      
}
