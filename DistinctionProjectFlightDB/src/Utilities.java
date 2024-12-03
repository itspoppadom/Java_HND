import java.util.ArrayList;
import java.util.Scanner;

public class Utilities {



    public Utilities() {
    }

    public static void displayMenu() {
        Scanner systemIn = new Scanner(System.in);
        System.out.println("Airline booking System >>> \n Select one of the following options to access data for relevant categories: \n 1. Customer \n 2. Route \n 3. Flight \n 4. Booking \n 5. Exit the System");
        int userPick = systemIn.nextInt();
        if (userPick == 1) {
            displayMenuOpt1();

        } else if (userPick == 2) {
            displayMenuOpt2();
        } else if (userPick == 3) {
            displayMenuOpt3();
        }  else if (userPick == 4) {
            System.out.println("Work in progress, come back soon!");
            displayMenuOpt4();
        } else if (userPick == 5) {
            System.out.println("Shutting Down");
            System.exit(1);
        } else { System.out.println("Invalid option");  }
    }
    /*Menu Options for the program*/
    public static void displayMenuOpt1(){
        Scanner systemIn = new Scanner(System.in);
        System.out.println("Would you like to write data to file, or load data from file? >>> \n Select one of the following options: \n 1. Load data \n 2. Save data \n 3. Return to previous menu ");
        int userPick = systemIn.nextInt();
        if (userPick == 1) {
            System.out.println("Load data from file");
            customerLoadFile();
        }else if (userPick == 2) {
            System.out.println("Save data to file");
            custDataInput();
        } else if (userPick == 3) {
            System.out.println("Return to previous menu");
            displayMenu();
        }
    }
    public static void displayMenuOpt2(){
        Scanner systemIn = new Scanner(System.in);
        System.out.println("Would you like to write data to file, or load data from file? >>> \n Select one of the following options: \n 1. Load data \n 2. Save data \n 3. Return to previous menu ");
        int userPick = systemIn.nextInt();
        if (userPick == 1) {
            System.out.println("Load data from file");
            loadRouteData();
        }else if (userPick == 2) {
            System.out.println("Save data to file");
            routeDataInput();
        } else if (userPick == 3) {
            System.out.println("Return to previous menu");
            displayMenu();
        }

    }
    public static void displayMenuOpt3(){
        Scanner systemIn = new Scanner(System.in);
        System.out.println("Would you like to write data to file, or load data from file? >>> \n Select one of the following options: \n 1. Load data \n 2. Save data \n 3. Return to previous menu ");
        int userPick = systemIn.nextInt();
        if (userPick == 1) {
            System.out.println("Load data from file");
            loadFlightData();
        }else if (userPick == 2) {
            System.out.println("Save data to file");
            flightDataInput();
        } else if (userPick == 3) {
            System.out.println("Return to previous menu");
            displayMenu();
        }
    }

    public static void displayMenuOpt4(){
        Scanner systemIn = new Scanner(System.in);
        System.out.println("Would you like to write data to file, or load data from file? >>> \n Select one of the following options: \n 1. Load data \n 2. Save data \n 3. Return to previous menu ");
    }

