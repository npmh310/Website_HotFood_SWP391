/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.CartDAO;
import entity.Account;
import entity.CartDetail;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 *
 * @author linhp
 */
@WebServlet(name = "AddtoCart", urlPatterns = {"/AddtoCart"})
public class AddtoCart extends HttpServlet {

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
        
        HttpSession session = request.getSession(false);
        String pID = request.getParameter("pid");
        CartDAO c = new CartDAO();
//        String check = request.getParameter("checkWeb");
//        String URL = "home";
        
//        if(check.equals("cate")){
//            URL = "category";
//        }
        
        Account user = null;
        if (session != null){
            user = (Account) session.getAttribute("user");
            String CartId = c.getCartId(user.getaId());
            if(CartId == null){
                c.setCartId(user.getaId());
                CartId = c.getCartId(user.getaId());
            }

            c.addToCart(CartId, pID, 1);
            ArrayList<CartDetail> listItems = c.getAllCartItems(CartId);
            
//            System.out.println(listItems);
            
            
            session.setAttribute("listCart", listItems);
        }else{
            response.sendRedirect("login");
        }
            
//        String CartId = c.getCartId(user.getaId());
//        if(CartId == null){
//            c.setCartId(user.getaId());
//            CartId = c.getCartId(user.getaId());
//        }
//        
//        c.addToCart(CartId, pID, 1);
        request.getRequestDispatcher("home").forward(request, response);
        
//        System.out.println(CartId);
        
//        ArrayList<CartDetail> items = c.getAllCartItems(CartId);
//        int countItems = items.size();
//        ArrayList<Product> listProd = new ArrayList();
//        for (CartDetail cd : items) {
//            Product p = cd.getItems();
//            listProd.add(p);
//        }
//        
//        
//        System.out.println(countItems);
        
//        for (Product product : listProd) {
//            if(pID.equals(product.getpId())){
//                
//            }
//            
//        }
        
//        c.addToCart(CartId, pID, 1);
        
//        request.setAttribute("countItems", countItems);
//        response.sendRedirect("home");
        
        
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
