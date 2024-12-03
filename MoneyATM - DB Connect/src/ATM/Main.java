package ATM;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String host_url ="jdbc:mysql://localhost:3306/atm_database";
        String username ="root" ;
        String pass ="root" ;

        Scanner input = new Scanner(System.in);

        try(Connection connection = DriverManager.getConnection(host_url,username,pass)) {
            System.out.println(connection);
            System.out.println("Connected to database");

            System.out.println("Please enter your UserID to search your details");
            String userID = input.next().trim();  /* Always good to trim data when working with databases */

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
