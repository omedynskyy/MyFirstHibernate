package org.soccer.medynskyy.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import javax.naming.NamingException;
import javax.sql.rowset.CachedRowSet;
import org.apache.log4j.Logger;

public class DataAccessor
{

  protected Database m_dataBase = null;

  public DataAccessor() {
    this.m_dataBase = new Database();
  }

}