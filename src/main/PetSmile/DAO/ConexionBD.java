import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    public static Connection getConnection() throws SQLException {
        try {
            // Cargar el controlador JDBC específico de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Configuración de conexión a la base de datos MySQL
            private static final String URL = "jdbc:mysql://localhost:3306/clinica";
            private static final String USER = "";
            private static final String PASSWORD = "";

            // Devuelve una conexión a la base de datos MySQL
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Error al cargar el controlador JDBC de MySQL: " + e.getMessage());
        }
    }
}
