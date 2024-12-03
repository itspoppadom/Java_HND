package CarService;

import java.util.Random;

public class Customer {

    private String customerID, foreName, surName,postCode, phoneNo;
    Random rand = new Random();

    public Customer() {
        this.customerID = rand.nextInt(1,9999)+"";
        this.foreName = "";
        this.surName = "";
        this.postCode = "";
        this.phoneNo = "";

    }


    /*List of Setters and getters for the Customer class*/
    /*CustomerID*/
    public String getCustomerID() {
        return customerID;
    }
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    /*ForeName*/
    public String getForeName(){
        return this.foreName;
    }
    public void setForeName(String foreName) {
        this.foreName = foreName;

    }
    /*Surname*/
    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public String getPostCode() {
        return postCode;
    }
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

}
