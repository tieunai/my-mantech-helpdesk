/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entities.AccountRole;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author AMENOSA
 */
public class AccountRoleModel extends MyConfig {

    public AccountRoleModel() {
    }

    public Iterator getAllAccountRole() {
        try {
            openConnect();
            ArrayList list = new ArrayList();
            PreparedStatement pst = conn.prepareCall("{call }");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                AccountRole accountRole = new AccountRole();
                accountRole.setId(rs.getInt("Acc_role_id"));
                accountRole.setName(rs.getString("Acc_role_name"));
                list.add(accountRole);
            }
            closeConnect();
            return list.iterator();
        } catch (SQLException ex) {
        }
        return null;
    }

    public int updateAccountRole(int id, String name) {
        int update = -1;
        try {
            openConnect();
            PreparedStatement pst = conn.prepareCall("{call }");
            pst.setString(1, name);
            pst.setInt(2, id);
            update = pst.executeUpdate();
            closeConnect();
        } catch (SQLException ex) {
        }
        return update;
    }

    public int insertAccountRole(String name) {
        int update = -1;
        try {
            openConnect();
            PreparedStatement pst = conn.prepareCall("{call }");
            pst.setString(1, name);
            update = pst.executeUpdate();
            closeConnect();
        } catch (SQLException ex) {
        }
        return update;
    }

    public int deleteAccountRole(int id) {
        int delete = -1;
        try {
            openConnect();
            PreparedStatement pst = conn.prepareCall("{cal }");
            pst.setInt(1, id);
            delete = pst.executeUpdate();
            closeConnect();
        } catch (SQLException ex) {
        }
        return delete;
    }

    public int getPageCount(int pageSize) {
        int result = 0, count = 0;
        try {
            openConnect();
            PreparedStatement pst = conn.prepareCall("");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                count = rs.getInt("Count");
            }
            closeConnect();
            int temp = count % pageSize;
            if (temp != 0) {
                result = count / pageSize + 1;
            } else {
                result = count / pageSize;
            }
        } catch (SQLException ex) {
        }
        return result;
    }
}
