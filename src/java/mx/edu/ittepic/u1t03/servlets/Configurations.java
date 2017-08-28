/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ittepic.u1t03.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author desarrollo-001
 */
@WebServlet(name = "Configurations", urlPatterns = {"/Configurations"})
public class Configurations extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Configuraciones</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Mensaje recibido</h1>");
            out.println("<h2>" + request.getMethod() + "</h2>");
            out.println("<p>accept: " + request.getHeader("accept") + "<br>");
            out.println("accept-language: " + request.getHeader("accept-language") + "<br>");
            out.println("cache-control: " + request.getHeader("cache-control") + "<br>");
            out.println("user-agent: " + request.getHeader("user-agent") + "<br>");
            out.println("ua-cpu: " + request.getHeader("ua-cpu") + "<br>");
            out.println("accept-ecoding: " + request.getHeader("accept-ecoding") + "<br>");
            out.println("host: " + request.getHeader("host") + "<br>");
            out.println("connection: " + request.getHeader("connection") + "</p><br>");
            out.println("<h2>Parámetros Recibidos</h2>");
            String[] params = request.getQueryString().split("&");
            out.println("<p>");
            for (int i=0; i<params.length; i++) {
                out.println("<strong>" + (i+1)+". "+params[i] + "</strong><br>");
            }
            out.println("</p>");

            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
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
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
