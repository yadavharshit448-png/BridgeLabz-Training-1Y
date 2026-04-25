package com.gla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class SimpleBankingAccountManager {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password")) {
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS accounts(accNo INT, name VARCHAR(50), balance DOUBLE)");
            stmt.execute("INSERT INTO accounts VALUES (101, 'Alice', 15000.0)");
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM accounts WHERE balance > 10000");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " " + rs.getDouble("balance"));
            }
            
            stmt.executeUpdate("UPDATE accounts SET balance = balance + 500 WHERE accNo = 101");
            stmt.executeUpdate("DELETE FROM accounts WHERE accNo = 101");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
