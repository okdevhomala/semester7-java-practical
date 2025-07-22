import java.sql.*;
import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter Firstname: ");
        String fname = sc.nextLine();
        System.out.print("Enter Lastname: ");
        String lname = sc.nextLine();
        System.out.print("Enter Contact Number: ");
        String contact = sc.nextLine();

        // Connection info
        String server = "//localhost\\MSSQL2019";  // or your server name
        String port = "1433";
        String database = "ContactDB";

        // Use Windows Authentication
        String jdbcUrl = "jdbc:sqlserver://localhost\\MSSQL2019;" +
                "databaseName=ContactDB;" +
                "integratedSecurity=true;" +
                "encrypt=true;" +
                "trustServerCertificate=true";


        try {
            // Load SQL Server JDBC Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Connect to database
            Connection con = DriverManager.getConnection(jdbcUrl);

            // Prepare SQL insert
            String sql = "INSERT INTO Contacts (Firstname, Lastname, ContactNumber) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, contact);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Contact saved successfully!");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
