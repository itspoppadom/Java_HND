/* Import necessary libraries */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Customer {
    /* Define the variables for the customer class */
    private String customerID;
    private String firstName;
    private String lastName;
    private String street;
    private String town;
    private String postCode;
    private String filename;


    /* Define the defaults for the constructor*/
    public Customer() {
        this.customerID = "";
        this.firstName = "";
        this.lastName = "";
        this.street = "";
        this.town = "";
        this.postCode = "";
        this.filename = "Customer.csv";
    }
    /* Write customer data to file */
    public void writeCustData(String customerID, String firstName, String lastName, String street, String town, String postCode, String filename) {

        try(FileWriter file = new FileWriter(filename,true)) {
            String writeData = customerID + "," + firstName + "," + lastName + "," + street + "," + town + "," + postCode + "\n";
            file.append(writeData);
        } catch (IOException e) {
            System.out.println("Sorry there was an issue writing Customer data to file." + e.getMessage());
        }

    }
    /* Load customer data from file */
    static ArrayList<Customer> loadFile(String filename) {
        //Setup an Array to hold the Inventory data from the Items.txt file

        List<String> allItems;
        ArrayList<Customer> customers = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String line = in.readLine();
            while (line != null) {
                allItems = Arrays.asList(line.split(","));

                if (allItems.size() == 6) { // Ensure there are enough elements
                    Customer newCustomer = new Customer();
                    newCustomer.setCustomerID(allItems.get(0).trim());
                    newCustomer.setFirstName(allItems.get(1).trim());
                    newCustomer.setLastName(allItems.get(2).trim());
                    newCustomer.setStreet(allItems.get(3).trim());
                    newCustomer.setTown(allItems.get(4).trim());
                    newCustomer.setPostCode(allItems.get(5).trim());

                    customers.add(newCustomer);
                } else {
                    System.out.println("Warning: Incorrect data format in line: " + line);
                }

                line = in.readLine();

            }
        } catch (IOException e) {
            System.out.println("Error occurred reading file: " + e.toString());

        }
        return customers;
    }








    /* getters and setters are defined below. */
    public String getCustomerID() {
        return customerID;
    }
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
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
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        this.town = town;
    }
    public String getPostCode() {
        return postCode;
    }
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }
    public String getFilename() {
        return filename;
    }
}
