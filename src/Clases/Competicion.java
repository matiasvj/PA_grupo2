package Clases;

public class Competicion {
    private String id;
    private String nombre;
    
    public Competicion(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public String getId(){
        return id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
