/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

/**
 *
 * @author DANG ANH
 */
public class AccountRole {
    private int accountRoleID;
    private String accountRoleName;
    
    public AccountRole()
    {
        
    }

    public AccountRole(int accountRoleID, String accountRoleName) {
        this.accountRoleID = accountRoleID;
        this.accountRoleName = accountRoleName;
    }

    public int getAccountRoleID() {
        return accountRoleID;
    }

    public void setAccountRoleID(int accountRoleID) {
        this.accountRoleID = accountRoleID;
    }

    public String getAccountRoleName() {
        return accountRoleName;
    }

    public void setAccountRoleName(String accountRoleName) {
        this.accountRoleName = accountRoleName;
    }
    
}
