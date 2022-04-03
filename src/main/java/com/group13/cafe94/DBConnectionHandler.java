package com.group13.cafe94;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionHandler {

        private static Connection con = null;

        static
        {
            String url = "jdbc:sqlite:cafe94database.db";
            try {
                con = DriverManager.getConnection(url);
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
        public static Connection getConnection()
        {
            return con;
        }
    }
