/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import static dao.ProductDAO.getConnect;
import entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author linhp
 */
public class AccountDAO {
    
    public static Account login(String username, String password) {
        Account s = null;
        String sql = "SELECT * FROM Account WHERE username= ? and password= ? or email= ? and password= ?";
        try (Connection con = getConnect()) {
                PreparedStatement stmt = con.prepareStatement(sql);

                stmt.setString(1, username);
                stmt.setString(2, password);
                stmt.setString(3, username);
                stmt.setString(4, password);

                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                        return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                                        rs.getString(7), rs.getString(6), rs.getInt(8));
                }
                con.close();

        } catch (Exception ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

    public static Account checkUserExist(String username) {
        Account s = null;
        String sql = "SELECT * FROM Account WHERE Username= ?";
        try (Connection con = getConnect()) {
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, username);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                        return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                                        rs.getString(7), rs.getString(6), rs.getInt(8));
                }
                con.close();
        } catch (Exception ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    
    public static Account checkEmailExist(String email) {
        Account s = null;
        String sql = "SELECT * FROM Account WHERE email= ?";
        try (Connection con = getConnect()) {
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, email);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                        return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                                        rs.getString(7), rs.getString(6), rs.getInt(8));
                }
                con.close();
        } catch (Exception ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

    public static int register(Account u) {
        int rs;
        String sql = "insert into Account(Username, Password, Fullname, PhoneNum, Address, Email, Role) VALUES (?,?,?,?,?,?,0)";
        try (Connection con = getConnect()) {
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, u.getaUsername());
                stmt.setString(2, u.getaPassword());
                stmt.setString(3, u.getaFullname());
                stmt.setString(4, u.getaPhone());
                stmt.setString(5, u.getaAddress());
                stmt.setString(6, u.getaEmail());
                rs = stmt.executeUpdate();
                con.close();
                return rs;
        } catch (Exception ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public static boolean update(Account acc){
        String query = "UPDATE Account SET FullName=?, PhoneNum=?, Address=?, email=?\n"
                + " WHERE ID =?";
        try (Connection con = getConnect()) {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, acc.getaFullname());
            ps.setString(2, acc.getaPhone());
            ps.setString(3, acc.getaAddress());
            ps.setString(4, acc.getaEmail());
            ps.setInt(5, acc.getaId());

            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("loi");
        }
        return true;
    }
    
    public static boolean resetPass(Account acc){
        String query = "UPDATE Account SET Password=?\n"
                + " WHERE ID =?";
        try (Connection con = getConnect()) {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, acc.getaPassword());
            ps.setInt(2, acc.getaId());

            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("loi");
        }
        return true;
    }
        
//    public static void main(String[] args) {
//        Account ac1 = checkUserExist("linhne");
//        System.out.println(ac1);
//        ac1.setaFullname("linhne");
//        try {
//            update(ac1);
//        } catch (SQLException ex) {
//            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println(ac1);
//    }
    
}
