<%-- 
    Document   : picview
    Created on : 6 Feb, 2016, 7:47:09 PM
    Author     : Tarequzzaman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title></title>
    </head>
    <body >

        <form name="Form1">

            <%@ page import ="java.sql.*,java.util.*,java.awt.*,java.io.*" %>

            <%! String id;

                void setID(String ID) {
                    id = ID;

                }
            %>

            <%!                private byte[] getReturnInvoiceDetails() {

                    byte[] image = new byte[3000000];
                    try {

                        int n = 0;
                        n = System.in.available();
                        image = new byte[n];
                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                        Statement st = con.createStatement();
                        String sql = "select photo from logger_info where registration_no="+id+"";
                        ResultSet rs = st.executeQuery(sql);
                        while (rs.next()) {
                            image = rs.getBytes(1);
                            System.out.println("1");

                        }

                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    return image;
                }
            %>

            <%
                try {
                    String ID = request.getParameter("id");

                    setID(ID);
                    byte[] Pic = getReturnInvoiceDetails();
                    response.setContentType("image/png");
                    OutputStream o = response.getOutputStream();
                    o.write(Pic);
                    o.flush();
                    o.close();

               
                } catch (Exception e) {
                 
                }
            %>
        </form>

    </body>
</html>

