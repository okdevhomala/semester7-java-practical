import java.sql.*;
import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String url = "jdbc:sqlserver://localhost\\MSSQL2019;" +
                "databaseName=ContactDB;" +
                "integratedSecurity=true;" +
                "encrypt=true;" +
                "trustServerCertificate=true";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url);

            // UPDATE
            System.out.print("Enter ID to update: ");
            int id = sc.nextInt(); sc.nextLine(); // consume newline
            System.out.print("New Firstname: ");
            String fname = sc.nextLine();
            String updateSQL = "UPDATE Contacts SET Firstname = ? WHERE id = ?";
            PreparedStatement ps1 = con.prepareStatement(updateSQL);
            ps1.setString(1, fname);
            ps1.setInt(2, id);
            ps1.executeUpdate();
            System.out.println("Contact updated.");

            // DELETE
            System.out.print("Enter ID to delete: ");
            int delId = sc.nextInt();
            String deleteSQL = "DELETE FROM Contacts WHERE id = ?";
            PreparedStatement ps2 = con.prepareStatement(deleteSQL);
            ps2.setInt(1, delId);
            ps2.executeUpdate();
            System.out.println("Contact deleted.");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
