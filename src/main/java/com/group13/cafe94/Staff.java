package com.group13.cafe94;

public class Staff{
    private String firstName;
    private String lastName;
    private int hoursToWork;
    private int hoursWorked;
    public Staff(String firstName, String lastName, int hoursToWork, int hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hoursToWork = hoursToWork;
        this.hoursWorked = hoursWorked;
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
    public int getHoursToWork() {
        return hoursToWork;
    }
    public void setHoursToWork(int hoursToWork) {
        this.hoursToWork = hoursToWork;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    public void persistData(String tableName, String sqlText){

    }
    
}