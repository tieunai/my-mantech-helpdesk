/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entities.Article;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author AMENOSA
 */
public class ArticleModel extends MyConfig {

    public ArticleModel() {
    }

    public Iterator getAllArticle() {
        try {
            openConnect();
            ArrayList list = new ArrayList();
            CallableStatement cst = conn.prepareCall("{call getAllArticle()}");
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {
                Article article = new Article();
                article.setArticleID(rs.getInt("Article_id"));
                article.setCategoryID(rs.getInt("Category_id"));
                article.setArticleTitle(rs.getString("Article_title"));
                article.setArticleContent(rs.getString("Article_content"));
                article.setRate(rs.getFloat("Rate"));
                article.setStatus(rs.getString("Status"));
                list.add(article);
            }
            closeConnect();
            return list.iterator();
        } catch (SQLException ex) {
        }
        return null;
    }

    public int updateArticle(int id, int category_id, String title, String content, float rate, boolean status) {
        int update = -1;
        try {
            openConnect();
            CallableStatement cst = conn.prepareCall("{call update_Article(?,?,?,?,?,?)}");
            cst.setInt(1, category_id);
            cst.setString(2, title);
            cst.setString(3, content);
            cst.setFloat(4, rate);
            cst.setBoolean(5, status);
            cst.setInt(6, id);
            update = cst.executeUpdate();
            closeConnect();
        } catch (SQLException ex) {
        }
        return update;
    }

    public int insertArticle(int category_id, String title, String content, float rate, boolean status) {
        int update = -1;
        try {
            openConnect();
            CallableStatement cst = conn.prepareCall("{call insert_Article(?,?,?,?,?)}");
            cst.setInt(1, category_id);
            cst.setString(2, title);
            cst.setString(3, content);
            cst.setFloat(4, rate);
            cst.setBoolean(5, status);
            update = cst.executeUpdate();
            closeConnect();
        } catch (SQLException ex) {
        }
        return update;
    }

    public int deleteArticle(int id) {
        int delete = -1;
        try {
            openConnect();
            CallableStatement cst = conn.prepareCall("{call delete_Article(?) }");
            cst.setInt(1, id);
            delete = cst.executeUpdate();
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
