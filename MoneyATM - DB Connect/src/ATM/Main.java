package ATM;
import javax.xml.transform.Result;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String host_url ="jdbc:mysql://localhost:3306/atm_database";
        String username ="root" ;
        String pass ="root" ;

        Scanner input = new Scanner(System.in);

        try(Connection connection = DriverManager.getConnection(host_url,username,pass)) {
            Statement statement = connection.createStatement();
            System.out.println(connection);


            String option = "z";
            while (!option.equals("e")) {
                System.out.println("\na)add user\nb)list of users\nc)ATM\nd)add account\ne)exit\nPlease select an option:");
                option = input.nextLine();
                switch (option) {
                    case "a":
                        User newUser = new User();
                        //newuser.setInputUserID()
                        System.out.print("Enter userID: ");
                        String UID = input.nextLine();
                        String uSQL="select userID from user where userID = '" + UID + "'";
                        ResultSet result =statement.executeQuery(uSQL);
                        if (result.next()) {
                            System.out.print("This userID exist");
                            break;
                        }
                        else {
                            newUser.setUserID(UID);
                        }
                        newUser.setFirstName();
                        newUser.setLastName();
                        newUser.setPostCode();

                        System.out.println("This record will add : " + newUser.getUserID() + " " + newUser.getFirstName() + " " + newUser.getLastName() + " " + newUser.getPostCode());

                        String usersql= "insert into user values(?,?,?,?)";
                        PreparedStatement pst = connection.prepareStatement(usersql);
                        pst.setString(1, newUser.getUserID());
                        pst.setString(2, newUser.getFirstName());
                        pst.setString(3, newUser.getLastName());
                        pst.setString(4, newUser.getPostCode());
                        pst.executeUpdate();

                        break;
                    case "b":

                        String sql = "select * from user";
                        ResultSet rs = statement.executeQuery(sql);
                        String userID, firstName, lastName, postCode;
                        User[] listUser = new User[10];
                        int i = 0;
                        while (rs.next()) {
                            userID = rs.getString("userID");
                            firstName = rs.getString("firstname");
                            lastName = rs.getString("surname");
                            postCode = rs.getString("postcode");
                            listUser[1] = new User(userID, firstName, lastName, postCode);
                            i++;
                        }
                        for (int j=0; j<i;j++){
                            System.out.println(listUser[j].getUserID() + " " + listUser[j].getFirstName() + " " + listUser[j].getLastName() + " " + listUser[j].getPostCode());
                        }
                        break;
                    case "c":
                        String ID="";
                        double amount =0;
                        System.out.print("Enter ID: ");
                        ID= input.nextLine();
                        String asql="select * from user where userID = '" + ID + "'";
                        Statement astatement = connection.createStatement();
                        ResultSet ars = astatement.executeQuery(asql);
                        while(ars.next()){
                            amount=ars.getDouble("saving");
                            System.out.println(amount);
                        }
                        Account myaccount = new Account();
                        myaccount.setBalance(amount);
                        String atm="exit";
                        while(!atm.equals("x")){
                            System.out.print("Work with ATM. D) Deposit S) Show balance W) Withdraw X)Exit ");
                            atm = input.nextLine().toLowerCase();
                            switch(atm){
                                case "d":
                                    myaccount.deposit();
                                    break;
                                case "s":
                                    myaccount.showBalance();
                                    break;
                                case "w":
                                    myaccount.withdraw();
                                    break;
                                case "x":
                                    atm="exit";
                                    break;
                                default:
                                    System.out.println("Wrong option");



                            }
                        }
                amount = myaccount.getBalance();
                String acsave= "update account set saving =? where userID=?";
                PreparedStatement psAccount = connection.prepareStatement(acsave);
                psAccount.setDouble(1, amount);
                psAccount.setString(2, ID);
                psAccount.executeUpdate();

                break;
                    case "d":
                        String insersql = "insert into user values(?,?,?,?)";
                        PreparedStatement psInsert = connection.prepareStatement(insersql);
                        System.out.print("Enter the account ID");
                        String accountID = input.next().trim();
                        System.out.print("Enter the account type");
                        String accountType = input.next().trim();
                        System.out.print("Enter the account balance");
                        double accountBalance = input.nextDouble();
                        System.out.println("enter the userID");
                        String userid= input.next().trim();

                        psInsert.setString(1, accountID);
                        psInsert.setString(2, accountType);
                        psInsert.setDouble(3, accountBalance);
                        psInsert.setString(4, userid);

                        psInsert.executeUpdate();
                        break;
                    case "e":
                        System.out.println("Have a good day!");
                        break;
                    default:
                        System.out.println("Wrong option");
                        break;
                }
            }

            /* Gather all data from user database      */



            /**System.out.println("Please enter your UserID to search your details");
            String userID = input.next().trim();  /* Always good to trim data when working with databases

            String sql = "select * from account where userID = '"+userID+"'";
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet rs = statement.executeQuery(sql);
            double amount = 0;
            while (rs.next()) {
                amount = rs.getDouble("saving");
                amount = amount +100;
                System.out.println(amount);
            }

            Account myAccount = new Account();
            myAccount.setBalance(amount);
            myAccount.withdraw();
            myAccount.showBalance();
            myAccount.deposit();
            myAccount.showBalance();

            /*String sql2= "insert into account values (?,?,?,?)";/* where userID ='"+userID+"'"";
            PreparedStatement statement1 = connection.prepareStatement(sql2);

            statement1.setString(1, "13");
            statement1.setString(2, "current");
            statement1.setDouble(3, amount);
            statement1.setString(4, userID);

            statement1.executeUpdate();*/
        } catch (SQLException e) {
            throw new RuntimeException(e);  }
    }
}
