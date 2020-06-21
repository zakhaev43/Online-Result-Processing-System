/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
/**
 *
 * @author Tarequzzaman
 */
@WebServlet(name = "sign_up", urlPatterns = {"/sign_up"})
public class sign_up extends HttpServlet {

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
        response.sendRedirect("home.jsp");
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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            // Apache Commons-Fileupload library classes
            DiskFileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload sfu = new ServletFileUpload(factory);

            if (!ServletFileUpload.isMultipartContent(request)) {
                System.out.println("sorry. No file uploaded");
                return;
            }

            // parse request
            List items = sfu.parseRequest(request);
            FileItem logged_as = (FileItem) items.get(0);
            String logger_type = logged_as.getString();

            FileItem name = (FileItem) items.get(1);
            String logger_name = name.getString();
            request.setAttribute("logger", logger_name);

            FileItem reg = (FileItem) items.get(2);
            String reg_no =reg.getString();
            request.setAttribute("reg", reg_no);
             
             FileItem session_ = (FileItem) items.get(3);
             String session = session_.getString();
            
             FileItem Email = (FileItem) items.get(4);
             String email = Email.getString();
            
             FileItem home = (FileItem) items.get(5);
             String homet = home.getString();
             
             FileItem pass = (FileItem) items.get(6);
             String password = pass.getString();
             
            
            // get uploaded file
            FileItem file = (FileItem) items.get(8);;

            // Connect to Oracle
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pro", "sec");
            con.setAutoCommit(false);

            PreparedStatement ps = con.prepareStatement("insert into logger_info values(?,?,?,?,?,?,?,?)");
            ps.setString(1,logger_type );
            ps.setString(2, logger_name);
            ps.setString(3, reg_no);
            ps.setString(4, session);
            ps.setString(5, email);
            ps.setString(6, homet);
            ps.setString(7, password);
            ps.setBinaryStream(8, file.getInputStream(), (int) file.getSize());
            ps.executeUpdate();
            con.commit();
            con.close();
         
                        
            request.getRequestDispatcher("create_id.jsp").forward(request, response);
      
            response.sendRedirect("create_id.jsp");
          
        } catch (Exception ex) {
           response.sendRedirect("datanotfound.jsp");
        }
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
