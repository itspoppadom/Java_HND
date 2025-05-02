package ATM;

import java.util.Random;
import java.util.Scanner;

public class User {

    private String userID, firstName, lastName ,postCode;
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    public User(String userID, String firstName, String lastName, String postCode) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.postCode = postCode;

    }
    public User(){
        this.userID=rand.nextInt(100)+"";
        this.firstName=null;
        this.lastName=null;
        this.postCode=null;
    }

    //Operations for the UserID variable
    public String getUserID() {
        return userID;
        }
    public void setUserID(String userID) {
        this.userID = userID;
        }
    public void setUserID(){
        this.userID = rand.nextInt(100)+"";
        }

    //Operations for Firstname variable
    public String getFirstName() {
        return firstName;
        }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
        }
    public void setFirstName(){
        System.out.println("Please enter your first name");
        this.firstName = input.nextLine();
        }
    //Operations for Lastname variable
    public String getLastName() {
            return lastName;
        }
    public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    public void setLastName(){
        System.out.println("Please enter your last name");
        this.lastName = input.nextLine();
        }

    //Operations for the PostCode variable
    public String getPostCode() {
        return postCode;
        }
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
    public void setPostCode(){
        System.out.println("Please enter your post code");
        this.postCode = input.nextLine();
    }

    }
