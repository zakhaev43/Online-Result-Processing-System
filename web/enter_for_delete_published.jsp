<%-- 
    Document   : enter_for_delete_published
    Created on : 11 Feb, 2016, 1:53:58 AM
    Author     : Tarequzzaman
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <style>

        </style>
        <title>SEC</title>


        <script>
            function myfunction()
            {
                var data_true=0;
         
                var reg = document.getElementById("reg_no").value;
                var length = reg.length;

                if(reg==""|| reg==null)
                {
                    document.getElementById("b").innerHTML="Please Enter your Registration number";
                    data_true=1;
                       
                }
                    
                else  if(length!=10)
                {
                    document.getElementById("b").innerHTML="Invalid Registration Number";
                    data_true=1;
                       
                }
                else{
                    for(var i =0;i<length;i++)
                    {
                        if(reg[i]>='0'&& reg[i]<=9)
                        {
                            document.getElementById("b").innerHTML=null;
                        }
                        else
                        {
                            document.getElementById("b").innerHTML="Invalid Charecter use,Plsease Use Correct Registration Number";
                            data_true=1;
                       
                        }
                    }
                }
                    
                        
                 
                var sem = document.getElementById("semester").value;
                if(sem=="0")
                {
                    document.getElementById("d").innerHTML="Please Select a Semester";
                    data_true=1;
                       
                  
                }
                else{
                    document.getElementById("d").innerHTML=null;
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
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top" id="mynavbar">
            <div class="container-fluid">
                <div class="navbar-header">

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


                    <input type="hidden" class="btn btn-info navbar-btn btn-sm navbar-right">
                    <% if (session.getAttribute("logger") == null) {%>
                    <a href="login.jsp" class="btn btn-info navbar-btn btn-sm navbar-right">Sign In</a>
                    <%} else {%>

                    <% String name = (String) session.getAttribute("logger");%>
                    <a href="templete_1.jsp" class="btn btn-info navbar-btn btn-sm navbar-right">Sign Out</a>
                    <ul class="nav navbar-nav navbar-right" >

                        <li><a href="profile.jsp"><%=name%></a>  </li>
                    </ul>
                    <%}%>
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


                    <div class="col-lg-4">

                    </div>
                    <div class="col-lg-8">

                        <form action="delete_sesson_sem_for_result_public.jsp" class="form-horizontal" onsubmit="return myfunction()" method="post">
                            <div class="col-lg-12">

                            </div>
                            <div class="form-group">                                
                                <label for="semester" class="col-lg-2 control-label"> Semester</label>
                                <div class="col-lg-6">
                                    <select class="form-control" id="semester" name="semester">
                                        <option value="0">Enter a semester</option>
                                        <option value="1">1st</option>
                                        <option value="2">2nd</option>
                                        <option value="3">3rd</option>
                                        <option value="4">4th</option>
                                        <option value="5">5th</option>
                                        <option value="6">6th</option>
                                        <option value="7">7th</option>
                                        <option value="8">8th</option>
                                    </select>
                                </div>
                                <span style="color:red;"></span><br>
                                <div class="col-lg-4">
                                    <span id ="d" style="color: red;"> </span>
                                </div>
                            </div>
                            <div class="form-group">
                                <label  for="session" class="col-lg-2 control-label">Session</label>
                                <div class="col-lg-6">
                                    <input type="text" class="form-control" id="session" placeholder="Enter Your Session" name="session">
                                </div>
                                <span style="color:red;"></span><br>
                                <div class="col-lg-4">
                                    <span id ="e" style="color: red;"> </span>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-lg-6 col-lg-offset-2">
                                    <button type="submit" class="btn btn-info">Submit</button>
                                </div>
                            </div>
                        </form>
                        <hr>
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