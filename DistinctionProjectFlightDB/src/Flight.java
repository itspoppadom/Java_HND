import java.io.*;
import java.sql.Time;
import java.util.*;

public class Flight {

    private String flightID;
    private String departureDate;
    private String departureTime;
    private String routeID;
    private String arrivalTime;
    private String arrivalDate;
    private String capacity;
    private String filename;

public Flight() {
    this.flightID = "";
    this.departureDate = "";
    this.departureTime = "";
    this.routeID = "";
    this.arrivalDate = "";
    this.arrivalTime = "";
    this.capacity = "";
    this.filename = "Flight.csv";
}

/** Set up the Write and load functions **/
public void writeFile(String flightID, String departureDate, String departureTime,String routeID,String arrivalDate, String arrivalTime, String capacity, String filename) {
    try(FileWriter file = new FileWriter(filename, true)){
        String writeData = flightID + "," + departureDate + "," + departureTime + "," + routeID + "," + arrivalDate + "," + arrivalTime + "," + capacity + "\n";
        file.append(writeData);
    } catch (IOException e) {
        e.printStackTrace();
    }

}
static ArrayList<Flight> loadFile(String filename) {
    List<String> allItems;
    ArrayList<Flight> flights = new ArrayList<>();
    try{
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String line = in.readLine();
        while(line != null) {
            allItems = Arrays.asList(line.split(","));
            if (allItems.size() == 5) {
                Flight flight = new Flight();
                flight.flightID = allItems.get(0);
                flight.departureDate = allItems.get(1);
                flight.departureTime = allItems.get(2);
                flight.routeID = allItems.get(3);
                flight.arrivalDate = allItems.get(4);
                flight.arrivalTime = allItems.get(5);
                flight.capacity = allItems.get(6);
                flights.add(flight);
            }else {
                System.out.println("Warning: Incorrect Data format in line: " + line);
            }
            line = in.readLine();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return flights;
}


/** Set up the setters and getter for this class   **/
public String getFlightID() {
    return flightID;
}
public void setFlightID(String flightID) {
    this.flightID = flightID;
}
public String getDepartureDate(){
    return departureDate;
}
public void setDepartureDate(String departureDate){
    this.departureDate = departureDate;
}
public String getDepartureTime(){
    return departureTime;
}
public void setDepartureTime(String departureTime){
    this.departureTime = departureTime;
}
public String getRouteID() {
    return routeID;
}
public void setRouteID(String routeID) {
    this.routeID = routeID;
}
public String getArrivalTime(){
    return arrivalTime;
}
public void setArrivalTime(String arrivalTime){
    this.arrivalTime = arrivalTime;
}
public String getArrivalDate(){
    return arrivalDate;

}
public void setArrivalDate(String arrivalDate){
    this.arrivalDate = arrivalDate;
}
public String getCapacity() {
    return capacity;
}
public void setCapacity(String capacity) {
    this.capacity = capacity;

}
public String getFilename() {
    return filename;
}
}
