import java.sql.*;

public class question13 {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost\\MSSQL2019;" +
                "databaseName=ContactDB;" +
                "integratedSecurity=true;" +
                "encrypt=true;" +
                "trustServerCertificate=true";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url);

            con.setAutoCommit(false); // Begin transaction

            String sql1 = "UPDATE Contacts SET ContactNumber = '1234567890' WHERE id = 13";
            String sql2 = "UPDATE Contacts SET ContactNumber = '9999999999' WHERE id = 14";

            Statement st = con.createStatement();
            st.executeUpdate(sql1);
            st.executeUpdate(sql2);

            con.commit(); // Commit both updates
            System.out.println("Transaction committed successfully.");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                // Rollback on error
                Connection con = DriverManager.getConnection(url);
                con.rollback();
                System.out.println("Transaction rolled back.");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
