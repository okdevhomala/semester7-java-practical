<%@ page import="java.sql.*" %>
<html>
<head>
  <title>Contacts List</title>
  <style>
    table { border-collapse: collapse; width: 70%; margin: 20px auto; }
    th, td { border: 1px solid black; padding: 8px; text-align: center; }
    th { background-color: #f2f2f2; }
  </style>
</head>
<body>
<h2 style="text-align:center;">Contacts Table</h2>
<table>
  <tr>
    <th>ID</th>
    <th>Firstname</th>
    <th>Lastname</th>
    <th>Contact Number</th>
  </tr>

  <%
    // JDBC connection string for Windows Auth
    String jdbcUrl = "jdbc:sqlserver://localhost\\MSSQL2019;" +
            "databaseName=ContactDB;" +
            "integratedSecurity=true;" +
            "encrypt=true;" +
            "trustServerCertificate=true";

    try {
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      Connection con = DriverManager.getConnection(jdbcUrl);
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT TOP 10 * FROM Contacts");

      while(rs.next()) {
  %>
  <tr>
    <td><%= rs.getInt("ID") %></td>
    <td><%= rs.getString("Firstname") %></td>
    <td><%= rs.getString("Lastname") %></td>
    <td><%= rs.getString("ContactNumber") %></td>
  </tr>
  <%
    }

    rs.close();
    stmt.close();
    con.close();
  } catch(Exception e) {
  %>
  <tr><td colspan="4">Error: <%= e.getMessage() %></td></tr>
  <%
    }
  %>
</table>
</body>
</html>
