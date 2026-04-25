package com.gla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class ProductInventoryTracker {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password")) {
            Statement stmt = conn.createStatement();
            
            stmt.execute("CREATE TABLE IF NOT EXISTS product(pid INT, pname VARCHAR(50), qty INT)");
            
            stmt.execute("INSERT INTO product VALUES (1, 'Laptop', 5), (2, 'Mouse', 50), (3, 'Keyboard', 8)");
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM product WHERE qty < 10");
            System.out.println("Low stock products:");
            while (rs.next()) {
                System.out.println(rs.getString("pname") + " - Qty: " + rs.getInt("qty"));
            }
            
            stmt.executeUpdate("UPDATE product SET qty = qty + 10 WHERE pid = 1");
            stmt.executeUpdate("DELETE FROM product WHERE pid = 2");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
