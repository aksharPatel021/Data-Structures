
public class DynamicDemo {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(2);
        System.out.println ("array length after initialization: " + list.getCapacity());
        list.add(list.size(), 1);
        list.add(list.size(), 2);
        System.out.println ("array length after adding 2: " + list.getCapacity());        
        list.add(list.size(), 3);
        System.out.println ("array length after adding 3: " + list.getCapacity());    
        list.add(list.size(), 4);
        list.add(list.size(), 5);
        System.out.println ("array length after adding 5: " + list.getCapacity());        

    }
}
