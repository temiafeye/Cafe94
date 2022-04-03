package com.group13.cafe94;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Initialization {
    static{
        setupTables();
    }

    static void setupTables(){
        try{
            Connection con = DBConnectionHandler.getConnection();
        String sql = "CREATE TABLE IF NOT EXISTS customers (\n"
                + " customer_ID TEXT PRIMARY KEY,\n"
                + " first_name TEXT NOT NULL,\n"
                + " last_name TEXT NOT NULL,\n"
                + " address TEXT NOT NULL,\n"
                + " order_ID TEXT NOT NULL UNIQUE,\n"
                + ");";
        Statement stmt = con.createStatement();
        stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
