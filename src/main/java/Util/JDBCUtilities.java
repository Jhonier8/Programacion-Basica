package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {
    
    private static final String DATABASE_LOCATION = "C:\\Users\\Aspire 3\\OneDrive\\Escritorio\\BD\\ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:"+DATABASE_LOCATION;

        return DriverManager.getConnection(url);
    }
}
