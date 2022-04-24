package com.kostaroot.customerinfo;

public class Customer {
    private final String customerName;
    private int age;
    private double balance;

    public Customer(String customerName, int age, double balance) {
        this.customerName = customerName;
        this.age = age;
        this.balance = balance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Name: " + customerName +
                "\nage: " + age +
                "\nbalance: " + balance + " USD";
    }
}
