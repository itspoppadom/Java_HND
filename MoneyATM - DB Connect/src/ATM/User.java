package ATM;

import java.util.Random;

public class User {

    private String userID, firstName, lastName ,postCode;
    Random rand = new Random();

    public User(int id, String firstName, String lastName, String postCode) {
    this.userID = rand.nextInt(100)+"";
        this.firstName = firstName;
        this.lastName = lastName;
        this.postCode = postCode;

    }
    public String getUserID() {
        return userID;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPostCode() {
        return postCode;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

}
