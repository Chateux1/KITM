package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Employee test = new Employee("Povilas", "Povilaitis", 2246.7);

        String url = "jdbc:mysql://localhost/my_first_database";

//        INSERT A NEW ENTRY TO THE DATABASE

//        String query = "INSERT INTO employees"
//                + "( name, surname, salary )"
//                + "VALUES ( ?, ?, ? )";
//
//        try {
//            Connection conn = DriverManager.getConnection(url, "root", "");
//            PreparedStatement st = ((Connection) conn).prepareStatement(query);
//            st.setString(1, test.getName());
//            st.setString(2, test.getSurname());
//            st.setDouble(3, test.getSalary());
//
//            st.executeUpdate();
//            System.out.println("Naujas irasas iterptas sekmingai");
//        } catch ( SQLException e ) {
//            System.out.println("Nepavyko prisijungti prie duomenu bazes");
//            e.printStackTrace();
//        }

//        EDIT AN EXISTING ENTRY

//        String query = "UPDATE employees SET salary = ? WHERE id = ?";
//
//        try {
//            Connection conn = DriverManager.getConnection(url, "root", "");
//            PreparedStatement st = conn.prepareStatement(query);
//            st.setDouble(1, 333.33);
//            st.setInt(2, 2);
//
//            st.executeUpdate();
//            st.close();
//
//            System.out.println("Irasas sekmingai paredaguotas");
//
//        } catch (SQLException e) {
//            System.out.println("Nepavyko prisijungti prie duomenu bazes");
//            e.printStackTrace();
//        }

//        DELETE AN EXISTING ENTRY

//        String query = "DELETE FROM employees WHERE id = ?";
//
//        try {
//            Connection conn = DriverManager.getConnection(url, "root", "");
//            PreparedStatement st = conn.prepareStatement(query);
//            st.setInt(1, 2);
//
//            st.executeUpdate();
//            st.close();
//
//            System.out.println("Irasas sekmingai istrintas");
//
//        } catch (SQLException e) {
//            System.out.println("Nepavyko prisijungti prie duomenu bazes");
//            e.printStackTrace();
//        }

//        PRINT SELECTION

        String query = "SELECT * FROM employees";

        try {
            Connection conn = DriverManager.getConnection(url, "root", "");

            PreparedStatement st = conn.prepareStatement(query);
//          Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            System.out.println("");

            while (rs.next()) {
                System.out.print(rs.getString("id") + " ");
                System.out.print(rs.getString("name") + " ");
                System.out.print(rs.getString("surname") + " ");
                System.out.print(rs.getString("salary") + " ");
                System.out.print(rs.getString("data") + "\n");
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Nepavyko prisijungti prie duomenu bazes");
            e.printStackTrace();
        }
    }
}
