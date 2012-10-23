/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entities.ArticleCategory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author AMENOSA
 */
public class ArticleCategoryModel extends MyConfig {

    public ArticleCategoryModel() {
    }

    public Iterator getAllArticle() {
        try {
            openConnect();
            ArrayList list = new ArrayList();
            PreparedStatement pst = conn.prepareCall("{call }");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ArticleCategory articleCategory = new ArticleCategory();
                articleCategory.setId(rs.getInt("Category_id"));
                articleCategory.setName(rs.getString("articleCategory"));
                articleCategory.setName(rs.getString("Description"));
                list.add(articleCategory);
            }
            closeConnect();
            return list.iterator();
        } catch (SQLException ex) {
        }
        return null;
    }

    public int updateArticleCategory(int id, String name, String description) {
        int update = -1;
        try {
            openConnect();
            PreparedStatement pst = conn.prepareCall("{call }");
            pst.setString(1, name);
            pst.setString(2, description);
            pst.setInt(3, id);
            update = pst.executeUpdate();
            closeConnect();
        } catch (SQLException ex) {
        }
        return update;
    }

    public int insertArticleCategory(String name, String description) {
        int update = -1;
        try {
            openConnect();
            PreparedStatement pst = conn.prepareCall("{call }");
            pst.setString(1, name);
            pst.setString(2, description);
            update = pst.executeUpdate();
            closeConnect();
        } catch (SQLException ex) {
        }
        return update;
    }

    public int deleteArticleCategory(int id) {
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
