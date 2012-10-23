/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entities.Solution;
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
public class SolutionModel extends MyConfig {

    public SolutionModel() {
    }

    public Iterator getAllSolution() {
        try {
            openConnect();
            ArrayList list = new ArrayList();
            PreparedStatement pst = conn.prepareCall("{call }");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Solution article = new Solution();
                article.setId(rs.getInt("Solution_id"));
                article.setComplaint_id(rs.getInt("Complaint_id"));
                article.setContent(rs.getString("Solution_content"));
                article.setLodge_date(rs.getDate("Lodge_date"));
                article.setFix_date(rs.getDate("Fix_date"));
                article.setClose_date(rs.getDate("Close_date"));
                list.add(article);
            }
            closeConnect();
            return list.iterator();
        } catch (SQLException ex) {
        }
        return null;
    }

    public int updateSolution(int id, int complaint_id, String content, Date lodge_date, Date fix_date, Date close_date) {
        int update = -1;
        try {
            openConnect();
            PreparedStatement pst = conn.prepareCall("{call }");
            pst.setInt(1, complaint_id);
            pst.setString(2, content);
            pst.setDate(3, lodge_date);
            pst.setDate(4, fix_date);
            pst.setDate(5, close_date);
            pst.setInt(6, id);
            update = pst.executeUpdate();
            closeConnect();
        } catch (SQLException ex) {
        }
        return update;
    }

    public int insertSolution(int complaint_id, String content, Date lodge_date, Date fix_date, Date close_date) {
        int update = -1;
        try {
            openConnect();
            PreparedStatement pst = conn.prepareCall("{call }");
            pst.setInt(1, complaint_id);
            pst.setString(2, content);
            pst.setDate(3, lodge_date);
            pst.setDate(4, fix_date);
            pst.setDate(5, close_date);
            update = pst.executeUpdate();
            closeConnect();
        } catch (SQLException ex) {
        }
        return update;
    }

    public int deletArticle(int id) {
        int delete = -1;
        try {
            openConnect();
            PreparedStatement pst = conn.prepareCall("{cal }");
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
