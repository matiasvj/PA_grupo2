
public class Usuario {
    private String id;
    private String nombre;
    
    Usuario(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getId(){
        return id;
    }
}
