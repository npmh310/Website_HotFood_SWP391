package dao;

import static context.DatabaseInfo.DBURL;
import static context.DatabaseInfo.DRIVERNAME;
import static context.DatabaseInfo.PASSDB;
import static context.DatabaseInfo.USERDB;
import static dao.ProductDAO.getConnect;
import entity.Account;
import entity.Category;
import entity.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class AccountDAO {
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

  public List<Account> getAllAccount() { // sql server hieu String van = int nene dung String duoc.
        List<Account> list = new ArrayList<>();
        String query = "select * from Account ";
       try ( Connection con = getConnect()){
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            // lay du lieu tu rs do vao list
            while (rs.next()) {
                list.add(new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(7),
                        rs.getString(6),
                        rs.getInt(8)));

            }
        } catch (Exception e) {
        }
        return list;
    }
   public void deleteAccount(String id) {
        String query = "delete from Account \n"
                + "where ID = ?";
        try ( Connection con = getConnect()){
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate(); // không trả về bản result nên dùng executeUpdate()
        } catch (Exception e) {
        }
    }
  public void editRole (String id, int Role){
      String query = "update Account set Role =? where ID = ?";
       try ( Connection con = getConnect()){
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, Role); 
            ps.setString(2, id);           
            ps.executeUpdate(); // không trả về bản result nên dùng executeUpdate()
        } catch (Exception e) {
        }
  }
  
  public Account getAccountById(String id) {
        String query = "Select * from Account where ID = ?";
        try ( Connection con = getConnect()) {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(7),
                        rs.getString(6),
                        rs.getInt(8));
            }
        } catch (Exception e) {
        }
        return null;
    }
}