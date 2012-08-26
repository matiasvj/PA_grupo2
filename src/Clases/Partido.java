package Clases;

import java.util.List;


public class Partido {
    private String id;
    private Date fecha;
    private String hora;
    private String lugar;
    private boolean finalizado;
    private int goles_local, goles_visita;
    private double div_local, div_empate, div_visita;
    private Equipo local, visitante;
    private List<Jugador> jugadores_local, jugadores_visita;

    public Partido(){
    }
    
    public Partido(String Id, Equipo Local, Equipo visitante){
        this.id=Id;
        this.local=Local;
        this.visitante=visitante;
    }
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

    public double getDiv_local() {
        return div_local;
    }

    public double getDiv_empate() {
        return div_empate;
    }

    public double getDiv_visita() {
        return this.div_visita;
    }

    public Equipo getLocal() {
        return this.local;
    }

    public Equipo getVisitante() {
        return this.visitante;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public void setGoles_local(int goles_local) {
        this.goles_local = goles_local;
    }

    public void setGoles_visita(int goles_visita) {
        this.goles_visita = goles_visita;
    }

    public void setDiv_local(double div_local) {
        this.div_local = div_local;
    }

    public void setDiv_empate(double div_empate) {
        this.div_empate = div_empate;
    }

    public void setDiv_visita(double div_visita) {
        this.div_visita = div_visita;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public void setJugadores_local(List<Jugador> jugadores_local) {
        this.jugadores_local = jugadores_local;
    }

    public void setJugadores_visita(List<Jugador> jugadores_visita) {
        this.jugadores_visita = jugadores_visita;
    }
}
