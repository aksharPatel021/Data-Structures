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

public class Order {
    private String orderID = "";
    private String customerID = "";
    private double amount = 0.00;
    
    /**
     * Constructor
     * @param orderID stores the ID of the order.
     * @param customerID stores the ID of the customer.
     * @param amount stores the amount for the order.
     */
    
    public Order(String orderID, String customerID, double amount){
        this.orderID = orderID;
        this.customerID = customerID;
        this.amount = amount;
    }
    
    /**
     * Method to get the ID of the order.
     * @return the ID of the order is returned.
     */
    
    public String getOrderID(){
        return this.orderID;
    }
    
    /**
     * method to store the order ID without using constructor.
     * @param orderID Stores the ID of the order.
     */
    public void setOrderID(String orderID){
        this.orderID = orderID;
    }
    
    /**
     * Method to obtain the customer ID.
     * @return the Customer ID is returned.
     */
    public String getCustomerId(){
        return this.customerID;
    }
    
    /**
     * Method to set the customer ID without using constructor.
     * @param customerID stores the ID of the customer.
     */
    public void setCustomerID(String customerID){
        this.customerID = customerID;
    }
    
    /**
     * Method to get the amount for the order.
     * @return the Amount for the order.
     */
    public double getAmount(){
        return this.amount;
    }
    
    /**
     * Method to set Amount for order without using constructor.
     * @param amount stores the Amount for the order.
     */
    public void setAmount(double amount){
        this.amount = amount;
    }
    
    /**
     * Method to print to the console which has been override.
     * @return the string to print to the console.
     */
    @Override
    public String toString(){
        return "[" + this.orderID+ "," + this.customerID + "," + this.amount + "]";
    }
}
