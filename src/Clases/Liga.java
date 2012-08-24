package Clases;

import java.util.List;

public class Liga extends Competicion {
    
    private List<Equipo> equipos;
    private List<Partido> partidos;
    
    public Liga(String nombre){
        super(nombre);
    }
}
