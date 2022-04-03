package com.group13.cafe94;

public class Waiter extends Staff{

    public Waiter(String firstName, String lastName, int hoursToWork, int hoursWorked) {
        super(firstName, lastName, hoursToWork, hoursWorked);
    }

    public void approveBooking(Booking booking){
        booking.setApprovalStatus(true);
    }
}