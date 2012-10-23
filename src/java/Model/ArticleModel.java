/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;
import Entities.Article;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DANG ANH
 */
public class ArticleModel extends ConnectionDataBase {
    
    public ArticleModel()
    {
        
    }
    
    public Article getArticle(int ArticleID)
    {
        try {
            Connection();
            PreparedStatement pst = cn.prepareCall("Select * from Article where Article_id = ?");
            pst.setInt(1, ArticleID);
            ResultSet rs = pst.executeQuery();
            Article article = new Article();
            if(rs.next())
            {
                article.setArticleID(rs.getInt("Article_id"));
                article.setCategoryID(rs.getInt("Category_id"));
                article.setArticleTitle(rs.getString("Article_title"));
                article.setArticleContent(rs.getString("Article_content"));
                article.setRate(rs.getFloat("Rate"));
                article.setStatus(rs.getString("Status"));
            }
            disConnection();
            return article;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public int insertArticle(int CategoryId,String ArticleTitle,String ArticleContent,String Rate,String Status)
    {
        try {
            Connection();
            PreparedStatement pst = cn.prepareCall("inset into Article(Category_id,Article_title,Article_content,Rate,Status) values (?,?,?,?,?)");
            pst.setInt(1, CategoryId);
            pst.setString(2, ArticleTitle);
            pst.setString(3, ArticleContent);
            pst.setString(4, Rate);
            pst.setString(5, Status);
            int result = pst.executeUpdate();
            disConnection();
            return result;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
    public int updateArticle(int CategoryId,String ArticleTitle,String ArticleContent,String Rate,String Status,int ArticleID)
    {
        try {
            Connection();
            PreparedStatement pst = cn.prepareCall("update Article set Category_id=?,Article_title=?,Article_content=?,Rate=?,Status=? where Article_id=?");
            pst.setInt(1, CategoryId);
            pst.setString(2, ArticleTitle);
            pst.setString(3, ArticleContent);
            pst.setString(4, Rate);
            pst.setString(5, Status);
            int result = pst.executeUpdate();
            disConnection();
            return result;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
        
    }
    public int deleteArticle(int ArticleID)
    {
        try {
            Connection();
            PreparedStatement pst = cn.prepareCall("delete from Article where Article_id=?");
            pst.setInt(1, ArticleID);
            int result = pst.executeUpdate();
            disConnection();
            return result;
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        return -1;
    }
}
