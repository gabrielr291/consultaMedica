/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Duoc
 */
public class conexionSQL {
    private Connection cone;

    public conexionSQL() {
        conectar();
    }

    public Connection getCone() {
        return cone;
    }
    public void conectar(){
        try{
            Class.forName ("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/clubdeportivo";
            String usu="root";
            String pas="";
            System.out.println("conectando");
            cone= DriverManager.getConnection(url,usu,pas);
            System.out.println("conectado");
        }catch (ClassNotFoundException|SQLException ex){
            System.out.println("error"+ex.getMessage());
        }
    }  
}
