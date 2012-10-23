/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AMENOSA
 */
public class MyConfig {

    protected Connection conn;
    private String url = "jdbc:sqlserver://amenosa-pc:1433;databaseName=MantechLimited";
    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    public MyConfig() {
    }

    protected void openConnect() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, "sa", "1234$");
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }

    protected void closeConnect() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
            }
        }
    }
}
