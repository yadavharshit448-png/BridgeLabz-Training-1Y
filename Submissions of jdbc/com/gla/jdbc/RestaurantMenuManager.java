package com.gla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class RestaurantMenuManager {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password")) {
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS menu(id INT, itemName VARCHAR(50), price DOUBLE)");
            stmt.execute("INSERT INTO menu VALUES (1, 'Pizza', 150.0)");
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM menu WHERE price < 200.0");
            while (rs.next()) {
                System.out.println(rs.getString("itemName"));
            }
            
            stmt.executeUpdate("UPDATE menu SET price = 180.0 WHERE id = 1");
            stmt.executeUpdate("DELETE FROM menu WHERE id = 1");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
