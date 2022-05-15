/**
 * Stack example
 * Requires Stack interface, LinkedStack implementation and SinglyLinkedList
 */

import java.util.ArrayList;

public class Palindrome {
    public static void main (String args[]){
        String[] words = {"madam", "robot", "a", "kayak", "deep", "rotator", "chocolate", "mom"};
        Stack<Character> s = new LinkedStack<>();
        for (String w : words){                                           
            for (int i=0; i<w.length(); i++){
                s.push(w.charAt(i));
            }
            String str = "";
            while (!s.isEmpty()){
                str = str + s.pop();
            }             
        System.out.println("\"" + w + "\" IS " + (w.equals(str) ? "" : "NOT ") + "a palindrome");
        }
    }

    
}
