package Clases;

public class Jugador {
    private int id;
    private int edad;
    private Date f_nac;
    private double altura;
    private double peso;
    private String nombre, nombre_completo, posicion, Nacionalidad;
    
    public Jugador(String nombre, String nombre_completo, String posicion, Date f_nac, String nacionalidad, double altura, double peso) {
        this.nombre = nombre;
        this.nombre_completo = nombre_completo;
        this.f_nac = f_nac;
        this.posicion = posicion;
        Nacionalidad = nacionalidad;
        this.altura = altura;
        this.peso = peso;
    }
    public int getId() {
        return id;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public double getPeso() {
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
