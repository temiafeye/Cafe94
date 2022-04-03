package com.group13.cafe94;

public class Takeaway extends Order{
    private String pickUpTime;

    public Takeaway(String pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public void persistTakeawayOrderData(){

    }

    public String getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(String pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

}