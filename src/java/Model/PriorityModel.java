/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entities.Priority;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author AMENOSA
 */
public class PriorityModel extends MyConfig {

    public PriorityModel() {
    }

    public Iterator getAllPriority() {
        try {
            openConnect();
            ArrayList list = new ArrayList();
            PreparedStatement pst = conn.prepareCall("{call }");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Priority complaintType = new Priority();
                complaintType.setId(rs.getInt("Priority_id"));
                complaintType.setName(rs.getString("Priority_name"));
                list.add(complaintType);
            }
            closeConnect();
            return list.iterator();
        } catch (SQLException ex) {
        }
        return null;
    }

    public int updatePriority(int id, String name) {
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

    public int insertPriority(String name) {
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

    public int deletePriority(int id) {
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
