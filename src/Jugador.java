
public class Jugador {
	private int id;
	private int edad;
	private Date f_nac;
	private float altura;
	private float peso;
	private String nombre, nombre_completo, posicion, Nacionalidad;
	
	public Jugador(int edad, float altura, float peso, String nombre,
			String nombre_completo, String posicion, String nacionalidad) {
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.nombre = nombre;
		this.nombre_completo = nombre_completo;
		this.posicion = posicion;
		Nacionalidad = nacionalidad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre_completo() {
		return nombre_completo;
	}
	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}
	public Date getF_nac() {
		return f_nac;
	}
	public void setF_nac(Date f_nac) {
		this.f_nac = f_nac;
	}
}

