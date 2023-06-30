/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import static context.DatabaseInfo.DBURL;
import static context.DatabaseInfo.DRIVERNAME;
import static context.DatabaseInfo.PASSDB;
import static context.DatabaseInfo.USERDB;
import static dao.AccountDAO.getConnect;
import static dao.ProductDAO.getConnect;
import entity.Account;
import entity.Discount;
import entity.Product;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author taing
 */
public class DiscountDAO {
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
    
    public ArrayList<Discount> getAllDiscount() { // sql server hieu String van = int nene dung String duoc.
        ArrayList<Discount> list = new ArrayList<>();
        String query = "SELECT Code, Discount ,StartDate,EndDate,DATEDIFF(DAY,GETDATE(),EndDate) AS SoNgayConLai from Discountt";
        try ( Connection con = getConnect()) {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            // lay du lieu tu rs do vao list
            while (rs.next()) {
                list.add(new Discount(rs.getString(1),
                        rs.getFloat(2),
                        rs.getDate(3),
                        rs.getDate(4),
                        rs.getInt(5)));

            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public Discount getCode(String code){
        
        String query = "select * from Discountt where Code = ?";
        try ( Connection con = getConnect()) {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, code);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Discount(rs.getString(1), rs.getFloat(2), rs.getDate(3), rs.getDate(4));
            }
        } catch (Exception e) {
        }
        return null;
    }
    

    
    public void deleteDiscount(String code) {
        String query = "delete from Discountt where Code = ?";
        try ( Connection con = getConnect()) {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, code);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    
    public void editDiscount(String code,float discount ,String startDate, String endDate) {
        try ( Connection con = getConnect()) {
            String query = "update Discountt set [Discount] = ?,\n" +
"					[StartDate] = ?,\n" +
"					[EndDate] = ?\n" +
"                    where  [Code] = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setFloat(1, discount);
            ps.setString(2, startDate);
            ps.setString(3, endDate);
            ps.setString(4, code);
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }
    
    
    public void addDiscount(String code,float discount ,String startDate, String endDate) {
        try ( Connection con = getConnect()) {
            String query = "INSERT [dbo].Discountt([Code], [Discount],  [StartDate], [EndDate]) VALUES (?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, code);
            ps.setFloat(2, discount);
            ps.setString(3, startDate);
            ps.setString(4, endDate);
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }
    
}
