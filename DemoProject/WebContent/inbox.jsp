<%@page import="java.sql.*;" %>
<html>
<body bgcolor=#336699 >
<center>
<div  style="background-color:white;border-style:solid;border-width:5px;border-color:orange;width:90%;height:600px;box-shadow:3px 3px 15px black;border-radius:20px;padding:20px 20px 20px 20px;text-align:left"  >
<center>
<img src="Images/info.gif" ><font face=Times size=7> InBox</font>
</center>
<hr size=10 color="#336699" style="box-shadow:1px 1px 5px aqua" >
<form action=delmail.jsp?type=in  method=post>
<table border=2 cellspacing=5 cellpadding=5 width="70%" >
<tr><th>Delete</th><th>From</th><td>Subject</th><th>Date</th><th>Message</th></tr>

<%
java.util.Date d=new java.util.Date();
String uid=(String)session.getValue("uid");
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:mmail");
PreparedStatement smt=con.prepareStatement("select * from mails where mailto=?");
smt.setString(1,uid);
ResultSet rs=smt.executeQuery();
while(rs.next())
	{
	String mid=rs.getString(1);
	String mfrom=rs.getString("mailfrom");
	String mdate=rs.getString("mdate");
	String sub=rs.getString("subject");
	String mmsg=rs.getString("message");
	%>
	<tr><td><input type=checkbox name=mid value=<%=mid%> ></td><td><%=mfrom%></td><td><%=sub%></td><td><%=mdate%></td><td><%=mmsg%></td></tr>
	<%
	}
%>

</table>
<hr size=10 color="#336699" style="box-shadow:1px 1px 5px aqua" >
<input type=submit value="Delete Selected" > <input type=Reset >
<hr size=10 color="#336699" style="box-shadow:1px 1px 5px aqua" >
</form>
</body>
</html>