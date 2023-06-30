/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dao.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author taing
 */
//@MultipartConfig(
//        location = "images/",
//        fileSizeThreshold = 1024*1024,
//        maxFileSize = 1024*1024*10,
//        maxRequestSize = 1024*1024*11
//)
public class AddProduct extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        String pname = request.getParameter("name");
//        String pimage = request.getParameter("image");
//        String pprice = request.getParameter("price");
//        String pdetail = request.getParameter("detail");
//        String pcategory = request.getParameter("category");
//
//        ProductDAO p = new ProductDAO();
//
//        p.addProduct(pname, pcategory, pdetail, pprice, pimage);
//
//        response.sendRedirect("product");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        RequestDispatcher rd = request.getRequestDispatcher("manageProduct.jsp");
//        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String pname = request.getParameter("name");
            String part = request.getParameter("image");
            String pprice = request.getParameter("price");
            String pdetail = request.getParameter("detail");
            String pcategory = request.getParameter("category");
            
//            String contentDisposition = part.getHeader("content-disposition");
           
            ProductDAO p = new ProductDAO();

            p.addProduct(pname, pcategory, pdetail, pprice, "images/"+ part);

            response.sendRedirect("product");
           
        } catch (Exception e) {
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
