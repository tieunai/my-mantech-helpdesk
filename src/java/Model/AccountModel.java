/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entities.Account;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author AMENOSA
 */
public class AccountModel extends MyConfig {

    public AccountModel() {
    }

    public Iterator getAllAccount() {
        try {
            openConnect();
            ArrayList list = new ArrayList();
            PreparedStatement pst = conn.prepareCall("{call }");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Account account = new Account();
                account.setAccountID(rs.getInt("Acc_id"));
                account.setAccountRoleID(rs.getInt("Acc_role_id"));
                account.setUserName(rs.getString("Username"));
                account.setPasssWord(rs.getString("Password"));
                account.setAvatar(rs.getString("Avatar"));
                list.add(account);
            }
            closeConnect();
            return list.iterator();
        } catch (SQLException ex) {
        }
        return null;
    }

    public int updateAccount(int id, int role_id, String user, String pass, String avatar) {
        int update = -1;
        try {
            openConnect();
            PreparedStatement pst = conn.prepareCall("{call }");
            pst.setInt(1, role_id);
            pst.setString(2, user);
            pst.setString(3, pass);
            pst.setString(4, avatar);
            pst.setInt(5, id);
            update = pst.executeUpdate();
            closeConnect();
        } catch (SQLException ex) {
        }
        return update;
    }
}
