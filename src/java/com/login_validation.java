/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Tarequzzaman
 */
@WebServlet(name = "login_validation", urlPatterns = {"/login_validation"})
public class login_validation extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                Statement st = con.createStatement();
                String Email = request.getParameter("Email");
                String password = request.getParameter("password");
                String sql = "SELECT logger_name,registration_no ,pass from logger_info where email='" + Email + "'";
                ResultSet rs = st.executeQuery(sql);
                int cou = 0;
                while (rs.next()) {
                     String name= rs.getString("logger_name");
                     int reg = rs.getInt("registration_no");
                    String pass = rs.getString("pass");
                  
                    if (password.equals(pass)){
                       HttpSession session = request.getSession();
                         session.setAttribute("reg", ""+reg);
                        session.setAttribute("logger",name);
                       request.getRequestDispatcher("home.jsp").forward(request, response);
                       response.sendRedirect("home.jsp");
                        cou = 1;
                    }
                }
                if(cou==0){
                    request.setAttribute("email", Email);
                    request.setAttribute("pass",password);
                        request.setAttribute("error","error" );
                      request.getRequestDispatcher("login.jsp").forward(request, response);
                       response.sendRedirect("login.jsp");
                }

            } catch (Exception e) {
            }
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
