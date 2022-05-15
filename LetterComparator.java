/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments.Assignment_4;

/**
 *
 * @author Bhargav Patel
 * 3098320
 */
import java.util.*;
public class LetterComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        int check = 0;
        Entry<Character,Integer> c1 = (Entry) o1;
        Entry<Character,Integer> c2 = (Entry) o2;
        if(c1.getValue() < c2.getValue()) { return check = 1;}
        else if(c1.getValue() == c2.getValue()){ return check = 0;}
        else 
            return check = -1;
    }
   
}
