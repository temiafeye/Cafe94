package com.group13.cafe94;

public class Booking{
    private String customerId;
    private String date;
    private String time;
    private int numberOfGuest;
    private boolean approvalStatus;

    public Booking(String customerId, String date, String time, int numberOfGuest){
        this.setCustomerId(customerId);
        this.setDate(date);
        this.setTime(time);
        this.setNumberOfGuest(numberOfGuest);
        setApprovalStatus(false);
    }

    //should type getters and setters

    public boolean isApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(boolean approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public int getNumberOfGuest() {
        return numberOfGuest;
    }

    public void setNumberOfGuest(int numberOfGuest) {
        this.numberOfGuest = numberOfGuest;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setApproval(boolean approvalStatus){
        this.setApprovalStatus(approvalStatus);
    }



    public void persistData(){
        //Make a sql statement with table name and statement and send it to common class to store them
    }
}