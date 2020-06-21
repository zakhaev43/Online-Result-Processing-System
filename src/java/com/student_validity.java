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
@WebServlet(name = "student_validity", urlPatterns = {"/student_validity"})
public class student_validity extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException,ArrayIndexOutOfBoundsException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                Statement st = con.createStatement();
                String registration = request.getParameter("reg");

                request.setAttribute("reg", registration);
                long reg = Long.parseLong(registration);

                String semester = request.getParameter("semester");
                int  s = Integer.parseInt(semester);
                request.setAttribute("semester", semester);
                String session_ = request.getParameter("session");
                request.setAttribute("session", session_);

                String sql = "SELECT registration_no,student_name from student where session_='" + session_ + "' and registration_no=" + reg + "";
                ResultSet rs = st.executeQuery(sql);
                int cou = 0;
                while (rs.next()) {
                    int reg_no = rs.getInt(1);
                    String name = rs.getString(2);
                    request.setAttribute("name", name);
                    cou = 1;
                }
              if(cou==0)
              {
                   response.sendRedirect("datanotfound.jsp");
              }
             String sql1 = "SELECT * from result_published";
             ResultSet rs1=st.executeQuery(sql1);
             int tag =0;
              while(rs1.next()){
                  String sessi = rs1.getString(1);
                  int sem= rs1.getInt(2);
                  if(sessi.compareTo(session_)==0 && sem==s){
                    
                      tag=1;
                  }
              }
               
              if(cou==1 && tag==1)
               {
          RequestDispatcher dispatcher = request.getRequestDispatcher("result_view.jsp");
           dispatcher.forward( request, response );
               }
             
              else
               {
                   
                   response.sendRedirect("result_not_process.jsp");
               }
              
              con.close();
               rs.close();
               rs.close();
               st.close();
               out.close();
            } catch (Exception e) {
               out.print(e);
            
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
