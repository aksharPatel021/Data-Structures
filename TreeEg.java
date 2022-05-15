public class TreeEg{
        
    public static void main(String[]args){
        LinkedBinaryTree<String> tree = new LinkedBinaryTree<>();
        Position p1 = tree.addRoot("JLB");
        Position p2 = tree.addLeft(p1, "Hayden");
        p1 = tree.addRight(p1, "Seerat");
        tree.addLeft(p2, "Komal");
        tree.addRight(p2, "Akshar");  
        tree.addLeft(p1, "Nikki");
        tree.addRight(p1, "Bhargav");        
        displayFamily(tree, tree.root());
        displayFamily(tree, p1);
        displayFamily(tree, p2);
        
    }
    /* Displays position and its 2 children */
    public static void displayFamily(LinkedBinaryTree lbt, Position<String> p){
        System.out.println("Children of " + p.getElement() + ": ");
        System.out.println(lbt.left(p) + " and " + lbt.right(p));     
    }
}
