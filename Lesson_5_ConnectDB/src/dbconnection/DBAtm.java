package dbconnection;

import java.sql.*;

public class DBAtm {
    public static void main(String[] args) {
        String host_url ="jdbc:mysql://localhost:3306/atm_database";
        String username ="root" ;
        String pass ="root" ;


        try(Connection connection =DriverManager.getConnection(host_url,username,pass) ){
            System.out.println(connection);
            System.out.println("Connected");

            /* Connection - Statemeent - Execute the connection*/
            String sql= "select * from account";
            Statement stmt =connection.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getDouble(3));
            }

            /*String sql="insert into account values(?,?,?)";
            PreparedStatement pS =connection.prepareStatement(sql);


            ##Set values of the SQL Statement using the following lines of code
            pS.setString(1,"78");
            pS.setString(2,"John");
            pS.setDouble(3,189.34);

            pS.executeUpdate();  */
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
