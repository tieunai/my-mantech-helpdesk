/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

/**
 *
 * @author DANG ANH
 */
public class Department {
    private int departmentId;
    private String departmentName;
    private String description;
    
    public Department()
    {
        
    }

    public Department(int departmentId, String departmentName, String description) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.description = description;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
