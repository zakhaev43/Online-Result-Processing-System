<%-- 
    Document   : enterstdinfo
    Created on : 9 Sep, 2015, 2:16:43 PM
    Author     : Tarequzzaman
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter info</title>
        <style>
            .header{
                background-color: #5EFB6E; 
                text-align: center;
                padding: 30px;
            }
            .into{
                margin-top: 100px;
                text-align: center;
                color: brown;

            }    
            .dropdown{
                padding: 6px 88px;
            }
            .drop_sem{
                padding: 6px 110px;
            }
            .drop_course{
                padding: 6px 98px;
            }
        </style>
        <script>
            
            function myfunction()
            {
                var data_true=0;
                var paper= document.getElementById("paper").value;
                if(paper=="" || paper==null)
                    {
                        document.getElementById("b").innerHTML="please enter the papre id";
                        data_true=1;
                    }
                if(pap)
                var  course= document.getElementById("course").value;
                if(course=="1")
                {
                    document.getElementById("c").innerHTML="Please Select A course";
                       data_true=1;             
                }
                    
        var mark = document.getElementById("mark").value;
        if(mark==null || mark=="")
            {
              data_true=1;
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
        <div class="header">
            <h1>Welcome to result Processing System</h1>
        </div>
        <div class="main">
            <div class="into">
                <h2>Enter information</h2>
            </div>
            <div class="data">
           <center>
           <form  action="getdta_from_partA_into_db.jsp" onsubmit="return myfunction()" method="post">
           <%
      
               String semester= request.getParameter("semester");
               String session_ = request.getParameter("session");
               
               out.print(""+semester+"  "+session_);
       
            %>
            <input type="hidden" name="session" value="<%=session_%>">
                        <input type="hidden" name="semester" value="<%=semester%>">

                        <table>                   
                            <tr>
                                <td>
                                    <input type="text" name="paper_id" id="paper" placeholder="Paper ID" style="width: 300px;height: 25px">
                                    <span style="color:red;list-style:none;font-size:12px;font-weight:bold;"></span><br>
                                    <div>
                                        <span id ="b" style="color: red;"> </span>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>

                                    <input type="text" required name="marks" id="mark" placeholder="Marks" style="width: 300px;height: 25px">
                                </td>
                            </tr>
                        </table>
                        <div class="entering">
                            <center> 
                                <input type="submit" value="Submit" style="padding: 3px; margin-top: 7px;">
                            </center>
                        </div>

                    </form>
                </center>
            </div>

        </div>
        <div class="footer">

        </div>
    </body>
</html>
