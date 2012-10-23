/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Entities.Staff;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author DANG ANH
 */
public class StaffModel extends ConnectionDataBase{
    
    public StaffModel()
    {
        
    }
    
    public Staff getsStaff(int StaffID)
    {
        try {
            Connection();
            PreparedStatement pst = cn.prepareStatement("Select * from Staff where Staff_id=?");
            pst.setInt(1, StaffID);
            ResultSet rs = pst.executeQuery();
            Staff staff = new Staff();
            if(rs.next())
            {
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
                
            }
            disConnection();
            return staff;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    //-----Insert Staff-----//
    
    public int insertStaff(int DepartmentID,int AccountID,String StaffName,String StaffPhone,String StaffEmail,String DateOfBirth,String DateJoined,String DateLeft,String Status)
    {
        try {
            Connection();
            PreparedStatement pst = cn.prepareStatement("insert into Staff(Department_id,Acc_id,Staff_name,Staff_phone,Staff_email,Staff_dob,Date_joined,Date_left,[Status] values (?,?,?,?,?,?,?,?,?))");
            pst.setInt(1,DepartmentID);
            pst.setInt(2, AccountID);
            pst.setString(3, StaffName);
            pst.setString(4, StaffPhone);
            pst.setString(5, StaffEmail);
            pst.setString(6, DateOfBirth);
            pst.setString(7,DateJoined);
            pst.setString(8, DateLeft);
            pst.setString(9, Status);
            int result = pst.executeUpdate();
            disConnection();
            return result;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
     //-----update Staff-----//
    public int updateStaff(int DepartmentID,int AccountID,String StaffName,String StaffPhone,String StaffEmail,String DateOfBirth,String DateJoined,String DateLeft,String Status,int StaffID)
    {
        try {
            Connection();
            PreparedStatement pst = cn.prepareStatement("update Staff set Department_id=?,Acc_id=?,Staff_name=?,Staff_phone=?,Staff_email=?,Staff_dob=?,Date_joined=?,Date_left=?,Status=? where Staff_id=?");
            pst.setInt(1,DepartmentID);
            pst.setInt(2, AccountID);
            pst.setString(3, StaffName);
            pst.setString(4, StaffPhone);
            pst.setString(5, StaffEmail);
            pst.setString(6, DateOfBirth);
            pst.setString(7,DateJoined);
            pst.setString(8, DateLeft);
            pst.setString(9, Status);
            pst.setInt(10, StaffID);
            int result = pst.executeUpdate();
            disConnection();
            return result;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
    //-----delete Staff-----//
    
    public int deleteStaff(int StaffID)
    {
        try {
            Connection();
            PreparedStatement pst = cn.prepareStatement("delete from Staff where Staff_id=?");
            pst.setInt(1, StaffID);
            int result = pst.executeUpdate();
            disConnection();
            return result;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }  
}
