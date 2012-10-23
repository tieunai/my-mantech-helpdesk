/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Hop
 */
public class ComplaintStatus {

    private int Complaint_status_id;
    private String Complaint_status_name;

    public ComplaintStatus() {
    }

    public ComplaintStatus(int Complaint_status_id, String Complaint_status_name) {
        this.Complaint_status_id = Complaint_status_id;
        this.Complaint_status_name = Complaint_status_name;
    }

    public int getComplaint_status_id() {
        return Complaint_status_id;
    }

    public void setComplaint_status_id(int Complaint_status_id) {
        this.Complaint_status_id = Complaint_status_id;
    }

    public String getComplaint_status_name() {
        return Complaint_status_name;
    }

    public void setComplaint_status_name(String Complaint_status_name) {
        this.Complaint_status_name = Complaint_status_name;
    }
}
