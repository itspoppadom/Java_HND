package CarService;

public class Car {
    private String regNo, make, model, customerID;
    private String year;

    Customer customer = new Customer();
    public Car() {
        this.regNo = "";
        this.make = "";
        this.model = "";
        this.customerID = "";
        this.year = "";
    }
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setCustomerID(String customerID) {

        this.customerID = customer.getCustomerID();

    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getRegNo() {
        return regNo;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getCustomerID() {
        return customerID;
    }
    public String getYear() {
        return year;
    }


}
