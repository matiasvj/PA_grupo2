package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

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
        
        String nombre = equipo.getNombre();
        int id_generado;
        try {
            int res = st.executeUpdate("insert into equipos (Nombre) values ('"+nombre+"')");
            ResultSet max_id = st.executeQuery("select max(ID_Equipo) from equipos");
            max_id.next();
            id_generado = max_id.getInt(1);
            equipo.setId(id_generado);
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public int insertPartido(int id_l, int id_v){
        int id_generado;
        try {
            st.executeUpdate("insert into partidos (ID_Equipo_Local, ID_Equipo_Visitante) values("+id_l+","+id_v+")");
            ResultSet max_id = st.executeQuery("select max(ID_Partido) from partidos");
            max_id.next();
            id_generado = max_id.getInt(1);
            return id_generado;
            
        } catch (SQLException e) {
            System.out.println("errorpartido"+e.toString());
            return 0;
        }
    }
    
    public int insertCompeticion(String nom, String tipo){
        int id_generado;
        try{
            st.executeUpdate("insert into competiciones (Nombre, Tipo) values ('"+nom+"','"+tipo+"')");
            ResultSet max_id = st.executeQuery("select max(ID_Competicion) from competiciones");
            max_id.next();
            id_generado = max_id.getInt(1);
            return id_generado;
        } catch (SQLException e){
            System.out.println("errorcompeticion"+e.toString());
            return 0;
        }
    }
    
    public void insertCompIndiv(int id_c, int id_p){
        try{
            st.executeUpdate("insert into individual (id_competicion, ID_Partido) values ("+id_c+","+id_p+")");
        } catch (SQLException e) {
            System.out.println("errorcompeticionInd"+e.toString());
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
    
    public ResultSet selectEquipo(Integer id){
        ResultSet res = null;
        try {
            res = st.executeQuery("select * from equipos where ID_Equipo='"+id+"'");
            return res;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
}
