import java.util.List;

public class Equipo {
	private String id;
	private String nombre;
	private int dividendo_campeon;
	//List <Jugador> jugadores;
	
	public Equipo(String nombre, int dividendo_campeon) {
		this.nombre = nombre;
		this.dividendo_campeon = dividendo_campeon;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDividendo_campeon() {
		return dividendo_campeon;
	}
	public void setDividendo_campeon(int dividendo_campeon) {
		this.dividendo_campeon = dividendo_campeon;
	}
	
	
}
