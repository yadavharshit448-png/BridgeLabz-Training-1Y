package com.gla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class CustomerContactDirectory {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password")) {
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS customers(id INT, name VARCHAR(50), phone VARCHAR(15))");
            stmt.execute("INSERT INTO customers VALUES (1, 'John Doe', '1234567890')");
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM customers WHERE name LIKE '%John%'");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " " + rs.getString("phone"));
            }
            
            stmt.executeUpdate("UPDATE customers SET phone = '0987654321' WHERE id = 1");
            stmt.executeUpdate("DELETE FROM customers WHERE id = 1");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
