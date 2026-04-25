package com.gla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class BookstoreSalesTracking {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password")) {
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS sales(id INT, bookName VARCHAR(100), quantity INT, price DOUBLE)");
            stmt.execute("INSERT INTO sales VALUES (1, 'Book A', 2, 50.0)");
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM sales WHERE quantity > 1");
            while (rs.next()) {
                System.out.println(rs.getString("bookName"));
            }
            
            stmt.executeUpdate("UPDATE sales SET quantity = 5 WHERE id = 1");
            stmt.executeUpdate("DELETE FROM sales WHERE id = 1");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
