<html>
<body>
<%
  String name = "Guest";
  if (session != null && session.getAttribute("user") != null) {
    name = (String) session.getAttribute("user");
  }
%>
<h2>Welcome, <%= name %>!</h2>
</body>
</html>
