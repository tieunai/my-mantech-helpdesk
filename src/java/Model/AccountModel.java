/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Entities.Account;
import java.sql.ResultSet;
/**
 *
 * @author DANG ANH
 */
public class AccountModel extends ConnectionDataBase {
    
    public AccountModel()
    {
        
    }
    
    public Account getAccount(int AccountID)
    {
        try {
            Connection();
            PreparedStatement pst = cn.prepareStatement("Select * from Account where Acc_id = ? ");
            pst.setInt(1, AccountID);
            ResultSet rs = pst.executeQuery();
            Account account = new Account();
           if(rs.next())
           {
              account.setAccountID(rs.getInt("Acc_id"));
              account.setAccountRoleID(rs.getInt("Acc_role_id"));
              account.setUserName(rs.getString("Username"));
              account.setPasssWord(rs.getString("Password"));
              account.setAvatar(rs.getString("Avatar"));
           }
            disConnection();
            return account;
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        return null;
    }
    public int insertAccount(int AccountRoleID,String UserName,String Password,String Avatar)
    {
        try {
            Connection();
            PreparedStatement pst = cn.prepareStatement("insert into Account(Acc_role_id,Username,[Password],Avatar) values (?,?,?,?)");
            pst.setInt(1, AccountRoleID);
            pst.setString(2, UserName);
            pst.setString(3, Password);
            pst.setString(4, Avatar);
            int result =  pst.executeUpdate();
            disConnection();
            return result;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
    
    public int updateAccount(int AccountRoleID,String UserName,String Password,String Avatar, int AccountID)
    {
        try {
            Connection();
            PreparedStatement pst = cn.prepareStatement("Update Account Set Acc_role_id=?,Username=?,[Password]=?,Avatar=? where Acc_id = ? ");
            pst.setInt(1,AccountRoleID);
            pst.setString(2,UserName);
            pst.setString(3, Password);
            pst.setString(4, Avatar);
            int result = pst.executeUpdate();
            disConnection();
            return result;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }      
         return -1;
    }
    
    public int deleteAccount(int AccountID)
    {
        try {
            Connection();
            PreparedStatement pst = cn.prepareStatement("delete from Account where Acc_id =?");
            pst.setInt(1, AccountID);
            int result = pst.executeUpdate();
            disConnection();
            return result;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
}
