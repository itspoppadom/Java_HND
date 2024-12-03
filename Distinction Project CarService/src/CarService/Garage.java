package CarService;

public class Garage {
    private String garageID, garageName, garAddress, town, postCode, phoneNo;
    public Garage() {
        this.garageID = "";
        this.garageName = "";
        this.garAddress = "";
        this.town = "";
        this.postCode = "";
        this.phoneNo = "";
    }
    public String getGarageID() {
        return garageID;
    }
    public void setGarageID(String garageID) {
        this.garageID = garageID;
    }
    public String getGarageName() {
        return garageName;
    }
    public void setGarageName(String garageName) {
        this.garageName = garageName;
    }
    public String getGarAddress() {
        return garAddress;
    }
    public void setGarAddress(String garAddress) {
        this.garAddress = garAddress;
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
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

}
