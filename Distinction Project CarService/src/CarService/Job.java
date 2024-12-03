package CarService;

public class Job {
    private String jobID, garageID, dateIn,dateOut,regNo;
    private double cost;
    private double offer;


    Garage garage = new Garage();

    public Job(String jobID, String garageID, String dateIn, String dateOut, String regNo, double cost, double offer) {
        this.jobID = jobID;
        this.garageID = garage.getGarageID();
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.regNo = regNo;
        this.cost = cost;
        this.offer = offer;

    }
    public String getJobID() {
        return jobID;
    }
    public void setJobID(String jobID) {
        this.jobID = jobID;
    }
    public String getGarageID() {
        return garageID;
    }
    public void setGarageID(String garageID) {
        this.garageID = garageID;
    }
    public String getDateIn() {
        return dateIn;
    }
    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }
    public String getDateOut() {
        return dateOut;
    }
    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }
    public String getRegNo() {
        return regNo;
    }
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }
    public double getCost() {
        return cost;
    }
}

