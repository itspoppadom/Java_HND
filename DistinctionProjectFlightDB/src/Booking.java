import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Booking {
    private String bookingNo;
    private int adultTicket;
    private int childTicket;
    private int concessionTicket;
    private String customerID;
    private String flightID;
    private String filename;

    public Booking() {
        this.bookingNo = "";
        this.adultTicket = 0;
        this.childTicket = 0;
        this.concessionTicket = 0;
        this.customerID = "";
        this.flightID = "";
        this.filename = "Booking.csv";
    }

    /* Set up write and load functions*/
    public void writeFile(String bookingNo, int adultTicket, int childTicket, int concessionTicket, String customerID, String flightID, String filename) {
        try(FileWriter file  = new FileWriter(filename, true)) {
            String writeData = bookingNo + "," + adultTicket + "," + childTicket + "," + concessionTicket + "," + customerID + "," + flightID + "\n";
            file.append(writeData);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Booking> readFile(String filename) {
        List<String> allItems;
        ArrayList<Booking> bookings = new ArrayList<>();

        try{
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String line = in.readLine();
            while(line != null) {
                allItems = Arrays.asList(line.split(","));
                if (allItems.size() ==5){
                    Booking booking = new Booking();
                    booking.bookingNo = allItems.get(0);
                    booking.adultTicket = Integer.parseInt(allItems.get(1));
                    booking.childTicket = Integer.parseInt(allItems.get(2));
                    booking.concessionTicket = Integer.parseInt(allItems.get(3));
                    booking.customerID = allItems.get(4);
                    booking.flightID = allItems.get(5);
                    bookings.add(booking);
                } else {
                    System.out.println("Error in reading file \n" + "Error at line: " + line);
                }
            line = in.readLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookings;
    }



    /*Setters and getters for each of the variables */
    public String getBookingNo() {
        return bookingNo;
    }
    public void setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
    }
    public int getAdultTicket() {
        return adultTicket;
    }
    public void setAdultTicket(int adultTicket) {
        this.adultTicket = adultTicket;
    }
    public int getChildTicket() {
        return childTicket;
    }
    public void setChildTicket(int childTicket) {
        this.childTicket = childTicket;
    }
    public int getConcessionTicket() {
        return concessionTicket;
    }
    public void setConcessionTicket(int concessionTicket) {
        this.concessionTicket = concessionTicket;
    }
    public String getCustomerID() {
        return customerID;
    }
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    public String getFlightID() {
        return flightID;
    }
    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getFilename() {
        return filename;
    }
}
