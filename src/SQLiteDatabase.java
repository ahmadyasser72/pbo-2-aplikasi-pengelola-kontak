
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteDatabase {

    private static final String DB_URL = "jdbc:sqlite:kontak.db"; // Ganti dengan path database kamu

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }
}
