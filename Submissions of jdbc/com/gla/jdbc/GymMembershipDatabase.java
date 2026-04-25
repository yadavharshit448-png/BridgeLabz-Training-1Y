package com.gla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class GymMembershipDatabase {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password")) {
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS members(id INT, name VARCHAR(50), type VARCHAR(20), months INT)");
            stmt.execute("INSERT INTO members VALUES (1, 'John', 'Premium', 6)");
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM members WHERE type = 'Premium'");
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
            
            stmt.executeUpdate("UPDATE members SET months = months + 1 WHERE id = 1");
            stmt.executeUpdate("DELETE FROM members WHERE months = 0");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
