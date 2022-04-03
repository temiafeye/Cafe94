package com.group13.cafe94;

public class Order{
    private int orderID;
    private String customerId;
    private String typeOfOrder;
    private String[] orderList;
    private String orderStatus;

    public void placeOrder(){

    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String[] getOrderList() {
        return orderList;
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
        return null;
    }

    public String[] getOutstandingOrders(){
        return null;
    }

    public void persistOrderData(){

    }


}