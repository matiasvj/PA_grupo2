package Clases;

public class Individual extends Competicion {
    private Partido partido;
    
    public Individual(String nombre){
        super(nombre);
    }
    public Partido getPartido(){
        return partido;
    }
    public void setPartido(Partido partido){
        this.partido = partido;
    }
}
