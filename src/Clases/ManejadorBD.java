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
            ResultSet max_id = st.executeQuery("select max(ID_Equipos) from equipos");
            max_id.next();
            id_generado = max_id.getInt(1);
            equipo.setId(id_generado);
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public int insertPartido(int id_l, int id_v, int id_c){
        int id_generado;
        try {
            st.executeUpdate("insert into partidos (ID_comp, EquipoLocal, EquipoVisita) values("+id_c+","+id_l+","+id_v+")");
            ResultSet max_id = st.executeQuery("select max(ID_Partido) from partidos");
            max_id.next();
            id_generado = max_id.getInt("id_partido");
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
            id_generado = max_id.getInt("id_competicion");
            return id_generado;
        } catch (SQLException e){
            System.out.println("errorcompeticion"+e.toString());
            return 0;
        }
    }
    
    public int insertJugador(Jugador j){
        int id_generado;
        try {
            st.executeUpdate("insert into jugadores (Nombre, NombreCompleto, Fecha_Nacimiento , Posicion, Nacionalidad, Altura, Peso)"+
            "values ('"+j.getNombre()+"', '"+j.getNombre_completo()+"','"+j.getF_nac().DateToString()+"', '"+j.getPosicion()+"', '"+j.getNacionalidad()+"', '"+j.getAltura()+"', '"+j.getPeso()+"')");
            ResultSet max_id = st.executeQuery("select max(id_jugador) from jugadores");
            max_id.next();
            id_generado = max_id.getInt("id_jugador");
            return id_generado;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return 0;
        }
    }
    
    public ResultSet selectJugador(Integer id){
        ResultSet res;
        try {
            res = st.executeQuery("select * from jugadores where ID_Jugador='"+id+"'");
            return res;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
        
    }
    
    public ResultSet selectEquipo(int id){
        ResultSet res;
        try {
            res = st.executeQuery("select * from equipos where ID_Equipos ="+id+"");
            return res;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
    
    public ResultSet selectLigas(){
        ResultSet res;
        try {
            res = st.executeQuery("SELECT * from competiciones WHERE tipo like '%liga%'");
            return res;
        } catch (SQLException ex) {
             System.out.println(ex.toString());
              return null;
        }
    }
    
    public ResultSet selectPartidos(){
        ResultSet res;
        try {
            res = st.executeQuery("SELECT * FROM partidos WHERE finalizado = '0'");
            return res;
        } catch (SQLException ex) {
             System.out.println(ex.toString());
              return null;
        }
    }
    
    public ResultSet dividendos(){
     ResultSet retorno;
        try {
            retorno = st.executeQuery("select * from partidos p, equipos e, equipos e1 where p.Equipolocal = e.ID_equipos and p.equipovisita = e1.id_equipos and divlocal ='0' and divvisita ='0' and finalizado = '0'order by fecha");
            return retorno;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public ResultSet selectJugadoresEquipo(int id){
        ResultSet retorno;
        try{
            String consulta = "select j.nombre from jugadores j, jugador_partido jp"+
                              "where jp.id_equipo = "+id+" and j.id_jugador = jp.id_jugador";
            retorno = st.executeQuery(consulta);
            return retorno;
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
        }
    }
}
