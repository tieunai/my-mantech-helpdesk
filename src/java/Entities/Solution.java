/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Hop
 */
public class Solution {

    private int Solution_id;
    private int Complaint_id;
    private String Solution_content;
    private String Assigned_staff_id;
    private String Lodge_date;
    private String Fix_date;
    private String Close_date;

    public Solution() {
    }

    public Solution(int Solution_id, int Complaint_id, String Solution_content, String Assigned_staff_id, String Lodge_date, String Fix_date, String Close_date) {
        this.Solution_id = Solution_id;
        this.Complaint_id = Complaint_id;
        this.Solution_content = Solution_content;
        this.Assigned_staff_id = Assigned_staff_id;
        this.Lodge_date = Lodge_date;
        this.Fix_date = Fix_date;
        this.Close_date = Close_date;
    }

    public String getAssigned_staff_id() {
        return Assigned_staff_id;
    }

    public void setAssigned_staff_id(String Assigned_staff_id) {
        this.Assigned_staff_id = Assigned_staff_id;
    }

    public String getClose_date() {
        return Close_date;
    }

    public void setClose_date(String Close_date) {
        this.Close_date = Close_date;
    }

    public int getComplaint_id() {
        return Complaint_id;
    }

    public void setComplaint_id(int Complaint_id) {
        this.Complaint_id = Complaint_id;
    }

    public String getFix_date() {
        return Fix_date;
    }

    public void setFix_date(String Fix_date) {
        this.Fix_date = Fix_date;
    }

    public String getLodge_date() {
        return Lodge_date;
    }

    public void setLodge_date(String Lodge_date) {
        this.Lodge_date = Lodge_date;
    }

    public String getSolution_content() {
        return Solution_content;
    }

    public void setSolution_content(String Solution_content) {
        this.Solution_content = Solution_content;
    }

    public int getSolution_id() {
        return Solution_id;
    }

    public void setSolution_id(int Solution_id) {
        this.Solution_id = Solution_id;
    }
}
