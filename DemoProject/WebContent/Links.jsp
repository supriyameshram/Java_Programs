<html>
<body bgcolor=#336699 >
<style>
a{color:darkblue;text-shadow:1px 1px 5px aqua;font-family:impact;font-size:20px}
a:hover{color:blue;text-shadow:1px 1px 5px aqua;font-family:impact;font-size:20px}
</style>

<Body style="text-shadow:1px 1px 3px aqua;font-size:28px;font-family:arial" >
<center>
<img src="Images/MailBox.png" width=100px ><br>
<font face=Times size=6 color=aqua style="text-shadow:3px 3px 10px darkblue" >Intranet Mail System</font>
<hr size=10 color="#336699" style="box-shadow:3px 3px 10px aqua" >
<%
String uid=(String)session.getValue("uid");
%>
Welcome <%=uid.toUpperCase()%>
<hr size=10 color="#336699" style="box-shadow:3px 3px 10px aqua" >
<Table cellpadding=5px cellspacing=5px >

<tr><td><img src=Images/ring.png width=20 >
<a href="sendmail.jsp" target=f2  >Compose</a>
</td></tr>
<tr><td><img src=Images/ring.png width=20 >
<a href="inbox.jsp" target=f2  >InBox</a>
</td></tr>
<tr><td><img src=Images/ring.png width=20 >
<a href="outbox.jsp" target=f2  >OutBox</a>
</td></tr>
<tr><td><img src=Images/ring.png width=20 >
<a href="searchusers.jsp" target=f2  >Search Users</a>
</td></tr>

<tr><td><img src=Images/ring.png width=20 >
<a href=index.jsp target="_top" >Logout</a>
</td></tr>
</table>

<hr size=10 color="#336699" style="box-shadow:3px 3px 10px aqua" >


</center>
</body>
</html>