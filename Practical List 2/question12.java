import java.sql.*;

public class question12 {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost\\MSSQL2019;" +
                "databaseName=ContactDB;" +
                "integratedSecurity=true;" +
                "encrypt=true;" +
                "trustServerCertificate=true";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url);

            Statement st = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );

            ResultSet rs = st.executeQuery("SELECT * FROM Contacts");

            System.out.println("Forward:");
            while (rs.next()) {
                System.out.println(rs.getString("Firstname"));
            }

            System.out.println("Backward:");
            while (rs.previous()) {
                System.out.println(rs.getString("Firstname"));
            }

            rs.last();
            System.out.println("Last Contact: " + rs.getString("Firstname"));

            rs.absolute(2);
            System.out.println("Second Contact: " + rs.getString("Firstname"));

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
