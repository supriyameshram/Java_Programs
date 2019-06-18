<html>
<body bgcolor=#336699 >
<center>
<div  style="background-color:white;border-style:solid;border-width:5px;border-color:orange;width:90%;height:600px;box-shadow:3px 3px 15px black;border-radius:20px;padding:20px 20px 20px 20px;text-align:left"  >
<center>
<img src="Images/info.gif" ><font face=Times size=7> Compose</font>
</center>
<hr size=10 color="#336699" style="box-shadow:1px 1px 5px aqua" >
<form action=postmail.jsp method=post>

<table>
<tr><td>To</td><td><input type=text name=mailto size=60 required ></td></tr>
<tr><td>Subject</td><td><input type=text name=subject size=60 required ></td></tr>
<tr><td>message</td><td><textarea name=message rows=5 cols=50 required ></textarea></td></tr>
<tr><td></td><td><input type=submit value="Send" > <input type=reset value="Reset" ></td></tr>
</table>
<hr size=10 color="#336699" style="box-shadow:1px 1px 5px aqua" >
</form>
</div>
</center>
</body>
</html>