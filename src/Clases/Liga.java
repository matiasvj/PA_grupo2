package Clases;

import java.util.List;

public class Liga extends Competicion {
    
    private List<Equipo> equipos;
    private List<Partido> partidos;
    
    public Liga(String nombre){
        super(nombre);
    }
    public List<Equipo> getEquipos() {
        return equipos;
    }
    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }
    public List<Partido> getPartidos() {
        return partidos;
    }
}
