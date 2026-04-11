package penjualan_rumah;

import java.sql.Connection;
import java.sql.DriverManager;

public class koneksi {

    public static Connection getKoneksi() {

        Connection conn = null;

        try {

            conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/db_penjualan_rumah",
            "root",
            ""
            );

            System.out.println("Koneksi berhasil");

        } catch (Exception e) {

            System.out.println("Koneksi gagal");
            System.out.println(e);

        }

        return conn;
    }
}