/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Abel
 */
public class clsConexion {
    private static Connection cn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String  password = "";
    private static final String  url = "jdbc:mysql://localhost:3306/BDVenta";
    
public static Connection getConexion()throws Exception{ 
    
    try{
       Class.forName(driver);               
       cn= DriverManager.getConnection(url,user,password);
        if (cn != null) {
            System.out.println("Conexion establecida");
        }
    
}catch(Exception e){    
    throw e;    
}
  return cn;  
}

}
