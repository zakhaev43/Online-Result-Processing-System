/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package email;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tarequzzaman
 */
@WebServlet(name = "sendemail", urlPatterns = {"/sendemail"})
public class sendemail extends HttpServlet {

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
            String Email = request.getParameter("Email");
            try {


                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                Statement st = con.createStatement();
                String sql = "select email from logger_info";
                ResultSet rs = st.executeQuery(sql);
                int cou = 0;
                while (rs.next()) {

                    String email = rs.getString(1);

                    if (email.compareTo(Email) == 0) {
                        cou = 1;

                        String host = "smtp.gmail.com";
                        String Password = "tajulkhan";

                        String from = "xmanxen@gmail.com";       //give email id of gmail
                        String toAddress = Email;

                        Properties props = System.getProperties();
                        props.put("mail.smtp.host", host);
                        props.put("mail.smtps.auth", "true");
                        props.put("mail.smtp.starttls.enable", "true");


                        Session session = Session.getInstance(props, null);

                        MimeMessage message = new MimeMessage(session);

                        message.setFrom(new InternetAddress(from));

                        message.setRecipients(Message.RecipientType.TO, toAddress);

                        message.setSubject("Send Password");

                        BodyPart messageBodyPart = new MimeBodyPart();
                        String pass = getpassword();
                        messageBodyPart.setText("Your current password is: " + pass);

                        Multipart multipart = new MimeMultipart();

                        multipart.addBodyPart(messageBodyPart);

                        messageBodyPart = new MimeBodyPart();

                        message.setContent(multipart);

                        try {
                            Transport tr = session.getTransport("smtps");
                            tr.connect(host, from, Password);
                            tr.sendMessage(message, message.getAllRecipients());
                            tr.close();
                            String sql1 = "update logger_info set pass='" + pass + "' where email='" + email + "'";
                            PreparedStatement ps = con.prepareStatement(sql1);
                            ps.execute();
                            response.sendRedirect("emailsend_conferm.jsp");

                        } catch (Exception sfe) {
                            out.print("<h1>" + "Exception occure</h1>");
                        }

                    }

                }

                if (cou == 0) {
                    request.setAttribute("invalid", "error");
                    request.getRequestDispatcher("forgot_pass.jsp").forward(request, response);
                    response.sendRedirect("forgot_pass.jsp");
                }
            } catch (Exception e) {
                request.setAttribute("invalid", "error");
                request.getRequestDispatcher("forgot_pass.jsp").forward(request, response);
                response.sendRedirect("forgot_pass.jsp");
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

    private String getpassword() {
        String pass = "";
        Random rn = new Random();
        for (int i = 0; i < 30; i++) {
            int min = 10000000;
            int max = 99999999;
            long ans = rn.nextInt((max - min) + 1) + min;
            pass = "" + ans;
        }
        return pass;
    }
}
