/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author x
 */
public class Kontak {
    static Connection conn;

    Integer id;
    String nomor;
    String nama;
    String kategori;

    public Kontak(Integer id, String nomor, String nama, String kategori) {
        this.id = id;
        this.nomor = nomor;
        this.nama = nama;
        this.kategori = kategori;
    }

    public void insert() {
        Kontak.createTableIfNotExists();

        try (var stmt = conn.createStatement()) {
            String insertSQL = "INSERT INTO kontak"
                    + " (nomor, nama, kategori)"
                    + " VALUES ('%s', '%s', '%s');".formatted(this.nomor, this.nama, this.kategori);
            stmt.execute(insertSQL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update() {
        Kontak.createTableIfNotExists();

        try (var stmt = conn.createStatement()) {
            String updateSQL = "UPDATE kontak"
                    + " SET nomor = '%s',".formatted(this.nomor)
                    + " nama = '%s',".formatted(this.nama)
                    + " kategori = '%s'".formatted(this.kategori)
                    + " WHERE kontak.id = %d;".formatted(this.id);
            stmt.execute(updateSQL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        Kontak.createTableIfNotExists();

        try (var stmt = conn.createStatement()) {
            String deleteSQL = "DELETE FROM kontak"
                    + " WHERE kontak.id = %d;".formatted(this.id);
            stmt.execute(deleteSQL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createTableIfNotExists() {
        try (var stmt = conn.createStatement()) {

            // Membuat tabel jika belum ada
            String createTableSQL = "CREATE TABLE IF NOT EXISTS kontak ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT , "
                    + "nomor TEXT NOT NULL, "
                    + "nama TEXT NOT NULL, "
                    + "kategori TEXT NOT NULL"
                    + ");";
            stmt.execute(createTableSQL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean exists() {
        var semua = Kontak.getAll();
        for (var kontak : semua) {
            if (kontak.nomor.equals(this.nomor)) {
                return true;
            }
        }

        return false;
    }

    public static List<Kontak> getAll() {
        Kontak.createTableIfNotExists();

        List<Kontak> data = new ArrayList<>();
        try (var stmt = conn.createStatement()) {
            var rs = stmt.executeQuery("SELECT * FROM kontak");

            while (rs.next()) {
                data.add(new Kontak(
                        rs.getInt("id"),
                        rs.getString("nomor"),
                        rs.getString("nama"),
                        rs.getString("kategori")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }
}
