/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.*;
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Pedro
 */
public class BaseDatos {
    
    private final String URL = "jdbc:mysql://localhost:3306/";
    private final String DB = "pavisola";
    private final String USUARIO = "root";
    private final String PASSWORD = "";
    
    public Connection conexion = null;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection(URL+DB, USUARIO, PASSWORD);
            if(conexion != null){
                System.out.println("La conexión se ejecutó exitosamente");
            }
        } catch (SQLException sqle){
            sqle.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            return conexion;
        }
    }
    
}
