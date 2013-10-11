package org.soccer.medynskyy.dto;


import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.apache.log4j.Logger;


public class Database
{
  public Connection getConnection() throws NamingException, SQLException {
    Context ctx = null;
    Connection conn = null;

    ctx = new InitialContext();
    DataSource ds = null;
    try {
      ds = (DataSource)ctx.lookup("wlng.datasource");
    } catch (NamingException e) {
    	System.out.println(e);
    }
    if (ds != null) {
      conn = ds.getConnection();
    }
    return conn;
  }

  public void closeDB(Connection _conn) {
    try {
      if (_conn != null) {
        _conn.close();
      }
      _conn = null;
    } catch (Exception e) {
    	System.out.println(e);
    }
  }
}