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
public class PartB {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(new File("test/PartB.txt"));
        LinkedBucketChainHashMap<String, Order> hashMap = new LinkedBucketChainHashMap<>();
        Order order;
        while(scan.hasNextLine()){
            order = new Order(scan.next(), scan.next(), scan.nextDouble());
            String s = order.getOrderID();
            hashMap.put(s, order);
        }
        System.out.println("The orders are: ");
        for(Order o : hashMap.values()){
            System.out.println(o);
        }
        
        System.out.println("\nTotal number of orders are: "+hashMap.size());
        System.out.println("\nThe total collisions are: "+hashMap.numCollisions());
    }
}
