<%-- 
    Document   : reg_validpage
    Created on : 17 Jan, 2016, 12:04:10 PM
    Author     : Tarequzzaman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <title>my firs bootstrap</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">


    </head>

    <%@ page import="java.sql.*"%>  

    <%
        String s = request.getParameter("val");
        if (s == null || s.trim().equals("")) {
            out.print("Please enter id");
        } else {
            int id = Integer.parseInt(s);
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                Statement st = con.createStatement();
                PreparedStatement ps = con.prepareStatement("select Registration_no from student where Registration_no=?");
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                int cou = 0;
                while (rs.next()) {

                    int reg = rs.getInt(1);
                    if (id == reg) {
                        cou = 1;
                    }

                }
                PreparedStatement ps1 = con.prepareStatement("select Registration_no from logger_info where Registration_no=?");
                ps1.setInt(1, id);
                ResultSet rs1 = ps1.executeQuery();
                int count = 0;
                while (rs1.next()) {
                    int reg_no = rs1.getInt(1);
                    if (id == reg_no) {
                        count = 1;
                    }
                }

                if (cou == 1 && count == 0) {
                    out.println("glyphicon glyphicon-ok form-control-feedback pp");
                    
                }else if(cou==0 && count==0){
                     out.println("danger glyphicon glyphicon-remove form-control-feedback xx");
                }
                else{
                    out.println("danger glyphicon glyphicon-remove form-control-feedback xx");
                }
                con.close();
            } catch (Exception e) {
                out.println("danger glyphicon glyphicon-remove form-control-feedback xx");
            }
        }
    %>  




</body>
</html>
