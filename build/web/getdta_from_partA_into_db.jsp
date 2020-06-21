


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .header{
                background-color: #5EFB6E; 
                text-align: center;
                padding: 30px;
            }
            .mainmanu{
                text-align: center;
                align: center;
            }
            .main1{
                margin-top: 200px;
                width: 300px;
                height: 200px;
                overflow:hidden; 

            }
            .main1 ul{

                margin: 0;
                padding:0;
                list-style:none;
            }
            .main1 ul li{

                float:none;
                border:2px solid #ddd;
            }
            .main1 ul li a{
                text-decoration: none;
                color:#000;
                display: block;
                padding: 10px 20px;
            }
            .main1 ul li a:hover{
                background-color: darkorange;
            }
        </style>
        <link href="css/text.css" rel=" stylesheet" type="text/css" media="print">
    </head>
    <body>
        <div class ="main">
            <div class="header">

                <h1>Welcome to result Processing System</h1>
            </div>
            <div class="mainmanu">
                <%

                    String sem = request.getParameter("semester");
                    String session_ = request.getParameter("session");
                    out.println(""+sem+""+session_);
                    int semester= Integer.parseInt(sem);                    
                %>
              
  <%
                    String pp = "", course_id = "";
                    int paper_id = 0;
                    float marks = 0;
                    try {
                        pp = request.getParameter("paper_id");
                        paper_id = Integer.parseInt(pp);
                       
                        String mark = request.getParameter("marks");
                        marks = Float.parseFloat(mark);
                    } catch (Exception e) {
                %>
              
                <%                         }
                %>
                <%@ page import = "java.sql.*" %>  
                <%
                    try {
                         //out.print("<p>-"+registration+"-</p>");
                       Class.forName("oracle.jdbc.driver.OracleDriver");
                        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                        long registration_no = 0;
                        ResultSet rs;
                        String sql1="select registration_no from paper_information where paper_id = "+ paper_id +" and session_='" + session_ + "' and semester=" + semester + "";
                        String sql2="select course_id from paper_information where paper_id = "+ paper_id +" and session_='" + session_ + "' and semester=" + semester + "";
                        Statement st = con.createStatement();
                        rs = st.executeQuery(sql1);
                        while (rs.next()) {
                            registration_no = rs.getInt(1);
                        }
                        if(registration_no==0)
                        {
                      %>
                      
                      <jsp:forward page="Errorpage.jsp"/>
                      <%
                        }
                         rs = st.executeQuery(sql2);
                        while (rs.next()) {
                          course_id= rs.getString(1);
                        }
                        if(course_id==""|| course_id==null)
                        {
                      %>
                      
                      <jsp:forward page="Errorpage.jsp"/>
                      <%
                        }
                       
                        
                        
                        String sql = "insert into partA(paper_id ,registration_no,session_,semester,course_id,marks_partA,count_partA) values(" + paper_id + "," + registration_no + ",'" + session_ + "'," + semester + ",'" + course_id + "'," + marks + ",partA_tag.nextval)";
                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.execute();
                       out.println("<center><h1> Data has been inserted succesfully </h1></center>");
                %>



                <%

                } catch (Exception e) {
                   out.println("" + e);
                %>
               
                <%                     }
                %>


            </div>
            <div class="footer">


            </div>
        </div>

    </body>
</html>
