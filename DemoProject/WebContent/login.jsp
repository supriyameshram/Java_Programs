<%@page import="java.sql.*" %>
<%
String uid=request.getParameter("uid");
String pwd=request.getParameter("pwd");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mmail", "root", "root");
PreparedStatement smt=con.prepareStatement("select * from userMaster where userid=? and password=?");
smt.setString(1,uid);
smt.setString(2,pwd);
ResultSet rs=smt.executeQuery();
if(rs.next())
	{
	
	session.putValue("dsn","jdbc:mysql:mmail");
	session.putValue("uid",uid);
	session.putValue("pw",pwd);
	
		%><jsp:forward page="main.jsp" /><%
	
	}
else
	%><jsp:forward page="invaliduser.jsp" /><%
%>