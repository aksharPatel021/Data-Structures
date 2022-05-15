/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments.Assignment_4;

import java.util.*;
import java.io.*;

/**
 *
 * @author Bhargav Patel 
 * 3098320
 */
public class PartA {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("test/PartA.txt"));
        Map<Character, Integer> probeHashMap = new ProbeHashMap<>();
        LetterComparator comp = new LetterComparator();
        String temp = "";
        Entry<Character, Integer>[] Arr;
//Scan the words for each Line.
        while (scan.hasNextLine()) {
            temp += scan.nextLine() + "\n";
        }
        
        System.out.println("The cyphered text is: \n"+temp);
// Start Working for Sorting and Decyphering.

        Arr = frequency(temp, probeHashMap);
        QuickSort sort = new QuickSort();
        sort.quickSortInPlace(Arr, comp, 0, Arr.length - 1);
     /*   for (int i = 0; i < Arr.length; i++) {
            for (Entry<Character, Integer> j : probeHashMap.entrySet()) {
                if (Arr[i].getKey().equals(j.getKey())) {
                    System.out.println(Arr[i].getKey() + " " + Arr[i].getValue());
                }
            }
        }
       */ int shiftValue = Character.getNumericValue(Arr[0].getKey()) - Character.getNumericValue('e');
        //System.out.println(shiftValue);

        decrypt(temp, shiftValue);

    }

    public static Entry<Character, Integer>[] frequency(String temp, Map<Character, Integer> probeHashMap) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < temp.length(); i++) {
            list.add(temp.charAt(i));
        }

        for (char c : list) {
            if (c != ' ' && c != '\n') {
                if (probeHashMap.get(c) != null) {
                    probeHashMap.put(c, probeHashMap.get(c) + 1);
                } else {
                    probeHashMap.put(c, 1);
                }
            }
        }
        Entry<Character, Integer>[] array = new Entry[probeHashMap.size()];
        int counter = 0;
        for (Entry<Character, Integer> entry : probeHashMap.entrySet()) {
            array[counter] = entry;
            counter++;
        }
        return array;
    }

    public static void decrypt(String temp, int shiftValue) {
        String decrypted = "";
        int dx = 0;
        char ch = 0 ;
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) != '\n' && temp.charAt(i) != ' ' ) {
                //Subtracting with 10 so that it gets me back in the range of 0-25 instead of 1-26 which would happen in case if I choose to subtract by 9.
                int encryptedChar = (Character.getNumericValue(temp.charAt(i)) - 10);
                if ((encryptedChar - shiftValue) > 0) {
                    dx = (encryptedChar - shiftValue) % 26;
                    dx = dx + 97;
                } else {
                    dx = ((encryptedChar - shiftValue) + 26) % 26;
                    dx = dx + 97;
                }
                ch = (char) (dx);
                decrypted += ch;
            }else{ 
                if(temp.charAt(i) == '\n'){
                decrypted += '\n';
            } else{
                decrypted += ' ';
                }
            }
        }
        System.out.println("\n\nThe decyphered text is: \n"+decrypted);
    }

}
