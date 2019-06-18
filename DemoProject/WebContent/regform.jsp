<html>
<body bgcolor=#336699 >
<center>
<br>
<div  style="background-color:white;border-style:solid;border-width:5px;border-color:orange;width:700px;box-shadow:3px 3px 25px black"  >
<font face=arial size=7 color=aqua style="text-shadow:3px 3px 10px darkblue" > Registration Form</font>
<hr size=10 color=#336699 >
<form action=reg.jsp method=post>
<table>
<tr><td>Name</td><td><input type=text name=name required size=40></td></tr>
<tr><td> Gender</td><td><select name=gender ><option>male</option><option>female</option></select></td></tr>
<tr><td>Date of Birth</td><td><input type=date  required name=dob size=40></td></tr>
<tr><td>Address</td><td><input type=text name=address required size=40></td></tr>
<tr><td>City</td><td><input type=text name=city required size=40></td></tr>
<tr><td>State</td><td><input type=text name=state required size=40></td></tr>
<tr><td>Phone No</td><td><input type=text name=phoneno  required size=40></td></tr>
<tr><td>Alternate Email-ID</td><td><input type=email name=emailid size=40></td></tr>
<tr><td>Occupation</td><td><select name=occupation><option>Student</option><option>Teacher</option><option>Staff</option></select> </td></tr>
<tr><td>User ID</td><td><input type=text required name=userid size=10></td></tr>
<tr><td>Password</td><td><input type=password required name=pwd size=10></td></tr>
<tr><td>Confirm</td><td><input type=password required name=confirm size=10 ></td></tr>
</table>
<hr size=10 color=#336699 ><br>
<input type=Submit value="Register Me" > <input type=Reset >

<br><br>
<hr size=10 color=#336699 >
<a href=index.jsp ><img src=Images/home.png width=50px ></a>
</form>
</div>
</center>
</body>
</html>