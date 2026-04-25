package com.gla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class VehicleServiceCenter {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password")) {
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS vehicles(regNo VARCHAR(20), owner VARCHAR(50), status VARCHAR(20))");
            stmt.execute("INSERT INTO vehicles VALUES ('KA01AB1234', 'Bob', 'Pending')");
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM vehicles WHERE status = 'Pending'");
            while (rs.next()) {
                System.out.println(rs.getString("regNo") + " is Pending");
            }
            
            stmt.executeUpdate("UPDATE vehicles SET status = 'Completed' WHERE regNo = 'KA01AB1234'");
            stmt.executeUpdate("DELETE FROM vehicles WHERE status = 'Completed'");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
