/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;
import Entities.ArticleCategory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DANG ANH
 */
public class ArticleCategoryModel extends ConnectionDataBase {
    
    public ArticleCategoryModel()
    {
        
    }
    
    public ArticleCategory getArticleCategory(int ArticleCategoryID)
    {
        try {
            Connection();
            PreparedStatement pst = cn.prepareStatement("Select * from ArticleCategory where Category_id=?");
            pst.setInt(1, ArticleCategoryID);
            ResultSet rs = pst.executeQuery();
            ArticleCategory articleCategory = new ArticleCategory();
            if(rs.next())
            {
                articleCategory.setCategoryID(rs.getInt("Category_id"));
                articleCategory.setCategoryName(rs.getString("Category_name"));
                articleCategory.setDescription(rs.getString("Description"));
            }
            disConnection();
            return articleCategory;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    //-----insert ArticleCategory-----//
    
    public int insertArticleCategory(String CategotyName,String Description)
    {
        try {
            Connection();
            PreparedStatement pst = cn.prepareStatement("insert into ArticleCategory(Category_name,[Description]) values(?,?)");
            pst.setString(1, CategotyName);
            pst.setString(2, Description);
            int result = pst.executeUpdate();
            disConnection();
            return result;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
    //-----update ArticleCategory-----//
    public int updateArticleCategory(String CategotyName,String Description,int ArticleCategoryID)
    {
        try {
            Connection();
            PreparedStatement pst = cn.prepareStatement("update ArticleCategory set Category_name=?,Description=? where Category_id=?");
            pst.setString(1, CategotyName);
            pst.setString(2, Description);
            pst.setInt(3, ArticleCategoryID);
            int result = pst.executeUpdate();
            disConnection();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(ArticleCategoryModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    //------delete ArticleCategory-----//
    public int deleteArticleCategory(int CategoryID)
    {
        try {
            Connection();
            PreparedStatement pst = cn.prepareStatement("delete from ArticleCategory where Category_id=?");
            pst.setInt(1, CategoryID);
            int result = pst.executeUpdate();
            return result;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
}
