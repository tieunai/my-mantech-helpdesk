/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DANG ANH
 */
public class ConnectionDataBase {
      protected Connection cn;
      
      public ConnectionDataBase()
      {
        
      }
      public void Connection()
      {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://DANGANH-VAIO:1433;databaseName=Mantech;user=sa;password=danganha";
            cn = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDataBase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
           
      }
      public void disConnection() throws SQLException
      {
        try {
            cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
      
      public ResultSet getResultSet(String sql)
      {
        try {
            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
      }
}
