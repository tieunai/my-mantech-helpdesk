/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Hop
 */
public class Priority {

    private int Priority_id;
    private String Priority_name;

    public Priority() {
    }

    public Priority(int Priority_id, String Priority_name) {
        this.Priority_id = Priority_id;
        this.Priority_name = Priority_name;
    }

    public int getPriority_id() {
        return Priority_id;
    }

    public void setPriority_id(int Priority_id) {
        this.Priority_id = Priority_id;
    }

    public String getPriority_name() {
        return Priority_name;
    }

    public void setPriority_name(String Priority_name) {
        this.Priority_name = Priority_name;
    }
}
