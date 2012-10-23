/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Entities.Department;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author DANG ANH
 */
public class DepartmentModel extends ConnectionDataBase {
      public DepartmentModel()
    {
        
    }
    public Department getDepartment(int DepartmentID)
    {
        try {
            Connection();
            PreparedStatement pst = cn.prepareStatement("Select * from Department where Department_id=?");
            pst.setInt(1, DepartmentID);
            ResultSet rs = pst.executeQuery();
            Department department = new Department();
            if (rs.next())
            {
                department.setDepartmentId(rs.getInt("Department_id"));
                department.setDepartmentName(rs.getString("Department_name"));
                department.setDescription(rs.getString("Description"));
            }
            disConnection();
            return department;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    //-----Insert Department-----//
    
    public int insertDepartment(String DepartmentName,String Description)
    {
        try {
            Connection();
            PreparedStatement pst = cn.prepareStatement("insert into Department(Department_name,[Description]) values (?,?)");
            pst.setString(1, DepartmentName);
            pst.setString(2, Description);
            int result = pst.executeUpdate();
            disConnection();
            return result;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
    //-----Update Department-----//
    
    public int updateDepartment(String DepartmentName,String Description,int DepartmentID)
    {
        try {
            Connection();
            PreparedStatement pst = cn.prepareStatement("update Department set Department_name=?,[Description]=? where Department_id=?");
            pst.setString(1, DepartmentName);
            pst.setString(2, Description);
            pst.setInt(3, DepartmentID);
            int result = pst.executeUpdate();
            disConnection();
            return result;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
    
    //-----Delete Department-----//
    
    public int deleteDepartment(int DepartmentID)
    {
        try {
            Connection();
            PreparedStatement pst = cn.prepareStatement("delete from Department where Department_id=?");
            pst.setInt(1, DepartmentID);
            int result = pst.executeUpdate();
            disConnection();
            return result;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
}
