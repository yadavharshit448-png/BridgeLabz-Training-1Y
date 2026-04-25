package com.gla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class EmployeeSalaryManager {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password")) {
            Statement stmt = conn.createStatement();
            
            // 1. Create table
            stmt.execute("CREATE TABLE IF NOT EXISTS employee(id INT, name VARCHAR(50), salary DOUBLE)");
            
            // 2. Create (Insert)
            stmt.execute("INSERT INTO employee (id, name, salary) VALUES (1, 'Alice', 35000)");
            stmt.execute("INSERT INTO employee (id, name, salary) VALUES (2, 'Bob', 12000)");
            
            // 3. Read
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee WHERE salary > 30000");
            System.out.println("Employees with salary > 30000:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
            }
            
            // 4. Update
            stmt.executeUpdate("UPDATE employee SET salary = salary * 1.10");
            
            // 5. Delete
            stmt.executeUpdate("DELETE FROM employee WHERE salary < 15000");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
