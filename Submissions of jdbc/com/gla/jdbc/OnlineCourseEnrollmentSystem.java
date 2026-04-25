package com.gla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class OnlineCourseEnrollmentSystem {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password")) {
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS enrollments(id INT, student VARCHAR(50), course VARCHAR(50))");
            stmt.execute("INSERT INTO enrollments VALUES (1, 'Alice', 'Java')");
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM enrollments WHERE course = 'Java'");
            while (rs.next()) {
                System.out.println(rs.getString("student"));
            }
            
            stmt.executeUpdate("UPDATE enrollments SET course = 'Python' WHERE id = 1");
            stmt.executeUpdate("DELETE FROM enrollments WHERE id = 1");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
