<%@page import="java.sql.*,java.util.*" %>
<html>
<body bgcolor=#336699 >
<center>
<div  style="background-color:white;border-style:solid;border-width:5px;border-color:orange;width:90%;height:600px;box-shadow:3px 3px 15px black;border-radius:20px;padding:20px 20px 20px 20px;text-align:left"  >
<center>
<img src="Images/info.gif" ><font face=Times size=7> Compose</font>
</center>
<%
java.util.Date d=new java.util.Date();
String mtolist=request.getParameter("mailto");
String sub=request.getParameter("subject");
String msg=request.getParameter("message");
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:mmail");
PreparedStatement smt=con.prepareStatement("insert into mails(mailfrom,mailto,mdate,message,subject) values(?,?,?,?,?)");
StringTokenizer stk=new StringTokenizer(mtolist,",");
String s="";
while(stk.hasMoreTokens())
	{
	String mto=stk.nextToken();
	String msql="select * from usermaster where userid='"+mto+"'";
	Statement smtx=con.createStatement();
	ResultSet rs=smtx.executeQuery(msql);
	if(rs.next())
		{
		smt.setString(1,(String)session.getValue("uid"));
		smt.setString(2,mto);
		smt.setString(3,d.toString());
		smt.setString(4,msg);
		smt.setString(5,sub);
		smt.executeUpdate();
		s=s+"Mail send to :"+mto+"<br>";
		}
	else
		s=s+"Mail cannot be send to :"+mto+"<br>";
	}
%>
<%=s%>
<hr size=10 color="#336699" style="box-shadow:1px 1px 5px aqua" >
</div>
</center>
</body>
</html>