<%-- 
    Document   : result_not_process
    Created on : 11 Jan, 2016, 9:44:29 PM
    Author     : Tarequzzaman
--%>

<%@page import= "com.student_validity"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <title>JSP Page</title>

        <script>
            function myfunction()
            {
                var data_true=0;
         
                var reg = document.getElementById("reg_no").value;
                var length= reg.length;

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
                    <a href="templete.jsp" class="navbar-brand">SEC</a>
                </div>

                <div class="collapse navbar-collapse" id="navbar-collapse">
                    
                    <ul class="nav navbar-nav" >
                        <li><a href="#">Home</a>  </li>
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
                    <a href="templete_1.jsp" class="btn btn-info navbar-btn btn-sm navbar-right">Sign Out</a>
                    <% String name = (String) session.getAttribute("logger");%>
                    <ul class="nav navbar-nav navbar-right" >
                        
                         <li><a href="#"><%=name%></a>  </li>
                    </ul>
                    <%}%>
                </div>
            </div>
        </nav>
        <div class="jumbotron">
            <div class="container-fluid">

                <hr>

                <h1><a href="templete.jsp"> <img src="image/bd_logo.png" style="width:100px;height: 100px" /></a> Sylhet Engineering College</h1>                           

            </div>

        </div>
        <div class="container">

            <div class="row">
                <div class="col-md-4">
                    <blockquote>
                        <p>"There are no secrets to success. It is the result of preparation, hard work learning from failure."</p>
                        <footer>General Colin Powell</footer>
                    </blockquote>
                </div>
                <div class="col-md-4">
                    <blockquote>
                        <p>"The best way to finish an unpleasant task is to get started"</p>
                        <footer>Anonymous</footer>
                    </blockquote>
                </div>
                <div class="col-md-4">
                    <blockquote>
                        <p>"Don’t wait. The time will never be just right."</p>
                        <footer>Napoleon Hill</footer>
                    </blockquote>
                </div>
            </div>
        </div>
                <div class="text-center">
                    <h2><strong>Result is not published yet</strong></h2>
                </div>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