    /**Following code is used to write and read customer  **/
    public static void custDataInput() {
        Customer customer = new Customer();
        Scanner systemIn = new Scanner(System.in);
        while (true) {
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
            customer.writeFile(customer.getCustomerID(), customer.getFirstName(), customer.getLastName(), customer.getStreet(), customer.getTown(), customer.getPostCode(), customer.getFilename());
            System.out.println("Write to file complete");


            System.out.println("Would you like to add more entries?  (Y/N) ");
            String choice = systemIn.next();
            if (!choice.toLowerCase().equals("y")) {
                return;
            }
        }
    }
    public static void routeDataInput() {
        Route route = new Route();
        Scanner systemIn = new Scanner(System.in);

        while (true) {
            System.out.println("You're away to add route data to the database");
            System.out.println("Please enter the name of the route you would like to add: ");
            route.setRouteID(systemIn.next());
            System.out.println("Please enter the place of Departure of the route you would like to add: ");
            route.setDepartFrom(systemIn.next());
            System.out.println("Please enter the place of Arrival of the route you would like to add: ");
            route.setArriveAt(systemIn.next());
            System.out.println("Please enter the mid Stop One of the route you would like to add: ");
            route.setMidStopOne(systemIn.next());
            System.out.println("Please eneter the mid Stop Two of the route you would like to add ");
            route.writeFile(route.getRouteID(), route.getDepartFrom(), route.getArriveAt(), route.getMidStopOne(), route.getMidStopTwo(), route.getFileName());


            System.out.println("Would you like to add more entries?  (Y/N) ");
            String choice = systemIn.next();
            if (!choice.toLowerCase().equals("y")) {
                return;
            }
            }
        }
    public static void flightDataInput(){
        Flight flight = new Flight();
        Validator validator = new Validator();
        Scanner systemIn = new Scanner(System.in);
        System.out.println("You're away to add flight data to the database");
        System.out.println("Please enter the name of the flight you would like to add: ");
        flight.setFlightID(systemIn.next());
        System.out.println("Please enter the Departure date of the flight you would like to add: ");
        flight.setDepartureDate(validator.getValidDate());
        System.out.println("Please enter the Departure time of the flight you would like to add: ");
        flight.setDepartureTime(validator.getValidTime());
        System.out.println("Please enter the Route name of the flight you would like to add: ");
        flight.setRouteID(systemIn.next());
        System.out.println("Please enter the arrival date of the flight you would like to add: ");
        flight.setArrivalDate(validator.getValidDate());
        System.out.println("Please enter the arrival time of the flight you would like to add: ");
        flight.setArrivalTime(validator.getValidTime());
        System.out.println("Please enter the capacity of the flight you're entering information for: ");
        flight.setCapacity(systemIn.next());
        flight.writeFile(flight.getFlightID(), flight.getDepartureDate(), flight.getDepartureTime(), flight.getRouteID(), flight.getArrivalDate(), flight.getArrivalTime(), flight.getCapacity(), flight.getFilename());
        System.out.println("Flight added.");


        System.out.println("Would you like to add more entries?  (Y/N) ");
        String choice = systemIn.next();
        if (choice.toLowerCase().equals("y")) {
            System.out.println("How many entries would you like to add?");
            int choiceNum = systemIn.nextInt();
            for (int i = 0; i < choiceNum; i++) {
                custDataInput();
            }
        } else if (choice.toLowerCase().equals("n")) {
            System.out.println("Returning to previous menu.");
            displayMenuOpt1();
        } else {
            System.out.println("Invalid option");
        }
    }

    /** Loaders for each of the tables **/
    public static void customerLoadFile(){
        Customer customer1 = new Customer();
        ArrayList<Customer> customerList = Customer.loadFile(customer1.getFilename());

        for (Customer customer : customerList) {
            System.out.println("ID: " + customer.getCustomerID() +
                    "\nName: " + customer.getFirstName() + " " + customer.getLastName() +
                    "\nAddress: " + customer.getStreet() + ", " + customer.getTown() +
                    "\nPostCode: " + customer.getPostCode());
        }
    }

    public static void loadRouteData(){
        Route route1 = new Route();
        ArrayList<Route> routeList = Route.loadFile(route1.getFileName());

        for (Route route : routeList) {
            System.out.println("RouteID: " + route.getRouteID() + "\nDeparture from: " +
                    route.getDepartFrom() + "\nArrival at: " + route.getArriveAt() +
                    "\nMid Stop One: " + route.getMidStopOne() + "\nMid Stop Two: " + route.getMidStopTwo());
        }
    }
    public static void loadFlightData(){
        Flight flight1 = new Flight();
        ArrayList<Flight> flightsList = Flight.loadFile(flight1.getFilename());

        for (Flight flight : flightsList) {
            System.out.println("FlightID: "+ flight.getFlightID() + "\nDeparture date: " + flight.getDepartureDate() + "\nDeparture time: " + flight.getDepartureTime() + "\nRouteID: " + flight.getRouteID() + "\nArrival date: " + flight.getArrivalDate() + "\nArrival time: " + flight.getArrivalTime() + "\nAirship capacity: " + flight.getCapacity());

        }
    }
}
