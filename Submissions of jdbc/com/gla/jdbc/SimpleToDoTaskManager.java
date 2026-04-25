package com.gla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class SimpleToDoTaskManager {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password")) {
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS tasks(id INT, title VARCHAR(100), status VARCHAR(20))");
            stmt.execute("INSERT INTO tasks VALUES (1, 'Do laundry', 'Pending')");
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM tasks WHERE status = 'Pending'");
            while (rs.next()) {
                System.out.println(rs.getString("title"));
            }
            
            stmt.executeUpdate("UPDATE tasks SET status = 'Completed' WHERE id = 1");
            stmt.executeUpdate("DELETE FROM tasks WHERE status = 'Completed'");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
