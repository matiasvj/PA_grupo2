package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    
    public int insertJugador(Jugador j){
        int id_generado;
        try {
            String nombre = j.getNombre(), nom_completo = j.getNombre_completo();
            String lugar_nac = j.getNacionalidad(), posicion = j.getPosicion(), fecha_nac = j.getF_nac().DateToString();
            Double altura = j.getAltura(), peso = j.getPeso();
            
            String consulta = "insert into jugadores values ('"+nombre+"', '"+nom_completo+"', '"+fecha_nac+"',"+
                              " '"+posicion+"', '"+lugar_nac+"', '"+altura+"', '"+peso+"')";
            
            st.executeUpdate(consulta);
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
    
    public ResultSet selectPartidosNoFinalizados(){
        ResultSet res;
        try {
            res = st.executeQuery("SELECT * FROM partidos WHERE finalizado = '0'");
            return res;
        } catch (SQLException ex) {
             System.out.println(ex.toString());
              return null;
        }
    }
    public ResultSet selectPartidos(Integer id){
        ResultSet retorno;
        try {
            retorno = st.executeQuery("select * from partidos p, equipos e1, equipos e2 where ID_Partido='"+id+"' and p.equipolocal = e1.id_equipos and p.equipovisita = e2.id_equipos");
            return retorno;
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
            return null;
        }
    }
    public void asignarDividendo(int id, double local, double visita, double empate){
        try {
            st.executeUpdate("UPDATE partidos set divlocal = "+local+", divvisita = "+visita+", divempate = "+empate+" where id_partido = "+id+" ");
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
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
                              " where jp.id_equipo = "+id+" and j.id_jugador = jp.id_jugador";
        
            retorno = st.executeQuery(consulta);
            return retorno;
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
        }
    }
    
    public void insertEquiposALiga(int id_c, List <Integer> ids, List <Double> dividendos){
        try{
            for (int i=0; i<ids.size(); i++){
            st.executeUpdate("insert into liga_equipo (ID_Liga, ID_Equipo, Dividendo) values ("+id_c+","+ids.get(i+1)+","+dividendos.get(i+1)+")");
            }
        } catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public ResultSet selectPartidosCompeticion(int id_c){
     ResultSet retorno;
        try {
            retorno = st.executeQuery("select * from partidos p, equipos e, equipos e1 where id_comp="+id_c+" and p.Equipolocal = e.ID_equipos and p.equipovisita = e1.id_equipos order by fecha");
            return retorno;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public List ListarPartidosCompeticion(String nombre){
               
        List Lista = new ArrayList();
        List Nueva = new ArrayList();
        
        Lista=this.ObtenerPartidosCompeticion(nombre);
        
        for(int i=0; i < Lista.size(); i++){
            
            Nueva.add(this.BuscarNombreEquipo((Integer)Lista.get(i)));
            i++;
            Nueva.add(this.BuscarNombreEquipo((Integer)Lista.get(i)));            
            i++;
            Nueva.add(Lista.get(i));
            i++;
            Nueva.add(Lista.get(i));
            i++;
            Nueva.add(Lista.get(i));
            i++;
            Nueva.add(Lista.get(i));
        }
        
        return Nueva;
        }

    public List ObtenerPartidosCompeticion(String nombre){
        ResultSet res;
        List Lista = new ArrayList();
        try {
            res = st.executeQuery("select EquipoLocal,EquipoVisita,Fecha,Hora,Lugar,ID_Partido from partidos,competiciones where partidos.Id_Comp=competiciones.ID_Competicion and competiciones.Nombre='"+nombre+"'and partidos.divlocal>0 and partidos.finalizado=0 order by fecha");
           
            while(res.next()){                
                Lista.add(res.getObject(1));
                Lista.add(res.getObject(2));
                Lista.add(res.getObject(3));
                Lista.add(res.getObject(4));
                Lista.add(res.getObject(5));
                Lista.add(res.getObject(6));
            }                        
            return Lista;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }

    public List ObtenerJugador(String nombre){
        ResultSet res;
        List Lista = new ArrayList();
        try {
            res = st.executeQuery("select NombreCompleto from equipos, jugadores_equipos,jugadores where equipos.ID_Equipos=jugadores_equipos.Equipo and jugadores.ID_Jugador=jugadores_equipos.Jugador and equipos.Nombre='"+nombre+"'");
            
            while(res.next())
            {                
                Lista.add(res.getObject("NombreCompleto"));                
            }
            return Lista;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("Error"+ex.toString());
            return null;
        }
    }

    public void AgregarFinalizarPartido(int glocal, int gvisitante, List LocalJugadores,List VisJugadores,String Id)
    {
        String local;
        String vis;
        List JugadoresL=new ArrayList();
        List JugadoresV=new ArrayList();
        local=this.ObtenerIdEquipoL(Id);
        vis=this.ObtenerIdEquipoV(Id);
        
        JugadoresL=this.ObtenerListaIDJugador(LocalJugadores);
        JugadoresV=this.ObtenerListaIDJugador(VisJugadores);
        
        this.AgregarLVPartido(JugadoresL, JugadoresV, Id, local, vis);
        
        this.AgregarGoles(glocal, gvisitante, Id);
        
    }
    
    public String ObtenerIdEquipoL(String Id)
    {       
        ResultSet res;
        try{
        res = st.executeQuery("select EquipoLocal from partidos where ID_Partido='"+Id+"'");
            while(res.next())
            {
                return String.valueOf((Integer)res.getObject(1));
            }
        }
        
        
         catch (SQLException ex) {
             System.out.println(ex.toString());
             System.out.println("Error");
             
         }
        return null;
    }
    
    public String ObtenerIdEquipoV(String Id)
    {       
        ResultSet res;
        try{
            System.out.println("Exito 3");
            
        
        res = st.executeQuery("select EquipoVisita from partidos where ID_Partido='"+Id+"'");
            while(res.next())
            {
                return String.valueOf((Integer)res.getObject(1));
            }
        }
        
        
         catch (SQLException ex) {
             System.out.println(ex.toString());
             System.out.println("Error");
             
         }
        return null;
    }
    
    

    public List ObtenerListaIDJugador(List Jugador)
    {
        List Nuevo=new ArrayList();
        for(int i=0;i<Jugador.size();i++)
        {
            Nuevo.add(this.ObtenerIDJugador(Jugador.get(i)));
        }
        return Nuevo;
    }
    public Object ObtenerIDJugador(Object nombre){
        ResultSet res;
        try {
            res = st.executeQuery("select ID_Jugador from jugadores where NombreCompleto='"+nombre+"'");
            while(res.next())
            {
                return res.getObject(1);
            }
            return null;
        }
         catch (SQLException ex) {
             System.out.println(ex.toString());
             System.out.println("Error");
             return null; 
         }
    }
    
    public void AgregarLVPartido(List LocalJugadores,List VisJugadores, String Id, String Local, String Vis){
        try{
            
            for(int i=0;i<LocalJugadores.size();i++){                
                st.executeUpdate("insert into jugador_partido (ID_Partido, ID_Jugador, ID_Equipo) values ('"+Id+"','"+LocalJugadores.get(i)+"','"+Local+"')");
            }
            
            for(int i=0;i<LocalJugadores.size();i++){
                st.executeUpdate("insert into jugador_partido (ID_Partido, ID_Jugador, ID_Equipo) values ('"+Id+"','"+VisJugadores.get(i)+"','"+Vis+"')");
            }
            
            
        } catch (SQLException e){
            System.out.println("errorcompeticion"+e.toString());
           
        }
    } 
     
    public void AgregarGoles(int glocal, int gvisitante, String id){
        try {
            st.executeUpdate("update partidos set Goles_Local = "+glocal+", Goles_Visitante = "+gvisitante+" where ID_Partido = "+id+" ");
            st.executeUpdate("update partidos set finalizado=1 where ID_Partido = "+id+" ");
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }
    }
    
     public Object BuscarNombreEquipo(int nombre){
        ResultSet res;        
        try {
            res = st.executeQuery("select Nombre from equipos where ID_Equipos="+nombre+"");
            while(res.next()){
                return res.getObject(1);
            }
            return null;
        }
         catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("Error");
            return null;
        }
     }
}
