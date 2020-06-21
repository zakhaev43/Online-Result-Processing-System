/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Tarequzzaman
 */
@WebServlet(name = "firstServlet", urlPatterns = {"/firstServlet"})
public class firstServlet extends HttpServlet {

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
                String ss= request.getParameter("paper_id");
                request.setAttribute("paper_id", ss);
                long paper= Long.parseLong(ss);
                
                String sql = "SELECT paper_id from paper_information";
                ResultSet rs = st.executeQuery(sql);
                int cou=0;
                while(rs.next())      
                {
                     long paper_id = rs.getInt(1);
                     if(paper_id==paper)
                     {
                         request.getRequestDispatcher("enter_updated_paper_info.jsp").forward(request, response);
                         response.sendRedirect("enter_updated_paper_info.jsp");
                         cou=1;
                         break;
                     }
                     
                }
                if(cou==0)
                {
                    response.sendRedirect("datanotfound.jsp"); 
                }
            } catch (Exception e) {
            }




        } finally {
            out.close();
        }
    }

  
    
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
