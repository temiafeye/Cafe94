package com.group13.cafe94;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DataPersistanceHandler {

    public static boolean persistToSpecificTable(String sql){
        try{
            Connection con = DBConnectionHandler.getConnection();
            Statement stmt = con.createStatement();
            stmt.execute(sql);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
