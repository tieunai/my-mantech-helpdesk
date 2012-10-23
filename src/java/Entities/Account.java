/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

/**
 *
 * @author DANG ANH
 */
public class Account {
    private int accountID;
    private int accountRoleID;
    private String userName;
    private String passsWord;
    private String avatar;
    
    public Account()
    {
        
    }

    public Account(int accountID, int accountRoleID, String userName, String passsWord, String avatar) {
        this.accountID = accountID;
        this.accountRoleID = accountRoleID;
        this.userName = userName;
        this.passsWord = passsWord;
        this.avatar = avatar;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getAccountRoleID() {
        return accountRoleID;
    }

    public void setAccountRoleID(int accountRoleID) {
        this.accountRoleID = accountRoleID;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPasssWord() {
        return passsWord;
    }

    public void setPasssWord(String passsWord) {
        this.passsWord = passsWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
