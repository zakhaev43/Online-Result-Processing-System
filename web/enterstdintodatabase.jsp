<%-- 
    Document   : enterstdintodatabase
    Created on : 19 Oct, 2015, 9:42:42 PM
    Author     : Tarequzzaman
--%>

<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter databse</title>
    </head>
    <body>
        <%
          String std_name,reg,year;
          std_name = request.getParameter("std_name");
          if(std_name.compareTo("")==0)
          {
          %>
          <jsp:forward page="Errorpage.jsp"/>
          <%
          }
          reg = request.getParameter("reg");
          
          if(reg.compareTo("")==0)
          {
          %>
          <jsp:forward page="Errorpage.jsp"/>
          <%
          }

          year = request.getParameter("session");
          if(year.compareTo("")==0)
          {
          %>
          <jsp:forward page="Errorpage.jsp"/>
          <%
          }

        %>
        
        
        
        <%@ page import = "java.sql.*" %>  
            <%
                try {

                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                    Statement st = con.createStatement();
                    String sql = "insert into student(student_name,registration_no,session_,count_std) values('" + std_name + "','" + reg + "','" + year + "',student_tag.nextval)";
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.execute();
                   out.println("<center><h1> Data has been inserted succesfully </h1></center>");
                    
            %>
   
             
            
            <%
        
                } catch (Exception e) {
                    %>
                    <jsp:forward page="Errorpage.jsp"/>
                   <%
                                      }
            %>
    </body>
</html>
