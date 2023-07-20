/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.investigacion;

import java.sql.SQLException;

/**
 *
 * @author almac
 */
public class prueba {
/*se coloca el exception debido al metodo mostrar*/
    public static void main(String[] args) throws SQLException {
        
        manualOdbc mo = new  manualOdbc();
        mo.conectarJdbcOdbc();
        mo.mostrar();
        
    }
}
