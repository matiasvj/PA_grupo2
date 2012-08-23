package Clases;
import java.sql.Connection;
import java.sql.DriverManager;


public class ManejadorBD {
    
    private final static String driver = "com.mysql.jdbc.Driver";
    private final static String bd = "jdbc:mysql://192.168.56.101:3306/grupo2";
    private final static String usuario = "grupo2";
    private final static String password = "pa2012";
    
    private Connection conexion;
    private java.sql.Statement st;
    
    public ManejadorBD() {
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection(bd, usuario, password);
            st = conexion.createStatement();
            System.out.println("Conexion exitosa");
        }
        catch(Exception e){
            System.out.println("No se pudo realizar la conexion");
        }
    }
    
    public java.sql.Statement getStatement(){
        return st;
    }
}