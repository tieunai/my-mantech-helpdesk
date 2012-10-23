/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

/**
 *
 * @author DANG ANH
 */
public class Article {
    private int articleID;
    private int categoryID;
    private String articleTitle;
    private String articleContent;
    private float rate;
    private String status;
    
    public Article()
    {
        
    }

    public Article(int articleID, int categoryID, String articleTitle, String articleContent, float rate, String status) {
        this.articleID = articleID;
        this.categoryID = categoryID;
        this.articleTitle = articleTitle;
        this.articleContent = articleContent;
        this.rate = rate;
        this.status = status;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public int getArticleID() {
        return articleID;
    }

    public void setArticleID(int articleID) {
        this.articleID = articleID;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
