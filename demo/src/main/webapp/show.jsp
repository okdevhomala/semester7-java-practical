<%@ page import="jakarta.servlet.http.Cookie" %>
<%@ page import="java.net.URLDecoder" %>
<html>
<body>
<%
  Cookie[] cookies = request.getCookies();
  String name = "Guest";
  if (cookies != null) {
    for (Cookie c : cookies) {
      if (c.getName().equals("user")) {
        name = URLDecoder.decode(c.getValue(), "UTF-8");
        break;
      }
    }
  }
%>
<p>This is demo of saving cookie</p>
<h2>Hello, <%= name %>!</h2>
</body>
</html>
