package com.group13.cafe94;

public class EatIn extends Order{
    private String waiterName;
    private int tableNumber;



    public EatIn(String waiterName, int tableNumber) {
        this.waiterName = waiterName;
        this.tableNumber = tableNumber;
    }



    public void persistEatInOrderData(){

    }



    public int getTableNumber() {
        return tableNumber;
    }



    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }



    public String getWaiterName() {
        return waiterName;
    }



    public void setWaiterName(String waiterName) {
        this.waiterName = waiterName;
    }
}