<%@page import="java.sql.*,java.io.*;" %>
<html>
<body>
<img src="Images/info.gif" ><font face=Times size=7> New User</font>
<hr size=10 color=wheat>
<%
	String userid=request.getParameter("userid");
	String name=request.getParameter("name");
	String address=request.getParameter("address");
	String city=request.getParameter("city");
	String state=request.getParameter("state");
	String phoneno=request.getParameter("phoneno");
	String emailid=request.getParameter("emailid");
	String pwd=request.getParameter("pwd");
	String dob=request.getParameter("dob");
	String occupation=request.getParameter("occupation");
	String gender=request.getParameter("gender");

	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mmail", "root", "root");
	String msql="insert into usermaster" + "(userid,password,name,address,city,state,phoneno,emailid,gender,dob,occupation) values" + "(?,?,?,?,?,?,?,?,?,?,?)";
	PreparedStatement smt=con.prepareStatement(msql);
	smt.setString(1,userid);
	smt.setString(2,pwd);
	smt.setString(3,name);
	smt.setString(4,address);
	smt.setString(5,city);
	smt.setString(6,state);
	smt.setString(7,phoneno);
	smt.setString(8,emailid);
	smt.setString(9,gender);
	smt.setString(10,dob);
	smt.setString(11,occupation);
	int n=smt.executeUpdate();
	if(n!=0)
		out.println("User Registered <a href=index.jsp>Login</a>");

	else
		out.println("Cannot Register ..<a href=regform.jsp >Try Again</a>");
%>
<hr size=10 color=wheat>
</form>
</body>
</html>