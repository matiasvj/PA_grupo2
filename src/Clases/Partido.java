package Clases;


public class Partido {
    private String id;
    private Date fecha;
    private String hora;
    private String lugar;
    private boolean finalizado;
    private int goles_local, goles_visita;
    private float div_local, div_empate, div_visita;
    private Equipo local, visitante;

    public Partido(Equipo local, Equipo visitante, Date fecha, String hora, String lugar) {
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.local = local;
        this.visitante = visitante;
        finalizado = false;
    }
    
    
}
