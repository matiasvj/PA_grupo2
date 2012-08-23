package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ManejadorBD {
    
    private final static String driver = "com.mysql.jdbc.Driver";
    private final static String bd = "jdbc:mysql://192.168.56.101:3306/grupo2";
    private final static String usuario = "grupo2";
    private final static String password = "pa2012";
    
    private Connection conexion;
    private java.sql.Statement st;
    
    private static ManejadorBD instancia = null;
    
    public static ManejadorBD getInstancia(){
        if(instancia == null){
            instancia = new ManejadorBD();
        }
        return instancia;
    }
    
    private ManejadorBD() {
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
    
    public void insertEquipo(Equipo equipo){
        String nombre = equipo.getNombre();
        try {
            int res = st.executeUpdate("insert into equipos values ('id', '"+nombre+"')");
        } catch (SQLException ex) {
            System.out.println("Error al realizar la consulta");
        }
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("No se pudo cerrar la conexion");
        }
    }
}