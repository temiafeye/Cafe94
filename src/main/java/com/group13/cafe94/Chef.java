package com.group13.cafe94;

public class Chef extends Staff{
    
    

    public Chef(String firstName, String lastName, int hoursToWork, int hoursWorked) {
        super(firstName, lastName, hoursToWork, hoursWorked);
    }

    public void setOrderStatus(Order order, String status){
        order.setOrderStatus(status);
    }
}