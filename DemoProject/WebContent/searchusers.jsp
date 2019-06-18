<%@page import="java.sql.*,java.util.*" %>
<%
String searchname="";
if(!(request.getParameter("searchname")==null||request.getParameter("searchname").equals("")))
	searchname=request.getParameter("searchname");
%>
<html>
<body bgcolor=#336699 >
<center>
<div  style="background-color:white;border-style:solid;border-width:5px;border-color:orange;width:90%;height:600px;box-shadow:3px 3px 15px black;border-radius:20px;padding:20px 20px 20px 20px;text-align:left"  >
<center>
<img src="Images/info.gif" ><font face=Times size=7> Search</font>
</center>
<hr size=10 color="#336699" style="box-shadow:1px 1px 5px aqua" >
<form action=searchusers.jsp method=post>
Name :<input type=text name=searchname size=60 value='<%=searchname%>' required ><input type=submit value="Search" >
</form>
<hr size=10 color="#336699" style="box-shadow:1px 1px 5px aqua" >
<%
String tr="<table width=100% border=2 cellpadding=5 cellspacing=5 ><tr><td>Gender</td><td>UserID</td><td>Name</td><td>Address</td><td>City</td><td>ContactNo</td></tr>";
if(!searchname.equals(""))
{
out.println(tr);
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:mmail");
String msql="select * from usermaster where name like '%"+searchname+"%' or userid like '%"+searchname+"%'";
Statement smt=con.createStatement();
ResultSet rs=smt.executeQuery(msql);
while(rs.next())
	{
	String uid=rs.getString("userid");
	String nm=rs.getString("name");
	String gn=rs.getString("gender");
	String ad=rs.getString("address");
	String ct=rs.getString("city");
	String cn=rs.getString("phoneno");
	String gimg="<img src='Images/"+gn+".jpg' height=40px >";
%>
	<tr><td><%=gimg%></td><td><%=uid%></td><td><%=nm%></td><td><%=ad%></td><td><%=ct%></td><td><%=cn%></td></tr>";
<%

	}
out.println("</table");
con.close();
}
%>
<hr size=10 color="#336699" style="box-shadow:1px 1px 5px aqua" >
</div>
</center>
</body>
</html>