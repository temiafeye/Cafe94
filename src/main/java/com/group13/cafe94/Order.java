package com.group13.cafe94;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Order{
    private int orderID;
    private String customerId;
    private String typeOfOrder;
    private String[] orderList;
    private String orderStatus;

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderList() {
        //returns a comma separate value of all the items in order list
        String ordList = "";
        for(String o : orderList){
            ordList += o + ",";
        }
        return ordList;
    }

    public void setOrderList(String[] orderList) {
        this.orderList = orderList;
    }

    public String getTypeOfOrder() {
        return typeOfOrder;
    }

    public void setTypeOfOrder(String typeOfOrder) {
        this.typeOfOrder = typeOfOrder;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String[] getMenu(){
        return Menu.getMenuItems();
    }

    public String[] getOutstandingOrders(){
        //pending, cancelled, completed
        List<String> outstandingOrders = new ArrayList<String>();

        String sql = "SELECT order_id FROM orders WHERE customer_id = "+getCustomerId();
        sql += " and orderStatus = "+ getOrderStatus();
        try {
            Connection con = DBConnectionHandler.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while ( rs.next() ) {
                String ord_id = rs.getString("order_id");
                outstandingOrders.add(ord_id);
            }
            con.close();
            String[] outsListArray = new String[ outstandingOrders.size() ];
            return outstandingOrders.toArray( outsListArray );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateOrderStatus(){
        // update the status of an order
        String sql = "UPDATE orders SET orderStatus="+getOrderStatus();
        sql += "WHERE order_id="+getOrderID();
        System.out.println("Status Updated : " +DataPersistanceHandler.persistToSpecificTable(sql));
    }

    public void placeOrder(){
        //insert an order into the database
        String sql = "INSERT INTO orders(order_id,customer_id,typeOfOrder,orderStatus,order_List)";
        sql += " VALUES("+getOrderID()+","+getCustomerId()+","+getTypeOfOrder()+","+getOrderStatus()+","+getOrderList()+")";
        System.out.println("Data Inserted : " +DataPersistanceHandler.persistToSpecificTable(sql));

    }


}