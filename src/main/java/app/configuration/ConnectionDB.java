package app.configuration;

import java.sql.*;

import static app.constants.Constants.*;

public class ConnectionDB { // Esta clase cumple con la función de abrir y cerrar las conexiones

    public Connection getConnection() throws SQLException { // Para obtener la conexión le decimos al DriverManager que abra una conexión con los datos definidos en las ctes
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD); // Retorna un objeto de tipo Connection
    }

    // Todas estas demás son para cerrar las conexiones que voy a usar más adelante

    public void close(ResultSet rs) throws SQLException {
        rs.close();
    }

    public void close(Statement smtm) throws SQLException {
        smtm.close();
    }

    public void close(PreparedStatement smtm) throws SQLException {
        smtm.close();
    }

    public void close(Connection conn) throws SQLException{
        conn.close();
    }
}
