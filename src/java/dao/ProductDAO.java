/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DatabaseInfo;
import entity.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import entity.Product;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author linhp
 */
public class ProductDAO implements DatabaseInfo{
    
    public static Connection getConnect() {
        try {
            Class.forName(DRIVERNAME);
        } catch (ClassNotFoundException e) {
            System.out.println("Error loading driver" + e);
        }
        try {
            Connection con = DriverManager.getConnection(DBURL, USERDB, PASSDB);
            System.out.println("Connect database success!");
            return con;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return null;
    }
    
    public static Product getProductById(String id){

        String query = "Select * from Product where pID = ?";
        try ( Connection con = getConnect()) {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, id);
            ResultSet  rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1), rs.getString(2), rs.getString(6), rs.getFloat(5), rs.getString(4), rs.getString(3));           
            }
        } catch (Exception e) {
        }
        return null;
    }
//    
    public static ArrayList<Product> getAllProduct(){
        
        ArrayList<Product> ls = new ArrayList<>();
        String query = "Select * from Product";
        try ( Connection con = getConnect()) {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet  rs = ps.executeQuery();
            while (rs.next()) {
                ls.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(6), rs.getFloat(5), rs.getString(4), rs.getString(3)));           
            }
            return ls;
        } catch (Exception e) {
        }
        return null;
    }
    
    public static ArrayList<Product> getProductByIdCate(String id){
        
        ArrayList<Product> ls = new ArrayList<>();
        String query = "Select * from Product where CateID = ?";
        try ( Connection con = getConnect()) {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, id);
            ResultSet  rs = ps.executeQuery();
            while (rs.next()) {
                ls.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(6), rs.getFloat(5), rs.getString(4), rs.getString(3)));           
            }
            return ls;
        } catch (Exception e) {
        }
        return null;
    }
    
    public ArrayList<Category> getAllCate(){
        
        ArrayList<Category> ls = new ArrayList<>();
        String query = "Select * from Category";
        try ( Connection con = getConnect()) {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet  rs = ps.executeQuery();
            while (rs.next()) {
                ls.add(new Category(rs.getInt(1), rs.getString(2)));           
            }
            return ls;
        } catch (Exception e) {
        }
        return null;
    }
    
    
//    
//     public static int add(Product p) {
//        int rs;
//        try (Connection con = getConnect()) {
////            System.out.println(con);
//            PreparedStatement ps = con.prepareStatement("Insert into menu(  productName, type, productPrice, about, imageUrl) VALUES (?,?,?,?,?)");
//            ps.setString(1, p.getName());
//            ps.setString(2, p.getType());
//            ps.setInt(3, p.getPrice());       
//            ps.setString(4, p.getAbout());
//            ps.setString(5, p.getUrl());
//            rs = ps.executeUpdate();
//            con.close();
//            return rs;
//        } catch (Exception ex) {
////            Logger.getLogger(MajorDB.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return -1;
//    }
//    
//    public void update(Product p) {
//        String query = "UPDATE menu SET productName=?, type=?, productPrice=?, about=?, imageUrl=?\n"
//                + " WHERE idProduct =?";
//        try (Connection con = getConnect()) {
//            PreparedStatement ps = con.prepareStatement(query);
//            ps.setString(1, p.getName());
//            ps.setString(2, p.getType());
//            ps.setInt(3, p.getPrice());       
//            ps.setString(4, p.getAbout());
//            ps.setString(5, p.getUrl());
//            ps.setString(6, p.getId());
//            ps.executeUpdate();
//        } catch (Exception e) {
//        }
//    }
//    
//    public void delete(String id) {
//        String sql = "Delete from menu where ID =?";
//        try (Connection con = getConnect()){
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, id);
//            ps.executeUpdate();
//        } catch (Exception e) {
//        }
//    }
    
//    public static void main(String[] args) {
//        System.out.println(getAllProduct1());
//    }
    
    public ArrayList<Product> searchProducrByName(String txtSearch) {
        ArrayList<Product> products = new ArrayList<>();
        String query = "select * from Product\n"
                + "where [pName] like ?";

        try ( Connection con = getConnect()) {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product(rs.getInt(1), rs.getString(2), rs.getString(6), rs.getFloat(5), rs.getString(4), rs.getString(3));
                products.add(product);
            }
        } catch (Exception e) {
        }
        return products;

    }
    
}
