/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.AccountDAO;
import entity.Account;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author linhp
 */
public class login extends HttpServlet {

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
        request.getRequestDispatcher("login.jsp").forward(request, response);
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
        String opt = request.getParameter("opption");
        try {
            if (opt.equalsIgnoreCase("login")) {
                String username = request.getParameter("username");
                String password = request.getParameter("password");

                Account u = AccountDAO.login(username, password);
                if (u != null) {
                    //            System.out.println(u.toString());
                    // start session
                    HttpSession session = request.getSession(true);
                    session.setAttribute("user", u);
//                    session.setMaxInactiveInterval(15 * 60);
                    response.sendRedirect("home");

                    // send direct to index jsp as customer role(1)
                } else {
                    request.setAttribute("mess", "Username or password is incorrect.");
                    //            response.sendRedirect("Login");
                }
            }

            if (opt.equalsIgnoreCase("register")) {
                String name = request.getParameter("fullname");
                String user = request.getParameter("username1");
                String pass = request.getParameter("password1");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                String phone = request.getParameter("phone");
                AccountDAO ls = new AccountDAO();
                Account acc = new Account(name, user, pass, phone, address, email);

//            if(!pass2.equals(repass2)){
//                request.setAttribute("status", "sai pass roi dm");
//                request.setAttribute("name", name2);
//                request.setAttribute("username", user2);
//                request.setAttribute("phoneNum", phoneNum2);
//                request.getRequestDispatcher("signinandup.jsp").forward(request, response);             
//            }
                // fix regrex in validation function
                Account a = ls.checkUserExist(user);
                Account b = ls.checkEmailExist(email);
                if (a == null && b == null) {
                    ls.register(acc);
                    request.setAttribute("status", "Sign Up Success");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                    response.sendRedirect("login/#registerss");
                } else {
                    request.setAttribute("status1", "Your username or email address already exists");
                    request.setAttribute("fullname", name);
                    request.setAttribute("phoneNum", phone);
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                    response.sendRedirect("login");
                }
            }
        }finally {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
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
