package com.company;

import java.sql.*;
import java.util.ArrayList;

public class KnygaDAO {

    private static String url = "jdbc:mysql://localhost:3306/biblioteka?useUnicode=true&characterEncoding=utf-8";

    public static void insert(Knyga book) {

        String query = "INSERT INTO knygos "
                + "(vardas, pavarde, isleidimo_metai, leidimas, pavadinimas) "
                + "VALUES (?,?,?,?,?)";

        try {
            Connection conn = DriverManager.getConnection(url, "root", "");
            PreparedStatement st = conn.prepareStatement(query);

            st.setString(1, book.getVardas());
            st.setString(2, book.getPavarde());
            st.setInt(3, book.getIsleidimo_metai());
            st.setInt(4, book.getLeidimas());
            st.setString(5, book.getPavadinimas());

            st.executeUpdate();
            st.close();

            System.out.println("Įrašas sėkmingai pridėtas į duomenų bazę");

        } catch (SQLException e) {

            System.out.println("Įvyko klaidą bandant pridėti įrašą prie duomenų bazės");
            e.printStackTrace();
        }
    }

    public static ArrayList<Knyga> searchByBookTitle(String pavadinimas) {

        String query = "SELECT * FROM knygos WHERE pavadinimas = ? ORDER BY vardas ASC";

        ArrayList knygosList = new ArrayList<Knyga>();

        try {
            Connection conn = DriverManager.getConnection(url, "root", "");
            PreparedStatement st = conn.prepareStatement(query);

            st.setString(1, pavadinimas);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                knygosList.add(new Knyga(
                        rs.getInt("Id"),
                        rs.getString("vardas"),
                        rs.getString("pavarde"),
                        rs.getInt("isleidimo_metai"),
                        rs.getInt("leidimas"),
                        rs.getString("pavadinimas"))
                );
            }

            st.close();
            System.out.println("Paieška pagal knygos pavadinimą atlikta sėkmingai");

        } catch (SQLException e) {

            System.out.println("Klaida ieškant įrašo pagal knygos pavadinimą");
            e.printStackTrace();
        }

        return knygosList;
    }

    public static ArrayList<Knyga> searchById(int Id) {

        String query = "SELECT * FROM knygos WHERE Id = ?";

        ArrayList knygosList = new ArrayList<Knyga>();

        try {
            Connection conn = DriverManager.getConnection(url, "root", "");
            PreparedStatement st = conn.prepareStatement(query);

            st.setInt(1, Id);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                knygosList.add(new Knyga(
                        rs.getInt("Id"),
                        rs.getString("vardas"),
                        rs.getString("pavarde"),
                        rs.getInt("isleidimo_metai"),
                        rs.getInt("leidimas"),
                        rs.getString("pavadinimas")                        )
                );
            }

            st.close();
            System.out.println("Paieška pagal knygos id atlikta sėkmingai");

        } catch (SQLException e) {

            System.out.println("Klaida ieškant įrašo pagal knygos id");
            e.printStackTrace();
        }

        return knygosList;
    }

    public static void edit(Knyga book) {

        String query = "UPDATE knygos "
                + "SET vardas = ?, "
                + "pavarde = ?, "
                + "isleidimo_metai = ?, "
                + "leidimas = ?, "
                + "pavadinimas = ? "
                + "WHERE Id = ? ";

        try {
            Connection conn = DriverManager.getConnection(url, "root", "");
            PreparedStatement st = conn.prepareStatement(query);

            st.setString(1, book.getVardas());
            st.setString(2, book.getPavarde());
            st.setInt(3, book.getIsleidimo_metai());
            st.setInt(4, book.getLeidimas());
            st.setString(5, book.getPavadinimas());
            st.setInt(6, book.getId());

            st.executeUpdate();
            st.close();

            System.out.println("Įrašas sėkmingai pakoreguotas");

        } catch (SQLException e) {

            System.out.println("Klaida bandant redaguoti įrašą");
            e.printStackTrace();
        }
    }

    public static void delete(int id) {

        String query = " DELETE FROM knygos "
                + " WHERE id = ? ";

        try {
            Connection conn = DriverManager.getConnection(url, "root", "");
            PreparedStatement st = conn.prepareStatement(query);

            st.setInt(1, id);

            st.executeUpdate();
            st.close();

            System.out.println("Įrašas sėkmingai ištrintas");

        } catch (SQLException e) {

            System.out.println("Klaida bandant ištrinti įrašą");
            e.printStackTrace();
        }
    }

    public static int knyguIsleidimoMetai(int isleidimo_metai) {

        String query = "SELECT COUNT(isleidimo_metai) AS isleidimo_metai FROM knygos WHERE isleidimo_metai = ?";

        int count = 0;

        try {
            Connection conn = DriverManager.getConnection(url, "root", "");
            PreparedStatement st = conn.prepareStatement(query);

            st.setInt(1, isleidimo_metai);

            ResultSet rs = st.executeQuery();

            while(rs.next()) {
                count = rs.getInt(1);
            }

            st.close();
            System.out.println("Sėkmingai suskaičiuota kiek knygų atspausdinta per duotus metus.");

        } catch (SQLException e) {

            System.out.println("Klaida skaičiuojant kiek knygų atspausdinta duotaisiais metais");
            e.printStackTrace();
        }
        return count;
    }
}
