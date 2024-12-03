/* Import necessary libraries into the program*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Route {
    private String routeID;
    private String departFrom;
    private String arriveAt;
    private String midStopOne;
    private String midStopTwo;
    private String fileName;


    public Route() {
        this.routeID = "";
        this.departFrom = "";
        this.arriveAt = "";
        this.midStopOne = "";
        this.midStopTwo = "";
        this.fileName = "Route.csv";
    }
    public void writeFile(String routeID, String departFrom, String arriveAt, String midStopOne, String midStopTwo, String fileName) {


        try(FileWriter file = new FileWriter(fileName, true)){
            String writeData = routeID + "," + departFrom + "," + arriveAt + "," + midStopOne + "," + midStopTwo + "\n";
            file.append(writeData);
        }catch (IOException e) {
            System.out.println("Sorry there was an issue writing Customer data to file." + e.getMessage());
        }
    }

    static ArrayList<Route> loadFile(String fileName) {

        List<String> allItems;
        ArrayList<Route> routes = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String line = in.readLine();
            while (line != null) {
            allItems = Arrays.asList(line.split(","));
            if (allItems.size() == 5 ) {
                Route newRoute = new Route();
                newRoute.routeID = allItems.get(0);
                newRoute.departFrom = allItems.get(1);
                newRoute.arriveAt = allItems.get(2);
                newRoute.midStopOne = allItems.get(3);
                newRoute.midStopTwo = allItems.get(4);
                routes.add(newRoute);
            } else {
                System.out.println("Warning: Incorrect data format in line: " + line);
            }
            line = in.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error occured reading file: " + e.toString());
        }
        return routes;
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
    public String getFileName() {
        return fileName;
    }

}
