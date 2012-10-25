/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entities.Staff;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author AMENOSA
 */
public class StaffModel extends MyConfig {

    public StaffModel() {
    }

    public Iterator getAllStaff() {
        try {
            openConnect();
            ArrayList list = new ArrayList();
            PreparedStatement pst = conn.prepareCall("{call sp_getStaff}");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Staff staff = new Staff();
                staff.setStaffID(rs.getInt("Staff_id"));
                staff.setDepartmentId(rs.getInt("Department_id"));
                staff.setAccountID(rs.getInt("Acc_id"));
                staff.setStaffName(rs.getString("Staff_name"));
                staff.setStaffPhone(rs.getString("Staff_phone"));
                staff.setStaffEmail(rs.getString("Staff_email"));
                staff.setDateOfBirth(rs.getString("Staff_dob"));
                staff.setDateJoined(rs.getString("Date_joined"));
                staff.setDateLeft(rs.getString("Date_left"));
                staff.setStatus(rs.getString("Status"));
                list.add(staff);
            }
            closeConnect();
            return list.iterator();
        } catch (SQLException ex) {
        }
        return null;
    }

    public int updateStaff(int id, int department_id, int acc_id, String staff_name, String staff_phone, String staff_email, Date staff_dob, Date date_joined, Date date_left, boolean status) {
        int update = -1;
        try {
            openConnect();
            PreparedStatement pst = conn.prepareCall("{call sp_updateStaff}");
            pst.setInt(1, department_id);
            pst.setInt(2, acc_id);
            pst.setString(3, staff_name);
            pst.setString(4, staff_phone);
            pst.setString(5, staff_email);
            pst.setDate(6, staff_dob);
            pst.setDate(7, date_joined);
            pst.setDate(8, date_left);
            pst.setBoolean(9, status);
            pst.setInt(10, id);
            update = pst.executeUpdate();
            closeConnect();
        } catch (SQLException ex) {
        }
        return update;
    }

    public int insertStaff(int department_id, int acc_id, String staff_name, String staff_phone, String staff_email, String staff_dob, String date_joined, String date_left, int status) {
        //int update = -1;
        try {
            openConnect();
            PreparedStatement pst = conn.prepareCall("insert into Staff(Department_id,Acc_id,Staff_name,Staff_phone,Staff_email,Staff_dob,Date_joined,Date_left,Status) values (?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, department_id);
            pst.setInt(2, acc_id);
            pst.setString(3, staff_name);
            pst.setString(4, staff_phone);
            pst.setString(5, staff_email);
            pst.setString(6, staff_dob);
            pst.setString(7, date_joined);
            pst.setString(8, date_left);
            pst.setInt(9, status);
            //
           int result = pst.executeUpdate();
            closeConnect();
            return result;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int deleteStaff(int id) {
        int delete = -1;
        try {
            openConnect();
            PreparedStatement pst = conn.prepareCall("{call sp_deleteStaff}");
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
