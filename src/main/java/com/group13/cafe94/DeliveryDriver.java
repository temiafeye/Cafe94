package com.group13.cafe94;

public class DeliveryDriver extends Staff{
    public DeliveryDriver(String firstName, String lastName, int hoursToWork, int hoursWorked) {
        super(firstName, lastName, hoursToWork, hoursWorked);
    }

    public void isDelivered(Delivery delivery, boolean status){
        delivery.setDeliveryStatus(status);
    }
}