package com.gla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password")) {
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS movies(id INT, name VARCHAR(50), seats INT)");
            stmt.execute("INSERT INTO movies VALUES (1, 'Inception', 50)");
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM movies WHERE seats > 0");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " has " + rs.getInt("seats") + " seats");
            }
            
            stmt.executeUpdate("UPDATE movies SET seats = seats - 1 WHERE id = 1");
            stmt.executeUpdate("DELETE FROM movies WHERE seats = 0");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
