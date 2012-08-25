package Clases;

import java.util.List;

public class Equipo {
    private int id;
    private String nombre;
    private double dividendo_campeon;
    List <Jugador> jugadores;
    
    public Equipo(String nombre) {
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getDividendo_campeon() {
        return dividendo_campeon;
    }
    public void setDividendo_campeon(double dividendo_campeon) {
        this.dividendo_campeon = dividendo_campeon;
    }
    public List<Jugador> getJugadores() {
        return jugadores;
    }
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}    
