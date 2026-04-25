package com.gla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class HospitalPatientRecordSystem {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password")) {
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS patients(id INT, name VARCHAR(50), disease VARCHAR(50))");
            stmt.execute("INSERT INTO patients VALUES (1, 'Tom', 'Flu')");
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM patients WHERE disease = 'Flu'");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " has " + rs.getString("disease"));
            }
            
            stmt.executeUpdate("UPDATE patients SET disease = 'Recovered' WHERE id = 1");
            stmt.executeUpdate("DELETE FROM patients WHERE disease = 'Recovered'");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
