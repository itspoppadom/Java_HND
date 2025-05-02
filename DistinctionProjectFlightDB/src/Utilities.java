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
        int userPick = systemIn.nextInt();
        if (userPick == 1) {
            System.out.println("Load data from file");
            loadBookingData();
        } else if (userPick == 2) {
            System.out.println("Save data to file");
            bookingDataInput();
        } else if (userPick == 3) {
            System.out.println("Return to previous menu");
            displayMenu();
        }
    }

    /**Following code is used to write and read customer  **/
    public static void custDataInput() {
        Customer customer = new Customer();
        Scanner systemIn = new Scanner(System.in);
        while (true) {
            System.out.println("You're away to add customer data to the database");
            System.out.println("Please enter the ID of the customer you would like to add: ");
            String custID = systemIn.nextLine();
            if (!customerIDValidation(custID)){
                customer.setCustomerID(custID);
            } else {
                break;
            }

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
            System.out.println("Please enter the ID of the route you would like to add: ");
            String routeId =systemIn.next();
            if (!routeIDValidation(routeId)){
                route.setRouteID(routeId);
            } else {
                break;
            }
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
        while(true) {
            System.out.println("You're away to add flight data to the database");
            System.out.println("Please enter the ID of the flight you would like to add: ");
            String flyId = systemIn.next();
            if (!flightIDValidation(flyId)) {
                flight.setFlightID(flyId);
            }else {
                break;
            }
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
            if (!choice.toLowerCase().equals("y")) {
                return;
            }
        }
    }
    public static void bookingDataInput(){
        Booking booking = new Booking();
        Scanner systemIn = new Scanner(System.in);


        while (true) {
            System.out.println("You're away to add booking data to the database");
            System.out.println("Please enter the BookingID of the entry you would like to add to this record: ");
            booking.setBookingNo(systemIn.next());
            System.out.println("Please enter the amount of adult tickets you would like to add to this record:");
            booking.setAdultTicket(systemIn.nextInt());
            System.out.println("Please enter the amount of child tickets you would like to add to this record:");
            booking.setChildTicket(systemIn.nextInt());
            System.out.println("Please enter the amount of concession tickets you would like to add to this record:");
            booking.setConcessionTicket(systemIn.nextInt());
            System.out.println("Please enter the customerID associated with this booking: ");
            booking.setCustomerID(systemIn.next());
            System.out.println("Please enter the flightID associated with this booking: ");
            booking.setFlightID(systemIn.next());
            booking.writeFile(booking.getBookingNo(), booking.getAdultTicket(), booking.getChildTicket(), booking.getConcessionTicket(), booking.getCustomerID(), booking.getFlightID(), booking.getFilename());

            System.out.println("Would you like to add more entries?  (Y/N) ");
            String choice = systemIn.next();
            if (!choice.toLowerCase().equals("y")) {
                return;
            }
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
            System.out.println("FlightID: "+ flight.getFlightID() + "\nDeparture date: " + flight.getDepartureDate() +
                    "\nDeparture time: " + flight.getDepartureTime() + "\nRouteID: " + flight.getRouteID() +
                    "\nArrival date: " + flight.getArrivalDate() + "\nArrival time: " + flight.getArrivalTime() +
                    "\nAirship capacity: " + flight.getCapacity());

        }
    }
    public static void loadBookingData(){
        Booking booking1 = new Booking();
        ArrayList<Booking> bookings = Booking.readFile(booking1.getFilename());
        for (Booking booking : bookings) {
            System.out.println("BookingID: " + booking1.getBookingNo() + "\nAdult tickets: "+booking1.getAdultTicket() +
                    "\nChild tickets : "+ booking1.getChildTicket() + "\nConcession tickets: " + booking1.getConcessionTicket() +
                    "\nCustomerID : " + booking1.getCustomerID() + "\nFlightID : "+booking1.getFlightID());
        }
    }


    // Field validation, existence checks to ensure no duplicate unique ID's are entered
    public static boolean customerIDValidation(String customerID) {
        Customer customer1 = new Customer();
        ArrayList<Customer> customerList = Customer.loadFile(customer1.getFilename());
        for (Customer customer : customerList) {
            if (customer.getCustomerID().equals(customerID)) {
                System.out.println("Sorry but a record with that Customer ID already exists.");
                return true;
            }
        }
       return false;
    }

    public static boolean flightIDValidation(String flightID) {
        Flight flight1 = new Flight();
        ArrayList<Flight> flightList = Flight.loadFile(flight1.getFilename());
        for (Flight flight : flightList) {
            if (flight.getFlightID().equals(flightID)) {
                System.out.println("Sorry but a record with that Flight ID already exists.");
                return true;
            }
        }
        return false;
    }
    public static boolean routeIDValidation(String routeID) {
        Route route1 = new Route();
        ArrayList<Route> routeList = Route.loadFile(route1.getFileName());
        for (Route route : routeList) {
            if (route.getRouteID().equals(routeID)) {
                System.out.println("Sorry but a record with that Route ID already exists.");
                return true;
            }
        }
        return false;
    }
}
