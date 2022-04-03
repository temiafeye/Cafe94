package com.group13.cafe94;

import java.util.ArrayList;

public class Customer{
    private String firstName;
    private String lastName;
    private String customerID;
    private String address;
    private ArrayList<Order> ordersHistory;

    
    public Customer(String firstName, String lastName, String customerID, String address,
            ArrayList<Order> ordersHistory) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.setCustomerID(customerID);
        this.address = address;
        this.ordersHistory = ordersHistory;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Order> getOrdersHistory() {
        return ordersHistory;
    }

    public String getOrderIDsAsCommaSep(){
        String res = "";
        for(Order o : ordersHistory){
            res += o.getOrderID() + ",";
        }
        return res;
    }

    public void setOrdersHistory(ArrayList<Order> ordersHistory) {
        this.ordersHistory = ordersHistory;
    }

    public void persistData(){
        String sql = "INSERT INTO customers(customer_ID,first_name,last_name,address,order_ID_List)";
        sql += " VALUES("+getCustomerID()+","+getFirstName()+","+getLastName()+","+getAddress()+","+getOrderIDsAsCommaSep()+")";
        System.out.println("Data Inserted : " +DataPersistanceHandler.persistToSpecificTable(sql));
    }
}