package com.gmail.solovev.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class ImportData {

    public static void CVSImport() {

        try {
            String fileCVS = "F:\\IdeaProject\\Import\\src\\main\\resourses\\test_case.csv";

            String query = null;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8800", "root", "root");
            Statement stmt = conn.createStatement();
            query = "LOAD DATA INFILE 'F:\\IdeaProject\\Import\\src\\main\\resourses\\test_case.csv' INTO TABLE user_data FIELDS ENCLOSED BY '\"' TERMINATED BY ',' ESCAPED BY '\"' LINES TERMINATED BY '\\n'";
            stmt.executeQuery(query);
            ResultSet rs = stmt.executeQuery(query);
        } catch (IllegalAccessException | InstantiationException | SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
