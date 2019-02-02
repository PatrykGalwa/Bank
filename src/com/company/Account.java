package com.company;

public abstract class Account {
    private String firstName;
    private String lastName;
    private long accNumber;
    private  long balance;
    private boolean condition;


    public Account(String firstName, String lastName, long accNumber, long balance, boolean condition) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accNumber = accNumber;
        this.balance = balance;
        this.condition = condition;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
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

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

}
