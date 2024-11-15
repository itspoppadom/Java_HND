import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;

public class Main {

    public static void displayMenu() {
        Scanner systemIn = new Scanner(System.in);
        System.out.println("Airline booking System >>> \n Select one of the following options to access data for relevant categories: \n 1. Customer \n 2. Route \n 3. Flight \n 4. Booking \n 5. Exit the System");
        int userPick = systemIn.nextInt();
        if (userPick == 1) {
            diplayMenuOpt1();

        } else if (userPick == 2) {
            System.out.println("Work in progress, come back soon!");
            displayMenu();
        } else if (userPick == 3) {
            System.out.println("Work in progress, come back soon!");
            displayMenu();
        }  else if (userPick == 4) {
            System.out.println("Work in progress, come back soon!");
            displayMenu();
        } else if (userPick == 5) {
            System.out.println("Invalid option");
            System.exit(1);
        } else { System.out.println("Invalid option");  }
    }
    public static void diplayMenuOpt1(){
        Scanner systemIn = new Scanner(System.in);
        System.out.println("Would you like to write data to file, or load data from file? >>> \n Select one of the following options: \n 1. Load data \n 2. Save data \n 3. Return to previous menu ");
        int userPick = systemIn.nextInt();
        if (userPick == 1) {
            System.out.println("Load data from file");
            customerLoadFile();
        }else if (userPick == 2) {
            System.out.println("Save data to file");
            customerWriteData();
        } else if (userPick == 3) {
            System.out.println("Return to previous menu");
            displayMenu();
        }
    }
    public static void customerWriteData(){
        Customer customer = new Customer();
        Scanner systemIn = new Scanner(System.in);
        System.out.println("You're away to add customer data to the database");
        System.out.println("Please enter the name of the customer you would like to add: ");
        customer.setFirstName(systemIn.nextLine());
        System.out.println("Please enter the lastname of the customer you would like to add: ");
        customer.setLastName(systemIn.nextLine());
        System.out.println("Please enter the street of the customer you would like to add: ");
        customer.setStreet(systemIn.nextLine());
        System.out.println("Please enter the town of the customer you would like to add: ");
        customer.setTown(systemIn.nextLine());
        System.out.println("Please enter the postcode of the customer you would like to add: ");
        customer.setPostCode(systemIn.nextLine());
        System.out.println("Please wait... Appending to file.  ");
        customer.writeCustData(customer.getCustomerID(), customer.getFirstName(), customer.getLastName(), customer.getStreet(), customer.getTown(), customer.getPostCode(), customer.getFilename());

    }
    public static void customerLoadFile(){
        Customer customer1 = new Customer();
        ArrayList<Customer> customerList = Customer.loadFile(customer1.getFilename());

        for (Customer customer : customerList) {
            System.out.println("ID: " + customer.getCustomerID() +
                    ", Name: " + customer.getFirstName() + " " + customer.getLastName() +
                    ", Address: " + customer.getStreet() + ", " + customer.getTown() +
                    ", PostCode: " + customer.getPostCode());
        }
    }

    public static void main(String[] args) {

    displayMenu();




    }
}
