/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entities.ComplaintStatus;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author AMENOSA
 */
public class ComplaintStatusModel extends MyConfig {

    public ComplaintStatusModel() {
    }

    public Iterator getAllComplaintStatus() {
        try {
            openConnect();
            ArrayList list = new ArrayList();
            PreparedStatement pst = conn.prepareCall("{call }");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ComplaintStatus complaintStatus = new ComplaintStatus();
                complaintStatus.setComplaint_status_id(rs.getInt("Complaint_status_id"));
                complaintStatus.setComplaint_status_name(rs.getString("Complaint_status_name"));
                list.add(complaintStatus);
            }
            closeConnect();
            return list.iterator();
        } catch (SQLException ex) {
        }
        return null;
    }

    public int updateComplaintStatus(int id, String name) {
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

    public int insertComplaintStatus(String name) {
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

    public int deleteComplaintStatus(int id) {
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
