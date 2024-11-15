/* Import necessary libraries into the program*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Route {
    private String routeID;
    private String departFrom;
    private String arriveAt;
    private String midStopOne;
    private String midStopTwo;


    public Route() {
        this.routeID = "";
        this.departFrom = "";
        this.arriveAt = "";
        this.midStopOne = "";
        this.midStopTwo = "";

    }
    public void writeRouteDetails(String routeID, String departFrom, String arriveAt, String midStopOne, String midStopTwo) {


        try(FileWriter file = new FileWriter("Route.csv", true)){

        }catch (IOException e) {
            System.out.println("Sorry there was an issue writing Customer data to file." + e.getMessage());
        }
    }





    /* Setters and Getters for the Route class.*/
    public String getRouteID() {
        return routeID;
    }
    public void setRouteID(String routeID) {
        this.routeID = routeID;
    }
    public String getDepartFrom() {
        return departFrom;
    }
    public void setDepartFrom(String departFrom) {
        this.departFrom = departFrom;
    }
    public String getArriveAt() {
        return arriveAt;
    }
    public void setArriveAt(String arriveAt) {
        this.arriveAt = arriveAt;
    }
    public String getMidStopOne() {
        return midStopOne;
    }
    public void setMidStopOne(String midStopOne) {
        this.midStopOne = midStopOne;
    }
    public String getMidStopTwo() {
        return midStopTwo;
    }
    public void setMidStopTwo(String midStopTwo) {
        this.midStopTwo = midStopTwo;
    }

}
