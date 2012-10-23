/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Hop
 */
public class ComplaintType {

    public ComplaintType() {
    }

    public ComplaintType(int Complaint_type_id, String Complaint_name) {
        this.Complaint_type_id = Complaint_type_id;
        this.Complaint_name = Complaint_name;
    }

    public String getComplaint_name() {
        return Complaint_name;
    }

    public void setComplaint_name(String Complaint_name) {
        this.Complaint_name = Complaint_name;
    }

    public int getComplaint_type_id() {
        return Complaint_type_id;
    }

    public void setComplaint_type_id(int Complaint_type_id) {
        this.Complaint_type_id = Complaint_type_id;
    }
    private int Complaint_type_id;
    private String Complaint_name;
}
