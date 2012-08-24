package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
        catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
    
    public java.sql.Statement getStatement(){
        return st;
    }
    
    public void insertEquipo(Equipo equipo){
        
        String nombre = equipo.getNombre(), id_generado;
        try {
            int res = st.executeUpdate("insert into equipos (Nombre) values ('"+nombre+"')");
            ResultSet max_id = st.executeQuery("select max(ID_Equipo) from equipos");
            max_id.next();
            id_generado = max_id.getString(1);
            equipo.setId(id_generado);
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void insertJugador(Jugador j){
        try {
            st.executeUpdate("insert into jugadores (Nombre_Jugador, NombreCompleto_Jugador, Posicion, Nacionalidad, Altura, Peso)"+
            "values ('"+j.getNombre()+"', '"+j.getNombre_completo()+"', '"+j.getPosicion()+"', '"+j.getNacionalidad()+"', '"+j.getAltura()+"', '"+j.getPeso()+"')");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public ResultSet selectJugador(Integer id){
        ResultSet res = null;
        try {
            res = st.executeQuery("select * from jugadores where ID_Jugador='"+id+"'");
            return res;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
        
    }
}