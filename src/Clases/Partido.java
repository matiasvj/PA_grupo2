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
    
    public String getId(){
        return id;
    }
    public Date getFecha(){
        return fecha;
    }
    public String getHora() {
        return hora;
    }
    public String getLugar() {
        return lugar;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public int getGoles_local() {
        return goles_local;
    }

    public int getGoles_visita() {
        return goles_visita;
    }

    public float getDiv_local() {
        return div_local;
    }

    public float getDiv_empate() {
        return div_empate;
    }

    public float getDiv_visita() {
        return div_visita;
    }

    public Equipo getLocal() {
        return local;
    }

    public Equipo getVisitante() {
        return visitante;
    }
    
}
