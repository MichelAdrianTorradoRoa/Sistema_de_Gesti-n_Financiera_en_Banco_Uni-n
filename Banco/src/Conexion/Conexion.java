/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

/**
 *
 * @author camper
 */
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author camper
 */
public abstract class Conexion {
    
    private static String url = "";
    public static Connection con = null;
    private static final String user = "campus2023";
    private static final String password = "campus2023";
    
        public static Conexion Conexionbd() {

        url = "jdbc:mysql://localhost:3306/banco_union";

        try {
            // Realizar la conexion
            con = DriverManager.getConnection(url, user, password);
            if (con != null) {
                DatabaseMetaData meta = con.getMetaData();
                System.out.println("Base de datos conectada " + meta.getDriverName());
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return (Conexion) con;
    }

    
}