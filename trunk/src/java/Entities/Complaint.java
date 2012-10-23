/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Hop
 */
public class Complaint {

    private int Complaint_id;
    private int Complaint_type_id;
    private String Staff_id;
    private String Priority_id;
    private int Complaint_Status;
    private String Complaint_title;
    private String Complaint_content;

    public Complaint() {
    }

    public Complaint(int Complaint_id, int Complaint_type_id, String Staff_id, String Priority_id, int Complaint_Status, String Complaint_title, String Complaint_content) {
        this.Complaint_id = Complaint_id;
        this.Complaint_type_id = Complaint_type_id;
        this.Staff_id = Staff_id;
        this.Priority_id = Priority_id;
        this.Complaint_Status = Complaint_Status;
        this.Complaint_title = Complaint_title;
        this.Complaint_content = Complaint_content;
    }

    public int getComplaint_Status() {
        return Complaint_Status;
    }

    public void setComplaint_Status(int Complaint_Status) {
        this.Complaint_Status = Complaint_Status;
    }

    public String getComplaint_content() {
        return Complaint_content;
    }

    public void setComplaint_content(String Complaint_content) {
        this.Complaint_content = Complaint_content;
    }

    public int getComplaint_id() {
        return Complaint_id;
    }

    public void setComplaint_id(int Complaint_id) {
        this.Complaint_id = Complaint_id;
    }

    public String getComplaint_title() {
        return Complaint_title;
    }

    public void setComplaint_title(String Complaint_title) {
        this.Complaint_title = Complaint_title;
    }

    public int getComplaint_type_id() {
        return Complaint_type_id;
    }

    public void setComplaint_type_id(int Complaint_type_id) {
        this.Complaint_type_id = Complaint_type_id;
    }

    public String getPriority_id() {
        return Priority_id;
    }

    public void setPriority_id(String Priority_id) {
        this.Priority_id = Priority_id;
    }

    public String getStaff_id() {
        return Staff_id;
    }

    public void setStaff_id(String Staff_id) {
        this.Staff_id = Staff_id;
    }
}
