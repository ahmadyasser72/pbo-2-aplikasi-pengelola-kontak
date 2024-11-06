
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteDatabase {

    private static final String DB_URL = "jdbc:sqlite:kontak.db"; // Ganti dengan path database kamu

    public static Connection connect() {
        Connection conn = null;
        try {
            // Membuat koneksi ke database SQLite
            conn = DriverManager.getConnection(DB_URL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
