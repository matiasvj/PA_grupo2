package Clases;

import java.util.List;

public class Equipo {
    private String id;
    private String nombre;
    private float dividendo_campeon;
    //List <Jugador> jugadores;
    
    public Equipo(String nombre, int dividendo_campeon) {
        this.nombre = nombre;
        this.dividendo_campeon = dividendo_campeon;
    }
    
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getDividendo_campeon() {
        return dividendo_campeon;
    }
    public void setDividendo_campeon(float dividendo_campeon) {
        this.dividendo_campeon = dividendo_campeon;
    }
}
