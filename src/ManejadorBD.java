
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class ManejadorBD {

	private final static String driver = "com.mysql.jdbc.Driver";
	private final static String bd = "jdbc:mysql://localhost:3307/bedelia";
	private final static String usuario = "root";
	private final static String password = "root";
	
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
	
	public void realizarConsulta(String consulta){
		try{
			ResultSet res = st.executeQuery(consulta);
			
		}
		catch(Exception e){
			System.out.println("No se pudo realizar la consulta");
		}
	}
}
