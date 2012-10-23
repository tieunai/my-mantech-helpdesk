/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

/**
 *
 * @author DANG ANH
 */
public class Staff {
    private int staffID;
    private int departmentId;
    private int accountID;
    private String staffName;
    private String staffPhone;
    private String staffEmail;
    private String dateOfBirth;
    private String dateJoined;
    private String dateLeft;
    private String Status;
    
    public Staff()
    {
        
    }

    public Staff(int staffID, int departmentId, int accountID, String staffName, String staffPhone, String staffEmail, String dateOfBirth, String dateJoined, String dateLeft, String Status) {
        this.staffID = staffID;
        this.departmentId = departmentId;
        this.accountID = accountID;
        this.staffName = staffName;
        this.staffPhone = staffPhone;
        this.staffEmail = staffEmail;
        this.dateOfBirth = dateOfBirth;
        this.dateJoined = dateJoined;
        this.dateLeft = dateLeft;
        this.Status = Status;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(String dateJoined) {
        this.dateJoined = dateJoined;
    }

    public String getDateLeft() {
        return dateLeft;
    }

    public void setDateLeft(String dateLeft) {
        this.dateLeft = dateLeft;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }
    
    
}
