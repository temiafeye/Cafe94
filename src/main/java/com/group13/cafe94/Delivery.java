package com.group13.cafe94;

public class Delivery extends Order{
    private String address;
    private String estimatedTime;
    private boolean deliveryApprovalStatus;
    private boolean deliveryStatus;


    public Delivery(String address, String estimatedTime, boolean deliveryApprovalStatus, boolean deliveryStatus) {
        this.address = address;
        this.estimatedTime = estimatedTime;
        this.deliveryApprovalStatus = deliveryApprovalStatus;
        this.deliveryStatus = deliveryStatus;
    }


    public void persistDeliveryOrderData(){

    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getEstimatedTime() {
        return estimatedTime;
    }


    public void setEstimatedTime(String estimatedTime) {
        this.estimatedTime = estimatedTime;
    }


    public boolean isDeliveryApprovalStatus() {
        return deliveryApprovalStatus;
    }


    public void setDeliveryApprovalStatus(boolean deliveryApprovalStatus) {
        this.deliveryApprovalStatus = deliveryApprovalStatus;
    }


    public boolean isDeliveryStatus() {
        return deliveryStatus;
    }


    public void setDeliveryStatus(boolean deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

}