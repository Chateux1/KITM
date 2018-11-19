package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee test = new Employee("Povilas", "Povilaitis", 2246.7);

        String query = "INSERT INTO employees"
                + "( name, surname, salary )"
                + "VALUES ( ?, ?, ? )";

        String url = "jdbc:mysql://localhost/my_first_database";

        try {
            Connection conn = DriverManager.getConnection(url, "root", "");
            PreparedStatement st = ((Connection) conn).prepareStatement(query);
            st.setString(1, test.getName());
            st.setString(2, test.getSurname());
            st.setDouble(3, test.getSalary());

            st.executeUpdate();
            System.out.println("Naujas irasas iterptas sekmingai");
        } catch ( SQLException e ) {
            System.out.println("Nepavyko prisijungti prie duomenu bazes");
            e.printStackTrace();
        }
    }
}
