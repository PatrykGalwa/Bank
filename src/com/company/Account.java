package com.company;

public abstract class Account extends Bank {
    private String firstName;
    private String lastName;
    private double accNumber;
    private double balance = 0L;
    private boolean condition;
    private String typeAccount;
    private String testowy;

    public Account(String firstName, String lastName, double accNumber, double balance, boolean condition) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accNumber = accNumber;
        this.balance = balance;
        this.condition = condition;
    }

    public double addBonus(double a) {
        return balance += a;
    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
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

    public double getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(double accNumber) {
        this.accNumber = accNumber;
    }

    public String privateAccount(String value){
        return this.typeAccount = value;
    }

}
