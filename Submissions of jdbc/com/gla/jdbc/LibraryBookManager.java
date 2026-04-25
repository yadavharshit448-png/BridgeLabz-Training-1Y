package com.gla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class LibraryBookManager {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password")) {
            Statement stmt = conn.createStatement();
            
            stmt.execute("CREATE TABLE IF NOT EXISTS books(id INT, title VARCHAR(100), author VARCHAR(50), status VARCHAR(10))");
            stmt.execute("INSERT INTO books VALUES (1, 'Java Basics', 'Author A', 'Available')");
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM books WHERE status = 'Available'");
            while (rs.next()) {
                System.out.println(rs.getString("title"));
            }
            
            stmt.executeUpdate("UPDATE books SET status = 'Issued' WHERE id = 1");
            stmt.executeUpdate("DELETE FROM books WHERE status = 'Lost'");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
