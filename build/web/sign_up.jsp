<%-- 
    Document   : sign_up
    Created on : 11 Jan, 2016, 12:13:06 AM
    Author     : Tarequzzaman
--%>
<%@page import= "com.sign_up"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/bootstrap.min.css" rel="stylesheet">
          <link href="css/style.css" rel="stylesheet">
        <title>Sign Up</title>

        <script>
            var data_true=0;
            function myfunction()
            {
              
                var logger = document.getElementById("logged_as").value;
                if(logger=="0" || logger==null)
                {
                    document.getElementById("a").innerHTML="Please select a User";
                    data_true=1;
                
                }
                else {
                    document.getElementById("a").innerHTML=""; 
                }
            
                var name = document.getElementById("name").value;
                var count=0;
                if(name=="null"|| name=="")
                {
                    document.getElementById("c").innerHTML="Please Enter your name";
                    data_true=1;
                }
                else{
                    document.getElementById("c").innerHTML=""; 
                }
            
                var reg = document.getElementById("reg_no").value;
                var length= reg.length;

                if(reg==""|| reg==null)
                {
                    document.getElementById("b").innerHTML="Please Enter your Registration number";
                    data_true=1;
                       
                }
                    
                else  if(length!=10 || length>10)
                {
                    document.getElementById("b").innerHTML="Invalid Registration Number";
                    data_true=1;
                       
                }
                else if (length==10 && data_true==1){
                    document.getElementById("b").innerHTML="Already registered";
                   
                }
                  
              
                var session = document.getElementById("session").value;
                var len= session.length;
                var i,cou=0,count=0;
                var sp =0;
                if(session==""|| session==null)
                {
                    document.getElementById("e").innerHTML="Please enter a Session" ;
                    data_true=1;
                       
                }
                else{
                     
                    
                    for(i=0;i<len;i++)
                    {
                        if(sp==0 && session[i]>='0' && session[i]<='9')  
                        {
                            count++;   
                        }
                        else if(session[i]=='-')
                        {
                            sp=1;   
                        }
                        else if(sp==1 &&  session[i]>='0' && session[i]<='9' )
                        {
                            cou++;   
                        }
                        else{
                            document.getElementById("e").innerHTML="Formet 2012-2013 no space or other charecter"; 
                            data_true=1;
                       
                        }
                    }
                     
                    if(count!=4 && cou!=4 && sp!=1)
                    {
                        document.getElementById("e").innerHTML="Please enter Correct Session";  
                        data_true=1;
                       
                    }
                    else{
                        document.getElementById("e").innerHTML="";   
                    }
                }
                var email = document.getElementById("Email").value;
                if(email==null|| email==""){
                    data_true=1;
                    document.getElementById("d").innerHTML="Emter your gmail Address";
                }
                else{
                    document.getElementById("d").innerHTML=""; 
                }
            
                var pass=document.getElementById("pass").value;
                var len = pass.length;
                var reenterpass= document.getElementById("pass1").value;
                if(pass==null || pass=="")
                {
                    data_true=1;
                    document.getElementById("f").innerHTML="Enter password";
                }
                else if(len<8)
                {
                    data_true=1;
                    document.getElementById("f").innerHTML="Password minimum length 8 charecter";
                }
                else if(pass!=reenterpass)
                {
                    data_true=1;
                    document.getElementById("f").innerHTML="Password don't match";
                }
                else{
                    document.getElementById("f").innerHTML=null;
                }
                var home= document.getElementById("home").value;
                if(home==null|| home=="")
                    {
                        data_true=1;
                        document.getElementById("m").innerHTML="Enter your Hometown"
                    }
                    
                var file = document.getElementById("file").value;
                if(file==null || file =="")
                {
                    data_true=1;
                    document.getElementById("q").innerHTML="Please enter a file";
                }
                else{
                    document.getElementById("q").innerHTML="";
                }
                    
                
                if(data_true==0)
                {
                    return true;
                }
                else 
                {
                    return false;
                }
            }
        </script>
        <style>
            .pp{
                color:#4F8A10;
            }
            .xx{
                color:#D8000C;
            }


        </style>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.26/angular.min.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top info" id="mynavbar">
            <div class="container-fluid">
                <div class="navbar-header info">

                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="home.jsp" class="navbar-brand">SEC</a>
                </div>

                <div class="collapse navbar-collapse" id="navbar-collapse">

                    <ul class="nav navbar-nav" >
                        <li><a href="home.jsp">Home</a>  </li>
                        <li><a href="#">Photo Gallary</a>  </li>
                        <li><a href="#">Student Profile</a>  </li>
                        <li><a href="templete.jsp">Result</a>  </li>
                        <li><a href="#">About us</a>  </li>
                        <li><a href="#">Contact</a>  </li>

                    </ul>
                </div>
            </div>
        </nav>
        <div class="jumbotron">
            <div class="container-fluid">

                <hr>

                <div class="row">
                    <div class="col-lg-12">
                        <div class="col-sm-1">
                            <div class="img-responsive">
                                <a href="templete.jsp"> <img src="image/bd_logo.png" /></a>
                            </div>  
                        </div>
                        <div class="col-sm-10">
                            <h1>Sylhet Engineering College</h1>
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <section>

            <div class="container">




                <br>  
                <div class="col-lg-3">

                </div>

                <div class="col-lg-9">
                    <div>
                        <div class="col-lg-1">
                            <div class="img-responsive">
                                <a href="sign_up.jsp"> <img src="image/signup.png" /></a>
                            </div>  
                        </div>
                        <div class="col-lg-10">
                            <h1>Sign Up</h1>
                        </div>
                    </div>
                    <form action="sign_up" enctype="multipart/form-data" id="identicalForm" class="form-horizontal" onsubmit="return myfunction()" method="post">

                        <br>
                        <div class="form-group">

                            <div class="col-lg-7">
                                <select class="form-control" id="logged_as" name="logged_as">
                                    <option value="0">Select User</option>

                                    <option value="student">Student</option> 
                                </select>
                            </div>
                            <span style="color:red;"></span><br>
                            <div class="col-lg-5">
                                <span id ="a" style="color: red;"> </span>
                            </div>
                        </div>
                        <div class="form-group">

                            <div class="col-lg-7">
                                <input type="text" class="form-control" id="name" name="name"  placeholder="Enter Your Name">
                            </div>
                            <span style="color:red;"></span><br>
                            <div class="col-lg-5">
                                <span id ="c" style="color: red;"> </span>
                            </div>
                        </div>
                        <script>  
                            var request;  
                            function sendInfo1()  
                            {  
                                var v=document.getElementById("reg_no").value;  
                                var url="reg_validpage.jsp?val="+v;  
  
                                if(window.XMLHttpRequest){  
                                    request=new XMLHttpRequest();  
                                }  
                                else if(window.ActiveXObject){  
                                    request=new ActiveXObject("Microsoft.XMLHTTP");  
                                }  
  
                                try{  
                                    request.onreadystatechange=getInfo;  
                                    var s= request.open("GET",url,true);
                                  
                                    request.send();  
                                }catch(e){alert("Unable to connect to server");}  
                            }  
                            var val1=null;
                            var cou=0;
                            function getInfo(){  
                                if(request.readyState==4|| request.readyState==200){  
                                    var val=request.responseText;   
                                   
                                 
                                  
                                    document.getElementById("ok").className = val; 
                                  
                                   
                                    if(val!=val1)
                                    {
                                        val1=val;
                                        cou++;
                                    }
                                    
                                    if(cou%2==0){
                                        data_true=0;   
                                    }
                                    if(cou%2==1){
                                        data_true=1;
                                       
                                    }
                                }  
                            }  
  
                        </script>
                        <div class="form-group">

                            <div class="col-lg-7 has-feedback">
                                <input type="text" name="reg" class="form-control" id="reg_no" onkeyup="sendInfo1()"  placeholder="Enter Your Registration No">
                                <span id="ok"></span>
                            </div>
                            <span style="color:red;"></span><br>
                            <div class="col-lg-5">
                                <span id ="b" style="color: red;"> </span>
                            </div>
                        </div>


                        <div class="form-group">

                            <div class="col-lg-7">
                                <input type="text" name="session_" class="form-control" id="session"  placeholder="Enter Your Session">
                            </div>
                            <span style="color:red;"></span><br>
                            <div class="col-lg-5">
                                <span id ="e" style="color: red;"> </span>
                            </div>
                        </div>
                        <div class="form-group">

                            <div class="col-lg-7">
                                <input type="Email" class="form-control" id="Email" placeholder="Enter Your Email ID" name="Email">
                            </div>
                            <span style="color:red;"></span><br>
                            <div class="col-lg-4">
                                <span id ="d" style="color: red;"> </span>
                            </div>
                        </div>
                          <div class="form-group">

                            <div class="col-lg-7">
                                <input type="text" class="form-control" id="hometown" placeholder="Enter Your Home Town" name="home">
                            </div>
                           
                            <div class="col-lg-4">
                                <span id ="m" style="color: red;"> </span>
                            </div>
                        </div>
                        <script>
            
                            function sendInfo(str){
                                var x=   document.getElementById("pass").value;
                          
                                if(x==str)
                                {
                                  
                                    document.getElementById("tareq").className = "glyphicon glyphicon-ok form-control-feedback pp";
                                }
                                else{
                                    document.getElementById("tareq").className = "danger glyphicon glyphicon-remove form-control-feedback xx";
                                }
                            }
                        </script>
                        <div class="form-group">

                            <div class="col-lg-7">
                                <input type="password" name="pass" class="form-control" id="pass" placeholder="Enter Your Password" >


                            </div>

                        </div>

                        <div class="form-group">

                            <div class="col-lg-7 has-feedback">
                                <input type="password" class="form-control" id="pass1" onkeyup="sendInfo(this.value)" placeholder="Re-enter Password" name="confirmPassword">
                                <span id="tareq"></span>
                            </div>
                            <span style="color:red;"></span><br>
                            <div class="col-lg-5">
                                <span id ="f" style="color: red;"> </span>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-lg-7">
                                <label for ="file" class="control-label">Upload Your Profile Pic</label>
                                <input id="file" name="file" type="file" accept="image/*" class="file-loading">
                                <span style="color:red;"></span>
                                <span id ="g" style="color: red; ">The image size must be 140px * 140px</span>
                            </div>
                            <div class="col-lg-5">
                                <span id ="q" style="color: red;"> </span>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-lg-5 col-lg-offset-3">
                                <button type="submit" class="btn btn-sm btn-info">Submit</button>

                            </div>
                        </div>

                    </form>
                </div>
            </div>

        </section>
         <footer class="footer ">
            <div class="text-center">
                <div class="container">
                    <%@ page import="java.io.*,java.util.*" %>
                    <%
                        Calendar calendar = new GregorianCalendar();
                        int year = calendar.get(Calendar.YEAR);
                    %>
                    <p class="text-muted">Copyright &COPY 2015 to <%=year%> <br>by Department Of CSE All rights reserved </p>
                </div>
            </div>
           
        </footer>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

        <script src="js/bootstrap.min.js"></script>
    </body>
</html>

