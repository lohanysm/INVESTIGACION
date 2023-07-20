/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.investigacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Se va a configurar la conexion de JDBC-ODBC
 * 
 */
public class manualOdbc {
    /* primero se coloca el jdbc, luego el odbc y la base de datos 
    que se utilizara*/
    String url ="jdbc:odbc:prueba";
    /*Aqui inicializo las variables que voy a utilizar*/
    PreparedStatement sentencia;
    ResultSet resultado;
    Connection conexion;
    private String usuario="root";
    private String contrasena = "0000";
  
    /*Creo un metodo para conectar el jdbc con el odbc y hago una consulta de prueba*/
    
    public void conectarJdbcOdbc(){
        
        try {
            conexion = DriverManager.getConnection(url,usuario,contrasena);
            sentencia = conexion.prepareStatement("SELECT *FROM datos");
            resultado = sentencia.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(manualOdbc.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
    }
/* cre un metodo para mostrar los datos de la consulta */
    public void mostrar() throws SQLException{
        while(resultado.next()){
            System.out.println("nombre: " + resultado.getString("nombre")+
                    " Cedula: " + resultado.getString("cedula")+
                     " Edad: " + resultado.getString("edad"));
        }
    
    }
    /*Sobre escribo el metodo to String*/

}
