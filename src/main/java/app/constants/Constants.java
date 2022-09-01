package app.constants;

public class Constants { // Ctes tanto para querys como para datos de conexión a la DB. All esto iría en el application.properties de un proyecto Spring
    /**
    * SQL querys person entity constant.
     */

    // Strings que representan consultas a la DB

    public static final String SQL_SELECT_PERSON = "SELECT id_persona, nombre, apellido, DNI FROM personas";
    public static final String SQL_INSERT_PERSON = "INSERT INTO persona(nombre, apellido, DNI) VALUES(?, ?, ?)";
    public static final String SQL_UPDATE_PERSON = "UPDATE persona SET nombre = ?, apellido = ?, DNI = ? WHERE id_persona = ?";
    public static final String SQL_DELETE_PERSON = "DELETE FROM persona WHERE id_persona = ?";

    /**
     * Variables de conexion a la base de datos.     */

    public static final String JDBC_URL = "jdbc:mysql://localhost:3307/curso_ayi_db?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    public static final String JDBC_USER = "root";
    public static final String JDBC_PASSWORD = "";
}
