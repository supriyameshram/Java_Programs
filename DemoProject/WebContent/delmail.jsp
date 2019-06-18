<%@page import="java.sql.*;" %>
<%
String mids[]=request.getParameterValues("mid");
String type=request.getParameter("type");
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:mmail");
PreparedStatement smt=con.prepareStatement("delete from mails where mid=?");
for(int i=0;i<mids.length;i++)
	{
	smt.setString(1,mids[i]);
	smt.executeUpdate();
	}
con.close();
if(type.equals("in"))
	response.sendRedirect("inbox.jsp");
else
	response.sendRedirect("outbox.jsp");
%>

