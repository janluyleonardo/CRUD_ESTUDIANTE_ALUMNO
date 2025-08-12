package proyecto_corte1;

import java.awt.HeadlessException;
import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;

import java.sql.SQLException;

public class Conectar_Proyecto1 {
    Connection Conect = null;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Conect = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/Proyecto_corte1","root","");
//            JOptionPane.showMessageDialog(null, "conectado");
            System.out.println("conectado a la base de datos Proyecto_corte1");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error" +e);
        }
        return Conect;
    }
    
}
